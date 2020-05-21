package day17_WhileLoops;

import java.util.Scanner;
import java.util.SortedMap;

public class WhileLoopPractice {
    public static void main(String[] args) {

        /*
        ask the user enter yes or no.
        if the user enters other than yes or no, repeat the previous step
         */

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter Yes or No");
        String word=scan.next();

        boolean valid=word.equalsIgnoreCase("Yes") || word.equalsIgnoreCase("No");

        while(!valid){ // while the input is not yes or no , repeat the question
            System.out.println("please re-enter");
            word=scan.next();
            int i=5;

            if(word.equalsIgnoreCase("Yes") || word.equalsIgnoreCase("No")){
                break;

            }

        }

      /*  if(word.equalsIgnoreCase("Yes")){
            System.out.println("Entered yes");
        }
        if(word.equalsIgnoreCase("No")){
            System.out.println("Entered no");
        }

*/


    }
}
