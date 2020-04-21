package cs211;

class A {
    int a = 1;
    int b = 2;

    public int getSum(int a, int b) {
        this.a+=a;
        this.b+=b;
        return this.a + this.b;
    }
}



class B extends A {
    int a = 3;
    int b = 4;

    public int getSum(int a, int b) {
        this.b=a;
        super.b=b+b;
        return super.a+this.b;
    }
}



public class Q3 {

    public static void main(String[] args){
        A a = new A();
        B b = new B();
        System.out.println(a.a + ", " + b.b);
        System.out.println(a.getSum(a.a, b.b));
        System.out.println(a.b + ", " + b.b);
        System.out.println(b.getSum(a.b, b.b));
        System.out.println(a.a+", "+a.b + ", " +b.a+", "+b.b);
    }
}
