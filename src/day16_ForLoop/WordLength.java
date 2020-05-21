package day16_ForLoop;

import java.util.Scanner;

public class WordLength {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        /*3. write a program that can ask the user to "enter a word" five times and returns the word that has the maximum length
         */
        String maxStr="";

        for(int i=0; i<5; i++){

            System.out.println("enter a word");
            String word =scan.nextLine();

            if(maxStr.length()<word.length()){
                maxStr=word;
            }
        }

        System.out.println("Max word  is :"+ maxStr);

    }
}

