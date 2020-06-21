package Stackulator;
import java.util.*;

public class testprep {
    public static void main(String[] args) {
        String post = "13+21-*";
        Stack<Integer> intSt = new Stack<Integer>();
        int value = 0;

        for (int k = 0; k < post.length(); k++) {
            char c = post.charAt(k);
            if (c >= '0' && c <= '9') {
                value = c - '0';
                intSt.push(value);
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                int value1 = (int) intSt.pop().data;
                int value2 = (int) intSt.pop().data;
                int newValue;
                if (c == '+') {
                    newValue = value1 + value2;
                    intSt.push(newValue);
                } else if (c == '-') {
                    newValue = value1 - value2;
                    intSt.push(newValue);
                } else if (c == '*') {
                    newValue = value1 * value2;
                    intSt.push(newValue);
                } else if (c == '/') {
                    newValue = value1 / value2;
                    intSt.push(newValue);
                }
            }
        }
        System.out.println("Evaluation: " + (int)intSt.pop().data);
        System.out.println();
    }
}

