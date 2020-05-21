package Replits;

import java.util.Scanner;

public class Arrays_Reverse_Sentence_103 {
    public static void main(String[] args) {
        /*
        Given a String variable sentence, write code to get each word and assign to String reversed in reverse order.

        Example:
        sentence -> "Java is fun"
        reversed -> "fun is Java"
         */

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed = "";
        String[] words= sentence.split(" ");

        for(int i= words.length-1; i>=0; i--){
            String eachword= words[i];
            reversed += eachword +" ";
            reversed=reversed.trim();

        }
        System.out.println(reversed);



    }
}
