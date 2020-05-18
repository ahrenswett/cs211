package Burger211;

import java.text.DecimalFormat;

public class ROK extends Burger211 {
    private static double exchangeRate = 1000;  // foreign currency exchange rate
    private static double discountRate = 0.50;  // promotion 0.0~1.0
    private String info1 = getName1(), info2 = getName2(), info3 = getName3(); // will be sent to GUI (see slide #23) as parametres.

    ROK() { } // constructor. Super class, Burger211, need to initialize first.
    // You must understand why.
    //

    @Override
    void Menu(String franchiseName) {

        if (discountRate> 0.00) {
//            burger1 format if discount
            String p1 = df.format(getPrice1()*(1.00-discountRate));
            info1 += " / " + "W" +p1 +" (was: " + df.format(getPrice1())+")";
//            burger2 format if discount
            String p2 = df.format(getPrice2()*(1.00-discountRate));
            info2 += " / " + "W" +p2 +" (was: " + df.format(getPrice2())+")";
//            burger3 format if discount
            String p3 = df.format(getPrice3()*(1.00-discountRate));
            info3 += " / " + "W" +p3 +" (was: " + df.format(getPrice2())+")";
        } else {
//            burger format without discounts
            info1 += " / " + "W" + df.format(getPrice1()) ;
            info2 += " / " + "W" + df.format(getPrice2()) ;
            info3 += " / " + "W" + df.format(getPrice3()) ;
        }
        // call GUI
        new MenuGUI(franchiseName,
                info1, getTopping1(),
                info2, getTopping2(),
                info3, getTopping3(),
                getPromotion());

    }


    //    the following methods get the price of the Exchange rate and set the price of the burger specified accordingly
    @Override
    public double getPrice1() {
        return (super.getPrice1() * exchangeRate);
    }

    @Override
    public double getPrice2() {
        return (super.getPrice2() * exchangeRate);
    }

    @Override
    public double getPrice3() {
        return (super.getPrice3() * exchangeRate);
    }

    @Override
    public String getPromotion() {
        if(discountRate > 0) {
            //takes the discount rate and multiples it by 100 and casts as int to take from decimal to whole number
            return "^ Buy One Get One " + (int)(discountRate*100) + " % off - CS211 Student Only ^";
        }
        return null;
    }
}
