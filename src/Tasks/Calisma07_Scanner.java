package Tasks;

import java.util.Scanner;

public class Calisma07_Scanner {
    public static void main(String[] args) {
        /*
        Write a program that calculates the sum of maximum of 5 positive numbers entered by the user.
        If the user enters negative number or zero, it is skipped from calculation.
         */
        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter 5 number ");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int num4 = scan.nextInt();
        int num5 = scan.nextInt();

        int sum = 0;
        num1 = num1 > 0 ? num1 : 0;
        num2 = num2 > 0 ? num2 : 0;
        num3 = num3 > 0 ? num3 : 0;
        num4 = num4 > 0 ? num4 : 0;
        num5 = num5 > 0 ? num5 : 0;

        sum = num1+num2+num3+num4+num5;
        System.out.println("Sum = "+ sum);


    }
}
