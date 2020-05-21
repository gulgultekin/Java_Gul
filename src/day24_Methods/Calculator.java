package day24_Methods;

import java.util.Scanner;

public class Calculator {

    public static void Calculation(double num1, double num2, char operator){

        switch(operator){
            case'+':
                System.out.println(num1 + num2);
                break;
            case'-':
                System.out.println(num1 - num2);
                break;
            case'*':
                System.out.println(num1 * num2);
                break;
            case'/':
                System.out.println(num1 / num2);
                break;
            case'%':
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("Invalid Operator");
        }

    }

    public static void main(String[] args) {

        Calculation(5, 9, '*');

        int a = 100;
        int b = 20;
        Calculation(a, b, '/');


        while (true) {

            Scanner scan = new Scanner(System.in);

            System.out.println("Enter num1: ");
            int num1 = scan.nextInt();

            System.out.println("Enter num2: ");
            int num2 = scan.nextInt();

            System.out.println("Enter opearator: ");
            char operator = scan.next().charAt(0);

            Calculation(num1, num2, operator); // result of calc.
            System.out.println("Do you want to continue? ");
            String answer = scan.next();

            while(!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("No"))){
                System.out.println("Invalid entry, please re-enter");
                System.out.println("Do you want to continue? ");
                answer= scan.next();
            }

             if (answer.equalsIgnoreCase("No")){
                 break;
             }

        }
    }
}
