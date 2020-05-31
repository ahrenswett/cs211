
import java.util.*;


public class SetOperations{

    public static void main(String[] args) {
//          Create the lists
        Set<String> cs210 = new HashSet<>();
        Set<String> cs211 = new HashSet<>();
        Set<String> cs212 = new HashSet<>();
//        add the students
        cs210.add("Bill");
        cs210.add("Emma");
        cs210.add("Olivia");
        cs211.add("Emma");
        cs211.add("Olivia");
        cs211.add("Kim");
        cs212.add("Chloe");
        cs212.add("Jane");
        cs212.add("Olivia");
        cs212.add("Kim");
//        set up temp hashset
        HashSet<String> temp = new HashSet<>(cs210);
//        add all the cs 210 students
        temp.addAll(cs210);
//        retain the ones who made it to 212
        temp.retainAll(cs212);
//        Create a string builder
        StringBuilder str = new StringBuilder();
//        add defining phrase
        str.append("Students that took all 3 classes:");
//        append each student left in the list to the phrase
        for(String student: temp) {
            str.append(" "+student);
        }
//        Print the list
        System.out.println(str.toString());
//        clear the string
        str.delete(0,str.length());
//        clear the temp hashset
        temp.clear();
//        Add all students who took 210
        temp.addAll(cs210);
//        keep all who also took 211
        temp.retainAll(cs211);
//        remove any that continued to 212
        temp.removeAll(cs212);
//        add defining phrase
        str.append("Students that took CS210 & CS211:");
//        append each student left in the list to the phrase
        for(String student: temp) {
            str.append(" "+student);
        }
//        Print the list
        System.out.println(str.toString());
    }




}
