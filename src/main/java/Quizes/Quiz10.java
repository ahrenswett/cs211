package Quizes;

import java.util.HashMap;

public class Quiz10 {

    static int precedence(char c) {
//        declare hashmap
        HashMap<Character,Integer> map = new HashMap<>();
//        load hashmap
        map.put('+',1);
        map.put('-',1);
        map.put('*',2);
        map.put('/',2);
//        this was new to me  :) cool feature of hashmap :)
//        get the argument value if not found return 0
        return map.getOrDefault(c,0);
    }

    public static void main(String[] args){
        System.out.println(precedence('+'));
        System.out.println(precedence('/'));
        System.out.println(precedence('+'));
                System.out.println(precedence('-'));
                        System.out.println(precedence('@'));
    }

}
