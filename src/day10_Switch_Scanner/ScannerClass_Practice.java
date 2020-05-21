package day10_Switch_Scanner;

import java.util.Scanner;

public class ScannerClass_Practice {

    public static void main(String[] args) {
        //write a program that asks user to enter num1 and num2 and prints the sum

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number : ");
          byte num1 = input.nextByte();

        System.out.println("Enter your second number : ");
          byte num2 = input.nextByte();

          int total = (num1+num2);
        System.out.println("The sum of "+num1+" and "+num2+ " is : " +total);
       //System.out.println("The sum of "+num1+" and "+num2+ "i s:" +(num1+num2));



    }
}
