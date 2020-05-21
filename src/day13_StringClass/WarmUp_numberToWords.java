package day13_StringClass;

import java.util.Scanner;

public class WarmUp_numberToWords {
    public static void main(String[] args) {
        /*
         2. write a java program that can convert any given numbers between 0 ~ 9 to words,
         if the number is greater than 9 or less than zero, out put should be "Invalid".
            MUST use Scanner and switch statement*/

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number between 0~9 ");
        int num= scan.nextInt();
       switch (num) {
           case 0:
               System.out.println("zero");
               break;
           case 1:
               System.out.println("one");
               break;
           case 2:
               System.out.println("two");
               break;
           case 3:
               System.out.println("three");
               break;
           case 4:
               System.out.println("four");
               break;
           case 5:
               System.out.println("five");
               break;
           case 6:
               System.out.println("six");
               break;
           case 7:
               System.out.println("seven");
               break;
           case 8:
               System.out.println("eight");
               break;
           case 9:
               System.out.println("nine");
               break;
           default:
               System.out.println("invalid");
               break;
       }

          String result=(num==0)?"zero":(num==1)?"one":(num==2)?"two":(num==3)?"three":(num==4)?"four"
                     :(num==5)?"five": (num==6)?"six":(num==7)?"seven":(num==8)?"eight":(num==9)?"nine":"invalid";

           System.out.println(result);
        }

    }

