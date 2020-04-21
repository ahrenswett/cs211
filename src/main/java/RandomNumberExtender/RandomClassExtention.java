package RandomNumberExtender;

import java.util.Random;

//TODO: Add a method that would be useful of my own



public class RandomClassExtention extends Random {

//    checks to see if low is less than high value
    private void checker(int low, int high){
        if(low > high){throw new IllegalArgumentException(" 1st argument must be greater than 2nd argument");}
    }



//    returns a random character
    public char rndmChar(){
        return (char)nextInt(65,255);
    }



//    Returns a random prime between 0 and
    public int rndmPrime(){
        int rndmP = nextInt(Integer.MAX_VALUE);
//        divide the number by all numbers from 2(inclusive) until itself(not inclusive)
//        if anything returns a remainder of 0 it is not a Prime get a new #
        for(int i = 2; i < rndmP; i++){
            if(rndmP %i == 0){
                i=1;
                rndmP = nextInt(Integer.MAX_VALUE);
            }
        }
        return rndmP;
    }



    public int nextInt(int low, int high){
        checker(low,high);
        int numberToReturn = Integer.MIN_VALUE;
//        determine if the number is in between arguments received if its not get a new number
        while (numberToReturn < low || numberToReturn > high){
            numberToReturn = super.nextInt();
        }
        return numberToReturn;
    }



    public int nextEven(int low, int high){
        checker(low,high);
        int numberToReturn = nextInt(low,high);
//        check to see if number generated is divisible by 2 if not get a new number
        while(numberToReturn %2 != 0){
            numberToReturn = nextInt(low,high);
        }
        return numberToReturn;
    }

//    Returns random odd number.
    public int nextOdd(int low, int high){
        checker(low,high);
        int numberToReturn = nextInt(low,high);
//        check to see if number generated is divisible by 2 if its not get a new number
        while(numberToReturn %2 == 0){
            numberToReturn = nextInt(low,high);
        }
        return numberToReturn;
    }

//    Returns random capitol letter
    public char nextCharCap(){
        return (char)nextInt(65,90);
    }

//    Returns random lowercase letter
    public char nextCharLow(){
        return (char)nextInt(97,122);
    }


//    Returns random capitol letter between specified value
    public char nextCharCap(char low, char high){
        checker(low,high);
//        checks input for range of capitol letters
        if(low < 65 || high > 90){
            throw new IllegalArgumentException(" please enter a number between 65 and 255 for low and high");
        }
        return (char) nextInt(low, high);
    }


// need to add a limit
    public char nextCharLow(char low, char high){
        checker(low,high);
//        checks input for range of lowercase letters
        if(low < 97 || high > 255){
            throw new IllegalArgumentException(" please enter a number between 65 and 255 for low and high");
        }
        return (char) nextInt(low, high);
    }


    public String nextWord(int length){
        StringBuilder str = new StringBuilder();
//        append random letters to the string builder to make a "word"
//        append a capitol first
        str.append(nextCharCap());
//        then append lowercase
        while(str.length() != length){
            str.append(nextCharLow());
        }
        return str.toString();
    }
}