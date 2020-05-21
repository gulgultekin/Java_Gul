package Replits;

import java.util.Scanner;

public class HasA_Java_Loop_String {
    public static void main(String[] args) {
        /*
        Given a string word, print true if "java" appears starting at index 0 or 1 in the string,
        such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string may be any length, including 0word = .
Example:
input: javapython
output: true

Example:
input: cjavac++
output: true


Example:
input: c#javaruby
output: false
         */
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if(word.substring(0).startsWith("java") ||word.substring(1).startsWith("java")){
            System.out.println(!exists);
        }else{
            System.out.println(exists);
        }





        /*
        if(word.substring(0).startsWith("java")||word.substring(1).startsWith("java")){
            System.out.println(!exists);
        }else{
            System.out.println(exists);
        }
*/
    }
}
