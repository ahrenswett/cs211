package Burger211;

import java.text.DecimalFormat;

public class USA extends Burger211{
    private static double discountRate = 0.0;
    private String burger1 = getName1(), burger2 = getName2(), burger3 = getName3();

    USA(){};

    @Override
    void Menu(String franchiseName) {
//        set format for price
        if(discountRate > 0){

            String p1 = df.format(getPrice1()*(1.0-discountRate));
            burger1 += " / $" +p1+ " (was:" + getPrice1();

            String p2 = df.format(getPrice2()*(1.0-discountRate));
            burger2 += " / $" +p2+ " (was:" + getPrice2();

            String p3 = df.format(getPrice3()*(1.0-discountRate));
            burger3 += " / $" +p3+ " (was:" + getPrice3();
        }else{
            burger1 += " / " + "$" + df.format(getPrice1()) ;
            burger2 += " / " + "$" + df.format(getPrice2());
            burger3 += " / " + "$" + df.format(getPrice3()) ;
        }

        new MenuGUI(franchiseName,
                burger1, getTopping1(),
                burger2, getTopping2(),
                burger3, getTopping3(),
                getPromotion());
    }

    @Override
    public String getPromotion() {
        return null;
    }
}
