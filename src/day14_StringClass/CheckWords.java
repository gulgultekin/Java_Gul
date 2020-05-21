package day14_StringClass;

import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {


    /*
    1. Write a program CheckWords:
	Program accepts 3 words and :
	- if they are same length:      print "All words are same length"
	- if some same length and others not:    print "Not Same nor Different lengths"
	- if all different length :  print "All different length"
	*/

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter first words");
        String word1 = scan.next();

        System.out.println("Enter second words");
        String word2 = scan.next();

        System.out.println("Enter third words");
        String word3 = scan.next();

        int lenght1= word1.length();
        int lenght2 = word2.length();
        int lenght3 = word3.length();

        boolean sameLenght= (lenght1==lenght2) && (lenght1==lenght3);
        boolean differentLenght =lenght1!=lenght2 && lenght1!=lenght3 && lenght2!=lenght3;

        if(sameLenght){
            System.out.println("All words are same length");
        }else if(differentLenght){
            System.out.println("All different length");
        }else{
            System.out.println("Not Same nor Different lengths");
        }









    }
}