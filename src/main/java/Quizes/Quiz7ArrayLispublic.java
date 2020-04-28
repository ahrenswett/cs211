package Quizes;

import java.util.ArrayList;

class Quiz7ArrayListTest {

    public static void main(String args[]) {

        ArrayList<Character> myArrayList = new ArrayList<>();

        // create a list of people
        for (char c='a';c<='f';c++) {
            myArrayList.add(c);
        }

        // remove first two people from the list to make a team. Each team consists of captain and member.
        for (int i = 0; i < myArrayList.size(); i++){
            char captain = myArrayList.remove(i);
            char member = myArrayList.remove(i+1);
            System.out.println("Captain: "+ captain + " Member: "+member);
        }
    }
}
