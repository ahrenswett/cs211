//package CS211test1;
//
///*What output is produced by the following code? Explain how it works.
//
//Runtime poly
//each of these classes have methods that print their letter those store up in the stack and all print at once
//this one sets uses B uses A's static int i
//AB1
//This one A's value increases to 2 and B's value increses to 2 they are added together and then printed
//ABC4
//this one creates a new C but is so C increments each time the function is called it runs through all parent functions since d does not increment c is not incremented
//ABCD5
//
// */
//public class Q3{
//
//    public static void main(String[] args) {
//
//        A a= new B();
//
////        System.out.println(a.i);
//
//        B b= new C();
////      Points to both i's point to class A i
//        System.out.println(a.i+b.i);
//
//        C c= new D();
//
//        System.out.println(b.i +c.i);
//        System.out.println("lol");
//    }
//
//}
//
//
//class A{
//
//    static int i=0;
//
//    A(){
//        i++;
//
//        System.out.print("A");}
//
//}
//
//class B extends A{
//
//    static int i=0;
//
//    B(){
//        i++;
//        System.out.print("B");}
//
//}
//
//class C extends B{
//
//    static int i=0;
//
//    C(){
//        i++;
//
//        System.out.print("C");}
//
//}
//
//class D extends C{
//
//    D(){System.out.print("D");}
//
//}
//
//D