package Tasks;

import java.util.Scanner;
/*
In this task, you need to slice an integer and print numbers one by one from new line.

Create a scanner object

Example # 1
-Display prompt: Enter your number:
12345
-Display prompt: 1
-Display prompt: 2
-Display prompt: 3
-Display prompt: 4
-Display prompt: 5

Example # 2

-Display prompt: Enter your number:
45678
-Display prompt: 4
-Display prompt: 5
-Display prompt: 6
-Display prompt: 7
-Display prompt: 8

Use / and % operators

 */
public class Replit_SliceNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your number: ");
        int number = scan.nextInt();
        int remainder;
        System.out.println(number);

        int newNumber= number / 10000;
        int digit1 = newNumber % 10;

        newNumber = number  / 1000;
        int digit2 = newNumber % 10;

        newNumber = number  / 100;
        int digit3 = newNumber % 10;

        newNumber = number  / 10;
        int digit4 = newNumber % 10;

        int digit5 = number % 10;

        System.out.println("digit1:" + digit1);
        System.out.println("digit2:" + digit2);
        System.out.println("digit3:" + digit3);
        System.out.println("digit4:" + digit4);
        System.out.println("digit5:" + digit5);


    }

}
