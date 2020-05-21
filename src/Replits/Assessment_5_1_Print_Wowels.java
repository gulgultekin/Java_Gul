package Replits;

import java.util.ArrayList;
import java.util.Scanner;

public class Assessment_5_1_Print_Wowels {
    /*
    Inputs:
String word;

Write a for loop that will loop through every letter of the input and print out just the vowels.
Sample input/outputs
HINT:  vowel is a letter representing a vowel sound, such as a, e, i, o, u.

In: howdyho
oo

In: huehuehuehue
ueueueue


In: poopoo what idk what im doing
ooooaiaio
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below


        char[] vowel ={'a','e','i','o','u'};
        String result="";
        char[] ch = word.toCharArray();

        for(char each: ch){
            for(char each2 : vowel){
                if(each==each2){
                    result+=each+"";
                }
            }
        }


        System.out.println(result);
    }
}

//            for (char each : ch) {
//                    for(char each2: vowel) {
//                    if (each==each2){
//                    result+=""+each;
//                    }
//                    }
//
//
//                    }