package CS211test1;

class A{

    int i = 2;

    public int mult(){return i*i;}

}

class B extends A{

    int i=1;

    B(int i) {

        this.i=i;

        super.i=super.i * this.i;

    }

    public int mult(){

        return super.i*this.i;

    }

}



public class Q4{

    public static void main(String[] args) {

        A a = new A();
//      declares its value to be the same as a but when A is instantiated it uses the function and returns i*i giving us for
        A b = new B(a.i);

        System.out.println(b.i);

        System.out.println(b.mult());

    }

}
