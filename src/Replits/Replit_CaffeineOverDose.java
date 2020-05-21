package Replits;

import java.util.Scanner;

public class Replit_CaffeineOverDose {
    public static void main(String[] args) {
        /*


Scientists estimate that roughly 10 grams of caffeine consumed at one time is a
lethal overdose.

Write a program with a variable that holds the number of milli-
grams of caffeine in a drink and outputs how many drinks it takes to kill a person.

Coffe 15 mg / 1000 mg
Cola 5mg /1000 mg

Please refer to the image above as an example and use any number of variables you want.
Dots mean a space in the image.
         */

       Scanner scan = new Scanner(System.in);

        System.out.println("please enter your drink type: ");
        String drinkType = scan.nextLine();

        System.out.println("Please enter number of miligrams in drink : ");
        double drinkSize = scan.nextDouble();

        //1 ounce==29.5735mg
        //for Cola caffeine  12
        if (drinkType.equalsIgnoreCase("Coffee") ) {
            double cafeineCoffee = drinkSize *15 /1000;

            if (cafeineCoffee >= 50 ) {
                System.out.println(drinkSize+ " mg of " + drinkType+ " is deadly ");
            } else {
                System.out.println(drinkSize+ " mg of " + drinkType+ " is OK ");
            }

        }


        if (drinkType.equalsIgnoreCase("Cola")) {
            double cafeineCola = drinkSize *5 /1000;
            if (cafeineCola >= 50 ) {
                System.out.println(drinkSize+ " mg of " + drinkType+ " is deadly ");
            } else {
                System.out.println(drinkSize+ " mg of " + drinkType+ " is OK ");
            }

        }




    }
}
