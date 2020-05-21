package day15_ForLoop;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
         write a program to identify if a string is palindrome or not.
          if yes==> true,.otherwise ==> false
                level ==> level ==> palindrome
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a word");
        String str=scan.nextLine();

        String reverse="";
         for(int i= str.length()-1; i>=0 ;i--){
             reverse=reverse+str.charAt(i);
         }
        System.out.println(reverse);

         boolean palindrome =str.equalsIgnoreCase(reverse);
        System.out.println("The word is palindrome: "+ palindrome);


    }
}
