package day12_Recap;

import java.util.Scanner;

public class Ascending_Order {
    public static void main(String[] args) {

        /*
        write a program that asks to enter 5 numbers and prints the numbers in ascending order
        ex: 5,4,7,3,8
        output: 3,4,5,7,8
        scanner
         */
        Scanner scan=new Scanner(System.in);

        System.out.println("please enter three number");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        int result1 = 0;
        int result2=0;
        int result3=0;

        if (num1 < num2 && num1 <num3) {
            result1 = num1;
        }else if(num2<num1 &&num2<num3){
            result1 = num2;
        }else{
            result1=num3;
        }


        if(num1>num2 &&num1<num3 ||num1>num3 && num1<num2){
            result2=num1;
        }else if (num2>num1 && num2<num3 || num2>num3 && num2<num1){
            result2=num2;
        }else{
           result2=num3;
        }

        if(num1>num2 && num1>num3){
            result3=num1;
        }else if (num2>num1 && num2>num3){
            result3 =num2;
        }else{
            result3=num3;
        }
        System.out.println(result1+" "+ result2+ " "+ result3);
    }
}
