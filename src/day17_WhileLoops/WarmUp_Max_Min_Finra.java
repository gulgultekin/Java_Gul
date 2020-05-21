package day17_WhileLoops;

import java.util.Scanner;

public class WarmUp_Max_Min_Finra {
    public static void main(String[] args) {
        /*
        Warmup tasks:
    1. write a program that can ask the user "enter a number" five times and return the maximum number
                hint: you will nedd for loop and if statement
                */
/*2. write a program that can ask the user "enter a number" five times and return the minimum number
                hint: you will nedd for loop and if statement
                */


        Scanner scan=new Scanner(System.in);

        int max= -2147483648; //(minimum int number)any number the user provided will be greater than this number
        int min = 2147483647;//(largest int number)
           // integer range is between -2.147.483.648 to 2.147.483.647

        for(int i = 1; i <= 5; i++){

            System.out.println("Enter a number");
            int num=scan.nextInt();

            if(num>max){ // to compare each user inputs, and assign the maximum number to max
                max=num;
            }
            if(num<min){
                min=num;
            }

        }
        System.out.println("Maximum number is: "+max);
        System.out.println("Minimum number is: "+min);





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
      for(int i=1; i<=2;){

       System.out.println("enter first number");
       int num1=scan.nextInt();

       System.out.println("enter second number");
       int num2=scan.nextInt();

       System.out.println("enter math operator");
       String mathOp=scan.next();

       if(mathOp.equals( "+")){
          result=num1+num2;

       } else if (mathOp.equals( "-")) {
           result=(num1-num2);

       }else if(mathOp.equals( "*")){
           result=(num1*num2);

       }else if(mathOp.equals( "/")){
           result=(num1/num2);

       }else if(mathOp.equals( "%")){
           result=(num1%num2);

       }
          System.out.println(result);

       System.out.println("Do you want to calculate another numbers?");
       String answer=scan.next();

       if(answer.equalsIgnoreCase("no")){
           System.out.println("we are done");
           break;

       }


   }
        System.out.println(result);


       /* 3. write a program which prints out the numbers from 1 to 30:
        1. for numbers which are divisible by 3, print "FIN" instead of the number.
        2. for numbers which are divisible by 5, print "RA" instead of the number
        3. for numbers which are a divisible by both 3 and 5, print "FFINRA" instead of the number
        Ex:
        1 2 FIN 4 RA FIND .... FINDRA
                */


       String result3="";


        for (int a = 1; a <= 30; a++) {

            if (a % 3 == 0 && a % 5 == 0) {
                // System.out.println(a+" FINRA ");
                result3+="FINRA ";

            } else if (a % 3 == 0 ) {
               // System.out.println(a + " FIN ");
                result3+="FIN ";

            }else if (a % 5 == 0) {
                //System.out.println(a+" RA ");
                result3+="RA ";

            }else{
                //System.out.println(a);
                result3+=a+" ";
            }
          }
        System.out.println(result3);
      }





    }

