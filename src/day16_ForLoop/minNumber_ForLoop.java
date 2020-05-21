package day16_ForLoop;

import java.util.Scanner;

public class minNumber_ForLoop {

    /*2. write a program that can ask the user "enter a number" five times and return the minimum number

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int minNum = 2147483647; // max integer num

        for (int i = 0; i < 5; i++) {
            System.out.println("enter a number");
            int num = scan.nextInt();
            if (num < i) {
                minNum = num;
            }
        }
        System.out.println("Minimum number is :" + minNum);
    }
}
