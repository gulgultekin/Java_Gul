package Replits;

import java.util.Scanner;

public class Arrays_Finding_Max_115 {
    public static void main(String[] args) {
        /*
        Given the array words, it will print the word with the largest length.
        Assume that there are no 2 words with longest length

        Example:
        words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
        prints jaaaaavvaaaaaaaaaa
         */
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();

        }

        //write your code below

       int maxIndex=0;
        String result= "";

        for(int i=0; i< words.length; i++){

            if(words[i].length()> maxIndex){
                maxIndex=words[i].length();
                result= words[i];
            }

        }
        System.out.println(result);
    }

    }









