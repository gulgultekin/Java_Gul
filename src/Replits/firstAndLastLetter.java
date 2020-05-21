package Replits;

import java.util.Scanner;

public class firstAndLastLetter {
    public static void main(String[] args) {
        /*
        Write a program that will print out first and last letters together.
         */

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
       char firstLetter= word.charAt(0);
       char lastletter = word.charAt(word.length()-1);
        System.out.println(""+firstLetter+lastletter);
    }
}
