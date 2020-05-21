package day18_NestedLoop;

import java.util.Scanner;

public class WarmUp_DivideTwoNumbers {
    public static void main(String[] args) {
        /*
        warmup tasks:
	1. write a program that can divide two numbers.
			NOTE: DO NOT USE division, multiplication, or module operators

			10/3==>3 with aremainder of 1
			a = a - b = 7;
			a = a - b = 4;
			a = a - b = 1;
			count=3;  a=1;

			*/
        Scanner scan=new Scanner(System.in);

       int a =10;
       int b =3;

       if(b==0){
           System.out.println("divisor cannot be zero");
           System.exit(0); //break burada olmaz  loop da olur
       }

       int count=0; // count the execution of the loop

            while(a >= b){
                a-=b;
                count++;
            }

            if(a==0){
                System.out.println("The result of a/b is "+count);

            }else {

                System.out.println("The result of a/b is " + count + " with a remainder of: " + a); //gives remainder
            }


        System.out.println("******************************");


            /*2. write a program that can retunr the factorial number of any given number
			Ex:
				input: 5
				output: 120
			because:
				5! = 5 * 4 * 3 * 2* 1 = 120
         */

            System.out.println("Enter a number");
            int number= scan.nextInt();
            int factorial=1;

            while(number>0){
                factorial*=number;
                number--;

            }
            System.out.println(factorial);

        }
    }

