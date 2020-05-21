package day14_StringClass;

import java.util.Scanner;

public class WarmUp_CombineTwoString {
    public static void main(String[] args) {
        /*
        1. Ask user to enter two words. Print the first word, second word, second word, first word
            Input:
                one
                two
            Output:
                onetwotwoone
                    DO NOT USE + OPERATOR
                    */

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter two words");

        String firstWord = scan.next();
        String secondWord = scan.next();
        String result = firstWord.concat(secondWord.concat(secondWord.concat(firstWord)));
        System.out.println(result);
        String result1=firstWord.concat(" "+secondWord).concat(" "+secondWord).concat(" "+firstWord);
        System.out.println(result1);






   /* 2. Ask user to enter two words. Print first word without its first character
   then print the second word without its first character.
            Input:
                apple
                banana
            Output:
                ppleanana
                */

        System.out.println("please enter two words");

        String str1 = scan.next();
        String str2 = scan.next();

        str1 = str1.substring(1); //(1,str1.lenght()) demek
        str2 = str2.substring(1); //(1, str2.length()) boyle de yazilabilir ama ihtiyac yok

        String result2 = str1.concat(str2);
        System.out.println(result2);



    }
}
