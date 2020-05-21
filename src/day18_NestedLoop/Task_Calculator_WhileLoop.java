package day18_NestedLoop;

import java.util.Scanner;

public class Task_Calculator_WhileLoop {
    public static void main(String[] args) {
/* 3.  write a program that can calculate the two numbers based on the user provided operators, the program will ask:
                        1. enter first number
                        2. enter the second number
                        3. enter the math operators
                                (assume that only the +, -, *, /, and % will be entered)
                        then the system will give the result based on the operator
                        at the end it will ask if the user want's to calculate another numbers, if user
                        entered "NO" or "no", the program will stop execution, otherwise it repeats all the previous steps
                                (you will need a lop that has true condition without the iterator)
         */

        Scanner scan = new Scanner(System.in);

        int result = 0;

        while (true) {

            System.out.println("Enter first number");
            int num1 = scan.nextInt();

            System.out.println("Enter second number");
            int num2 = scan.nextInt();

            System.out.println("Enter math operator");
            String mathOp = scan.next();

            if (mathOp.equals("+")) {
                result = num1 + num2;

            } else if (mathOp.equals("-")) {
                result = num1 - num2;

            } else if (mathOp.equals("*")) {
                result = num1 * num2;

            } else if (mathOp.equals("/")) {
                result = num1 / num2;

            } else if (mathOp.equals("%")) {
                result = num1 % num2;

            } else {
                System.out.println("Invalid operator");
            }

            System.out.println("Result is " + result);

            System.out.println();
            System.out.println("Do you want to continue? Yes or No ?");

            String input = scan.next();

            System.out.println();
                 while(!(((input.equalsIgnoreCase("yes"))||input.equalsIgnoreCase("no")))){
                System.out.println("please enter yes or no");
                input=scan.next();
            }
            if (input.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using my calculator");
                break;
            }
        }


    }
}

