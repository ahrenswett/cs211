package Stackulator;

import java.util.*;

public class Stackulator {
    static HashMap<Integer, String> errorMessage = new HashMap<>();
    static HashMap<Character, Character> pair = new HashMap<>();

    private static void errorsPrep(){
        errorMessage.put((int)')', "Syntax Error: ) expected");
        errorMessage.put((int)'(', "Syntax Error: ( expected");
        errorMessage.put((int)'}', "Syntax Error: } expected");
        errorMessage.put((int)'{', "Syntax Error: { expected");
    }

    public static void setPair(){
        pair.put(')', '(');
        pair.put('}', '{');
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

    private static void bracketEvaluator(String[] arr){
        Stack<Character> brackets = new Stack();
        char temp = ' ';
        int location;
        int lastOpenB = 0;

        //        is for loop better? Matter of preference?
        for (String equation: arr) {
            location = -1;
            for (char chr : equation.toCharArray()) {
                location++;
                //            go throught the array and find any {( and push to stack
                if (chr == '(' || chr == '{') {
                    brackets.push(chr);
                    lastOpenB = location;
                }
                if (chr == ')' || chr == '}') {
                    if (brackets.isEmpty() || !pairOrNot((temp = ((char)brackets.pop().data)), chr)) {
                        //                 Throw an error
                        if (temp != pair.get(chr)) {
                            //                        TODO: add a for loop to push all characters keep track of location and push it in.
                            System.out.println(equation);
                            printError(lastOpenB, (int) pair.get(chr));
                        }
                    }
                }
            }
        }
    }



//transfer to infix


    public static void main(String[] args) {
        String[] statement = {"(1 + 3) * {2 - 1)", "(1 + 3 * (2 – 1)", "1 + 3) * (2 – 1)", "(1 + 3) * (2 – 1)" };
        errorsPrep();
        setPair();
        bracketEvaluator(statement);
    }

}
