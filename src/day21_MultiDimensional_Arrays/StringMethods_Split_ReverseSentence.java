package day21_MultiDimensional_Arrays;

import java.util.Arrays;

public class StringMethods_Split_ReverseSentence {
    public static void main(String[] args) {

        String name = "Java"; // 'J','a','v','a'

        char[] chars = name.toCharArray();
         System.out.println(chars[0]); //J
         System.out.println(chars[3]); //a
       // System.out.println(chars[4]); //ArrayIndexOutOfBoundsException: 4


        String str = "I like Java";

        String[] arr = str.split(" ");

        System.out.println(Arrays.toString(arr)); //[I, like, Java]

        /*
        reverse sentence =day great is today
         */

        String sentence = "Today is great day";
        String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words)); //[Today, is, great, day]
        String result="";

        for(int i =words.length-1; i >= 0; i--){
            String eachWords = words[i];
            result+=eachWords+" ";

           // System.out.print(eachWords+" "); //day great is Today
        }
        System.out.print(result); //day great is Today


        System.out.println();

        String str2 = "ABCDEF";
        String arr2[]= str2.split("");
        char[] ch2 = str2.toCharArray();

        System.out.println(Arrays.toString(arr2)); //[A, B, C, D, E, F]
        System.out.println(Arrays.toString(ch2)); //[A, B, C, D, E, F]



    }
}
