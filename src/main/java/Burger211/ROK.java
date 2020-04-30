package Burger211;

import java.text.DecimalFormat;

public class ROK extends Burger211 {
    static double exchangeRate = 1000;  // foreign currency exchange rate
    static double discountRate = 0.5;  // promotion 0.0~1.0
    String info1 = "", info2 = "", info3 = ""; // will be sent to GUI (see slide #23) as parametres.

    ROK() {
    } // constructor. Super class, Burger211, need to initialize first. Then KOREA will do next.
    // You must understand why.
    //
    // @Override

    String Menu(String franchiseName) {
        DecimalFormat df = new DecimalFormat("#,###,##0.0");

        if (discountRate>0.0) {

            String p1 = df.format(getPrice1()*(1.0-discountRate));
            info1 = name1 + " / " + "W" +p1 +" (was:" + getPrice1()+")";

            String p2 = df.format(getPrice2()*(1.0-discountRate));
            info2 = name2 + " / " + "W" +p2 +" (was:" + getPrice2()+")";

            String p3 = df.format(getPrice3()*(1.0-discountRate));
            info3 = name3 + " / " + "W" +p3 +" (was:" + getPrice3()+")";

        } else {

            info1 = name1 + " / " + "W" +getPrice1() ;
            info2 = name2 + " / " + "W" +getPrice2() ;
            info3 = name3 + " / " + "W" +getPrice3() ;
        }
        return null;

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

    public double getPrice3() {
        return (super.getPrice3() * exchangeRate);
    }

    @Override
    public String getAdvertising() {
        return "^ Buy One Get One ZERO % off - CS211 Student Only ^";
    }

}
