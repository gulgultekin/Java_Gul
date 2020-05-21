package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoop_Practice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {


            System.out.println("Enter two numbers");
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();

            System.out.println("Addition of two number : " + (num1 + num2));
            System.out.println("Do you want to continue? ");
            String answer = scan.next();

            while(!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
                System.out.println("Invalid Entry, please enter yes or no ");
                answer = scan.next();
            }

            if(answer.equalsIgnoreCase("No")){
                System.out.println("thank you for using the calculator");
                break;
            }
        }
    }
}