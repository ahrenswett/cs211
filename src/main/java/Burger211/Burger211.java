package Burger211;

public abstract class Burger211 {
    //    declare Class vars
    static private double price1, price2, price3;

     String name1="Inheritance Burger";
     String name2="Overriding Burger";
     String name3= "Polymorphism Burger";


     String topping1="beef patty, tomato, onion, ranch source";
     String topping2="beef patty, lime, onion, lettuce, tomato source";
     String topping3="chicken breast, gallo, onion, ranch source";

    private String Promotion="";


//    declare abstract method to display menu for franchise
    abstract String Menu(String franchiseName);

//    constructor calls a method that sets prices
    Burger211() {
        price();
    }

    void price(){
        price1 = 3.0;
        price2 = 2.0;
        price3 = 3.5;
    }





    public double getPrice1() {
        return price1;
    }

    public double getPrice2() {
        return price2;
    }

    public double getPrice3() {
        return price3;
    }

    public abstract String getAdvertising();
}
