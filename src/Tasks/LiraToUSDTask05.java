package Tasks;

import java.util.Scanner;

public class LiraToUSDTask05 {

    public static void main(String[] args) {

        // create a class called LiraToUSD, and write a program that can convert lira to dollars, and print the result

        double lira = 100;
        double USD = lira/6.15;
        System.out.println(lira + " Lira is equal to "+ USD + "USD");

        System.out.println("\n ***********************");

        //

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter any number : ");

        double myLira = scan.nextDouble();
        double myUSD = myLira/6.15;
        System.out.println(myLira + " Lira is equal to "+ myUSD + "USD");

    }
}
