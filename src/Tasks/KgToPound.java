package Tasks;

import java.util.Scanner;

public class KgToPound {
    public static void main(String[] args) {

        // create a class called KgTopounds, and write a program that can convert Kg to pound and print the result

        Scanner scan =new Scanner(System.in);
        System.out.println("please enter a number : ");
        double myKgValue = scan.nextDouble();

        // 1 pound = 0.45 kg

        double poundToKg = myKgValue * 0.45;
        System.out.println(myKgValue  + "kg = " + poundToKg + " pound.");


    }
}
