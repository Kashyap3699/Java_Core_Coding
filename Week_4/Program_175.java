package Week_4;

import java.util.EnumSet;


enum Rates {

    USD("usd", 83.72),
    EURO("euro", 93.13),
    BRITISH_POUND("british pound", 110.42),
    AUSTRALIAN_DOLLAR("australian dollar", 56.70),
    CANADIAN_DOLLAR("canadian dollar", 61.60);

    private final String name;
    private final double rate;

    Rates(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public String getName() {
        return name;
    }
}

public class Program_175 {
    public static void main(String[] args) {
        EnumSet<Rates> rates = EnumSet.allOf(Rates.class);
        System.out.println("Currency convertion rates in exchange of indian rupee: ");
        for (Rates rate : rates) {
            System.out.println(rate.getName() + " rate :" + rate.getRate());
        }
    }
}
