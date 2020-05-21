package Replits;

import java.util.Scanner;

public class printHalfTwice {
    /*
    Write a program that will print out first half of the word twice.

Example:

input: java
output: jaja
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        String firstHalf = "";

        int wordLength = word.length();
        int middleNumber= wordLength/2;

        firstHalf = word.substring(0,middleNumber);
        String output= "";

        if(wordLength%2 != 0){
            output= word.substring(0,middleNumber+1) + word.substring(0,middleNumber+1);

        }else{
            output= firstHalf + firstHalf    ;
        }
        System.out.println(output);



    }
}
