package Tasks;

import java.util.Scanner;

public class PoundsToKg {
    //create a class called PoundsToKg , and write a program that can convert pounds to kg
    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);

    System.out.println("please enter a number : ");
    double myPoundsvalue = scan.nextDouble();

    // 1 kg = 2.20 pound

    double poundToKg = myPoundsvalue / 2.20 ;
        System.out.println(myPoundsvalue  + " pound = " + poundToKg + " kg.");
}
}

