 package Stackulator;

import java.util.*;

public class Stackulator {
    static HashMap<Integer, String> errorMessage = new HashMap<>();
    static HashMap<Character, Character> pair = new HashMap<>();
//    static HashMap<C>
    private static Stack<Character> characterStack;
    private static int answer;
//    private static String[] statement = {"*B+C/D " };
    public static void main(String[] args) {
        errorsPrep();
        setPair();
        stackulator("6 *3 + 2 / 1");
    }

    public static ArrayList<Integer> stackulator(String[] equations){
        ArrayList<Integer> answers = new ArrayList<>();
        for (String equation : equations) {
            System.out.println(answers.add(bracketEvaluator(equation)));
        }
        return answers;
    }

    public static int stackulator(String equation){
        return bracketEvaluator(equation);
    }



    private static void errorsPrep(){
        errorMessage.put((int)')', "Syntax Error: ) expected");
        errorMessage.put((int)'(', "Syntax Error: ( expected");
        errorMessage.put((int)'}', "Syntax Error: } expected");
        errorMessage.put((int)'{', "Syntax Error: { expected");
    }

    public static void setPair(){
        pair.put('(', ')');
        pair.put('{', '}');
    }

    public static void printError(int location, int errorNo){
        // print some empty spaces
        for (int i=0; i<location; i++){
            System.out.print(" ");
        }
        // print error mark
            System.out.print("^");
        //print an error message using errorMessage.get(errorNo)
        System.out.println(errorMessage.get(errorNo));
    }

    private static boolean pairOrNot(char b1, char b2){
        if(b1 == '(' && b2 != ')') return false;
        if(b1 == '{' && b2 != '}') return false;
        return true;
    }

    private static int bracketEvaluator(String equation)throws Error {
        characterStack = new Stack();
        char temp;
        int location = -1;
//        is for loop better? Matter of preference?
        for (char chr : equation.toCharArray()) {
            location++;
//            go throught the array and find any {( and push to stack
            if (chr == '(' || chr == '{') {
                characterStack.push(chr, location);
            }
            if (chr == ')' || chr == '}') {
                temp = (char) characterStack.pop().data;
                if (characterStack.isEmpty() || !pairOrNot((temp), chr)) {
                    //                 Throw an error
                    if (chr != pair.get(temp)) {
                        System.out.println(equation);
                        printError(location, (int) pair.get(temp));
                        throw new Error();
                    }
                }
            }
        }

        while (!characterStack.isEmpty()) {
            StackNode tmpNode = characterStack.pop();
            throw new Error("Unmatched Bracket Found: " + tmpNode.data + " at " + tmpNode.location);
        }
        return postFix(equation);
    }



//transfer to infix
    private static int postFix(String equation){
        characterStack = new Stack();
        String postfix = "";
        int[] numbers = new int[equation.length()];

        for(int i=0; i < equation.length(); i++ ) {
            char c = equation.charAt(i);
//            if (c == '(' || c == '{') characterStack.push(c);
            if (c >= '0' && c <= '9') postfix += c;
            if (c == '+' || c == '-' || c == '*' || c == '/'){
                characterStack.push(c);
                /*TODO: add priority Hashmap
                *  need to add a way to do numbers over 9 considered number node or array*/
            }
            if (c == '}' || c == ')') {
                StackNode holder;
//                check to make sure next is not null or open bracket
                while (!characterStack.isEmpty()){
                    holder = characterStack.pop();
                    if(holder.data != pair.get(c))
                    postfix += holder.data;
                }
            }
        }

        System.out.println(equation + " ---> " + postfix);
        return evaluator(postfix);
    }

    private static int evaluator(String postfix){
        int num1;
        int num2=0;
        Stack<Integer> numberStack = new Stack<Integer>();
        for(char chr: postfix.toCharArray()){
            if(chr >= '0' && chr <= '9'){
                int value = chr -'0'; // I like this gets the difference of the charCode Values to equal real #
                numberStack.push(value);
            }
            if(chr =='+' || chr=='-'|| chr=='*'|| chr=='/'){
                num1 = (int)numberStack.pop().data;

                if (chr == '+') {
                    num2 = (int)numberStack.pop().data;
                    System.out.println(num2 + " + " + num1);
                    num2 += num1;
                }
                if (chr == '-') {
                    num2 = (int)numberStack.pop().data;
                    System.out.println(num2 + " - " + num1);
                    num2 -= num1;
                }
                if (chr == '*') {
                    num2 = (int)numberStack.pop().data;
                    System.out.println(num2 + " * " + num1);
                    num2 *= num1;
                }
                if (chr == '/') {
                    num2 = (int)numberStack.pop().data;
                    System.out.println(num2 + " / " + num1);
                    num2 /= num1;
                }
                System.out.println("answer: " + num2);
                numberStack.push(num2);
            }
        }
        return answer;
    }

}
