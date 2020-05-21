package day16_ForLoop;

import java.util.Scanner;

public class maxNumber_ForLoop {
    public static void main(String[] args) {
        /*
        	1. write a program that can ask the user "enter a number" five times and return the maximum number
				hint: you will nedd for loop and if statement
				*/


        Scanner scan = new Scanner(System.in);

        int maxNum = -999999999;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            int num = scan.nextInt();
            if (num > maxNum) {
                maxNum = num;
            }
        }
        System.out.println("Maximum number is: " + maxNum);

    }
}
