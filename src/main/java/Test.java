
import java.util.*;


class Test {
    public static void main(String args[]) {

        ArrayList<Student> myArray = new ArrayList<>();

        String[] name= {"kim", "Emily", "Bill", "Ed"};

//        this was iterating through the wrong array.
//        upon creation of the Array list it will always be empty
//        as it was it never entered the for loop
        for(int i=0; i < name.length; i++){
            Student s = new Student(i,name[i]);
            myArray.add(s);

        }


//        go through each item in the array and get the name and ID
        for(Student s: myArray)
            System.out.println(s.getId() + " "+ s.getName());
    }

}


class Student {
//    private creates the need for getters and setters after instantiation
//    this is an example of encapsulation
    private int id;
    private String name;
    Student(int id, String name){
        this.id=id;
        this.name=name;
    }
// added getters, setters would be needed to change information after instantiation
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

/* desired output

0 kim

1 Emily

2 Bill

3 Ed
*/