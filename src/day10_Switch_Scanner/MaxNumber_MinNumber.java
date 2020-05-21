package day10_Switch_Scanner;

import java.util.Scanner;

public class MaxNumber_MinNumber {
    //write a program that asks user to enter three numbers
    //print out the max and min number

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);// object of the scanner

        System.out.println("Please enter your first number : ");
        int num1=scan.nextInt();

        System.out.println("Please enter your second number : ");
        int num2 = scan.nextInt();

        System.out.println("Please enter your third number : ");
        int num3 = scan.nextInt();

        int max= (num1 >= num2 && num1 >= num3)? num1  : (num2 >=num1 && num2 >= num3)? num2 : num3;

        System.out.println("Max number is : "+ max);

        int min = (num1<=num2 && num1<= num3)? num1 : (num2<=num1 && num2<=num3)? num2 : num3;

        System.out.println("Min number is : "+min);

        int medium = (num1<num2 && num1>num3 ||num1>num2 && num1<num3)? num1
                : (num2<num3 && num2>num1 ||num2>num3 && num2<num1)? num2 : num3;

        System.out.println("Medium number is : " + medium);




    }
}
