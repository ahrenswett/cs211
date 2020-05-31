package Quizes;

import java.util.*;

public class Quiz9 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        HashSet<Integer> hs = new HashSet<Integer>();
        HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();

        for (int i= 0; i<2; i++) {
//            this for loop starts by adding i to the array list then i+1
//            i + 1 on the first iteration equals 0 so it adds 0 then 1 so the array list is [0,1]
//            on second iteration it adds 1 then 2 so it looks like [0, 1, 1, 2]
            al.add(i);
            al.add(i+1);

//            It also is adding i to a hash set  so on the first iteration [0, 1]
//            on the second it will look like this [0, 1, 2] it will not add the one again but return false because it was not added
//            HashSets cannot contain duplicates
            hs.add(i);
            hs.add(i+1);

//            It also puts the current value of the arraylist[i] as the key arraylist[i+1] as the value into hashmap
//            in the first round [[0,1]]
//            in the second [[0,1],[1,1]]
            hm.put(al.get(i), al.get(i+1));

//            it then puts the current value stored at hashmap[i] and the value at hashmap[i+1] as a key value pair.
//            in the first round it gets 0 and 1 is returned to the function and it tries to get something that does not exist yet for a value so null is returned
//            so our hashmap looks like this [[0,1][1,null]] we do not have a value stored with a key of 1 yet so the value is null
//            in the second [[1,2],[1,null]
//            this happens again because the value is continually reaching out past what we have declared and overwriting the value we declared in the previous line of code
            hm.put(hm.get(i), hm.get(i+1));
        }

        System.out.println(al);
        System.out.println(hs);
        System.out.println(hm); // {key=value}.

    }

}
