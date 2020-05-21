package day14_StringClass;

import java.util.Scanner;

public class StartEndWords {
    public static void main(String[] args) {
        /*2. Write a program StartEndWords:
	  you have 2 words that must be 5 characters,
	  and check if last letter of first word and first letter of second work are same.

		if either one not 5 chars length:    print "need to be exactly 5 chars length"
		if last letter of 1st word and first letter of 2nd word match:  print "Fizz"
		if they do not match:  print "Buzz - did not match"

		pre condition: both words MUST have 5 characters
		*/

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter first words");
        String word1 = scan.next();

        System.out.println("Enter second words");
        String word2 = scan.next();

        int lenght1= word1.length();
        int lenght2 = word2.length();

        if(lenght1==5 && lenght2==5){
            if(word1.charAt(lenght1-1)==word2.charAt(0)){
            //last char in first word == first char in second word
                System.out.println("Fizz");
            }else{
                System.out.println("Buzz");
            }

        }else{
            System.out.println("need to be exactly 5 chars lenght");
        }


        System.out.println("***********************************");
        		/*
3. Ask user to enter a word. Print true is the first and last characters of the string are same characters, print false otherwise.
			Input:
				abba
			Output:
				true
				*/

        System.out.println("please enter a word");
        String str =scan.next();
        boolean bool =str.charAt(0)==str.charAt(str.length()-1);

        System.out.println("first and last characters are same?:"+ bool);

        System.out.println("*******************************");

				/*
4. Ask user to enter a word. Print "really?"  if the word ends with ly, print "never mind" otherwise.
			Input:
				Seriously
			Output:
				really?
     */

        System.out.println("enter a word");
        String str2= scan.next();
        if(str2.endsWith("ly")){
            System.out.println("really?");
        }else{
            System.out.println("never mind");
        }

    }
}
