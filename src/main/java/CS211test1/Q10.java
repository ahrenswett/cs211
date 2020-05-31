package CS211test1;


    import java.util.*;
    public class Q10 {
        public static void main(String[] args) {

            ArrayList <String> list = new ArrayList<>();

            list.add("1"); list.add("2"); list.add("3");
            list.add("4"); list.add("5");


            for (int i= 0; i< list.size(); i++){
                Collections.rotate(list, i+1);
                System.out.println(list);
            }
        }

    }

