package Encapsulation;

public class RunEncapTest {

    public static void main(String args[]) {

        EncapTest encap = new EncapTest( "James","12343ms",20 );

        System.out.print("Name : " + encap.getName() +
                " Age : " + encap.getAge());
    }
}