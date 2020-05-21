package Replits;

import java.util.Scanner;

public class LastLetter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String word = scan.next();
        //WRITE YOUR CODE HERE

        int lenght=word.length();

        System.out.println(word.charAt(lenght-1));

        System.out.println("Please enter the text:");
        String str=scan.nextLine();
        int lenght1=str.length();
        System.out.println("Lenght is: "+lenght1);

    }
}
