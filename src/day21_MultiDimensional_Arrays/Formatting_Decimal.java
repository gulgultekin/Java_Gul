package day21_MultiDimensional_Arrays;

import java.text.DecimalFormat;

public class Formatting_Decimal {
    public static void main(String[] args) {

        DecimalFormat DF = new DecimalFormat("0.00");

        double a =10.0/3.0;
        System.out.println(a);

        System.out.println(DF.format(a));

        System.out.println(2.345673);
        System.out.println(DF.format(2.345673));









    }
}
