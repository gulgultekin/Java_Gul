package Replits;

import java.util.Scanner;

public class Methods_153 {
    /*
    Complete a void method printUniqueWords() that will print only unique words from an array of strings. Every single unique word should be printed from the new line.

Example:
input:[java, code, python, code, rust, code, rust]
output:
java
python
     */
    public static void main(String[] args) {


        String[] words = {"java", "code", "python", "code", "rust", "code", "rust"};

        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words){
        //WRITE YOUR CODE HERE

        for(int j=0; j<words.length; j++){
            int count =0;

            for(int i=0; i<words.length; i++){

                if(words[j]==(words[i])){
                    count++;
                }
            }
            if(count==1){
                System.out.println(words[j]);
            }
        }

}
}
