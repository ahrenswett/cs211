package Burger211;

public class Switzerland extends Burger211 {
    private static double discountRate = 0.0;

//    consider api calls to setter function to set current rates
    private static double exchangeRate = 0.96;  // foreign currency exchange rate

    private String burger1 = getName1(), burger2 = getName2(), burger3 = getName3();

    @Override
    void Menu(String franchiseName) {
        if(discountRate > 0){

// very repetative could be optimized all classes use this
            String p1 = df.format(getPrice1()*exchangeRate*(1.0-discountRate));
            burger1 += " / $" +p1+ " (was:" + getPrice1()*exchangeRate;

            String p2 = df.format(getPrice2()*exchangeRate*(1.0-discountRate));
            burger2 += " / $" +p2+ " (was:" + getPrice2()*exchangeRate;

            String p3 = df.format(getPrice3()*exchangeRate*(1.0-discountRate));
            burger3 += " / $" +p3+ " (was:" + getPrice3()*exchangeRate;
        }else{
            burger1 += " / " + "$" + df.format(getPrice1()*exchangeRate) ;
            burger2 += " / " + "$" + df.format(getPrice2()*exchangeRate);
            burger3 += " / " + "$" + df.format(getPrice3()*exchangeRate) ;
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
