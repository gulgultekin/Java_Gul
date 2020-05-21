package day17_WhileLoops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

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

        int result=0;
        for(int i=1; true;){ //infinite loop, cunku iterator yok, sadece asagida no dersek looptan cikar

            System.out.println("enter first number");
            int num1=scan.nextInt();

            System.out.println("enter second number");
            int num2=scan.nextInt();

            System.out.println("enter math operator");
            String mathOp=scan.next();
           // char Operator=input.next().charAt(0); de kullanilabilir

            if(mathOp.equals( "+")){
            // if(operator=='+') seklinde yazilir
                result=num1+num2;

            } else if (mathOp.equals( "-")) {
              //else  if(operator=='-')
                result=(num1-num2);

            }else if(mathOp.equals( "*")){
                result=(num1*num2);

            }else if(mathOp.equals( "/")){
                result=(num1/num2);

            }else if(mathOp.equals( "%")){
                result=(num1%num2);

            }else{
                System.out.println("invalid operator");
            }

            System.out.println("Result is = "+ result);

            System.out.println("Do you want to calculate another numbers?");
            String answer=scan.next();

            if(answer.equalsIgnoreCase("no")){
                System.out.println("Thank you for using the calculator.");
                break;

            }


        }





    }
}
