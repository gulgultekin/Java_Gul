package Replits;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_105_First_Last {
    public static void main(String[] args) {
        /*
        Given a String array words, iterate through each word
        and print first and last letter of each element in the format below.

Example:

words → ["hello", "why", "by", "apple" , "note"]
print → [ho, wy, by, ae, ne]

         */
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
        String[] res = new String[words.length];

        //TODO: Write your code below
        String result="";
        for(int i=0; i<words.length; i++){
            for(int j=0; j<words[i].length(); j++){
                result = "" +words[i].charAt(0) +words[i].charAt(words[i].length()-1);

            }
            res[i]= result;
            System.out.println((result));
        }

        System.out.println(Arrays.toString(res));


    }
}
