package Burger211;
//Api to utilize
//https://www.exchangerate-api.com/docs/java-currency-api

import java.text.DecimalFormat;



public abstract class Burger211 {
    //    declare Class vars
    DecimalFormat df = new DecimalFormat("#,###,##0.00");
    static private double price1, price2, price3;

//    these should be constructed  with access to toppings and price
//    all burger 211 should create all burgers

    private String name1="Inheritance Burger";
    private String name2="Overriding Burger";
    private String name3= "Polymorphism Burger";

    private String topping1="beef patty, tomato, onion, ranch source";
    private String topping2="beef patty, lime, onion, lettuce, tomato source";
    private String topping3="chicken breast, gallo, onion, ranch source";

    private String Promotion="";


//    declare abstract method to display menu for franchise
    abstract void Menu(String franchiseName);

    //    constructor calls a method that sets prices
    Burger211() {
//        burgers();
//        toppings();
        price();
    }

//    void burgers(){
//        String burger1 = this.name1;
//        String burger2 = this.name2;
//        String burger3 = this.name3;
//    }
//
//    void toppings(){
//        String topping1 = this.topping1;
//        String topping2 = this.topping2;
//        String topping3 = this.topping3;
//    }

    void price(){
        price1 = 5.00;
        price2 = 4.00;
        price3 = 5.50;
    }

//TODO: setup API
//    String url_str = "https://prime.exchangerate-api.com/v5/"+  +"/latest/USD";CURRENCY_API_KEY

    double getPrice1() {
        return price1;
    }

    double getPrice2() {
        return price2;
    }

    double getPrice3() {
        return price3;
    }

    String getName1() {
        return name1;
    }

    String getName2() {
        return name2;
    }

    String getName3() {
        return name3;
    }

    String getTopping1() {
        return topping1;
    }

    String getTopping2() {
        return topping2;
    }

    String getTopping3() {
        return topping3;
    }

    String getPromotion() {
        return Promotion;
    }

    void setPromotion(String promotion) {
        Promotion = promotion;
    }
}
