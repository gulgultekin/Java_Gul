package Replits;

import java.util.Scanner;

public class Burger_Chicken {
    public static void main(String[] args) {
        /*
        a fast food company has two main order types, burger meal and chicken meal.
both have the same prices.
so if a cashier enters "burger" or "chicken " he will get the same price

a float : 10.0

this test can be done with one if.

check if in (string variable) equals "burger" or "chicken"  and output the price 10.0

also if input is "soda" output 2.0 (do this with another if)

for example:

in = "burger"

output: 10.0

in = "chicken "

output: 10.0

in = "soda"

output: 2.0

hint or operator in java is  ||

         */
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your order");
        String in = s.next();

        //your code here


        float price= 10.0f;
        float sodaPrice=2.0f;
        if(in.equalsIgnoreCase("burger")||in.equalsIgnoreCase("chicken")){
            System.out.println(price);
        }
        if(in.equalsIgnoreCase("soda")){
            System.out.println(sodaPrice);
        }







    }
}
