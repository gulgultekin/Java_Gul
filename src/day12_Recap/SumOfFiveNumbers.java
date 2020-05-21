package day12_Recap;

import java.util.Scanner;

public class SumOfFiveNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter five numbers");

        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();
        double num4 = scan.nextDouble();
        double num5 = scan.nextDouble();

        double sum = 0;
        if (num1 > 0) {
            sum += num1;
        }
        if (num2 > 0) {
            sum += num2;
        }
        if (num3 > 0) {
            sum += num3;
        }
        if (num4 > 0) {
            sum += num4;
        }
        if (num5 > 0) {
            sum += num5;
        }

        System.out.println("Sum of the positive numbers are: " + sum);



        /*
        write a program that asks to enter 5 numbers and prints the numbers in ascending order
        ex: 5,4,7,3,8
        output: 3,4,5,7,8
        scanner
         */

    }
}
