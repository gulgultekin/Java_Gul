package Replits;

import java.util.Scanner;

public class CharAt {
    public static void main(String[] args) {
        /*
        using charAt method output the 3th letter of txt string then the 5th letter then the 6th letter.

use print not println.
         */
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //your code here

        char ch1= txt.charAt(2);//5.letter
        char ch2=txt.charAt(4);
        char ch3=txt.charAt(5);
        System.out.print(ch1);
        System.out.print(ch2);
        System.out.print(ch3);


    }
}
