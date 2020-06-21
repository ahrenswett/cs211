package ExecutionCompare;
import java.util.*;


/* Not preaty but gets it done cnat check add time of an empty array list so have to populate dummy data first*/


public class Comparor {
    private static ArrayList al = new ArrayList(5000);
    private static List list = new LinkedList();
    static double alEndTime, alStartTime;
    static double linkedEndTime, linkedStartTime;

    public static void main(String[] args) {
        for (int i = 0; i < 5000; i++) {
            al.add(i, 0);
            list.add(i);
        }
        add();
        search();
        remove();
    }

    static void add() {
        double totalArrayAddTime = 0.0;
        double totalLinkedAddTime = 0.0;
        Random rand = new Random();
        for (int i = 0; i < 5000; i++) {

            // generate an element
            int value = rand.nextInt(al.size()); // use random class
            String str = Integer.toString(value);

            //generate an index
            int index = rand.nextInt(al.size());


            alStartTime = System.currentTimeMillis();
            al.add(index, str);  // check exe time for this statement
            alEndTime = System.currentTimeMillis();

            linkedStartTime = System.currentTimeMillis();
            list.add(index, str); // check exe time for this statement
            linkedEndTime = System.currentTimeMillis();

            totalArrayAddTime += (alEndTime - alStartTime) / 1000;
            totalLinkedAddTime += (linkedEndTime - linkedStartTime) / 1000;

            System.out.println("adding to Array: "+ totalArrayAddTime);
            System.out.println("adding to linked list: " + totalLinkedAddTime);
        }
    }


    static void search() {
        double totalArraySearchTime = 0.0;
        double totalLinkedSearchTime = 0.0;
        Random rand = new Random();

        for (int i = 0; i < 5000; i++) {

            int value = rand.nextInt(al.size());
            String s = Integer.toString(value);

            int index = al.indexOf(s);
            if (index >= 0) {
                alStartTime = System.currentTimeMillis();
                al.get(index);
                alEndTime = System.currentTimeMillis();

                linkedStartTime = System.currentTimeMillis();
                list.get(index);
                linkedEndTime = System.currentTimeMillis();

                totalArraySearchTime += (alEndTime - alStartTime) / 1000;
                totalLinkedSearchTime += (linkedEndTime - linkedStartTime) / 1000;

                System.out.println("Searching Array: " + totalArraySearchTime);
                System.out.println("Searching LinkedList: " + totalLinkedSearchTime);
            }
        }
    }

    static void remove() {
        double totalArrayRemoveTime = 0.0;
        double totalLinkedRemoveTime = 0.0;
        Random rand = new Random();
        for (int i = 0; i < 5000; i++) {
            int value = rand.nextInt(al.size());
            String s = Integer.toString(value);

            alStartTime = System.currentTimeMillis();
            al.remove(value);
            alEndTime = System.currentTimeMillis();

            linkedStartTime = System.currentTimeMillis();
            list.remove(value);
            linkedEndTime = System.currentTimeMillis();

            System.out.println("Removing item from Array: " + totalArrayRemoveTime);
            System.out.println("Removing item from LinkedList: " + totalLinkedRemoveTime);
        }
    }
}