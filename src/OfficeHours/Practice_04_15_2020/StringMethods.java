package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {


    /*
    String methods:
         toCharArray(): returns char array
         split():  splits the string
     */


    String str = "Cybertek";
    char[] ch1 =str.toCharArray();   //[C, y, b, e, r, t, e, k]
        System.out.println(Arrays.toString(ch1));

        System.out.println(str.length()==ch1.length); // true

      /*  str1 = "abc", str2 = "cab";
      once 1--array olustur
           2--sort
           3--System.out.println(Arrays_Pract.equals(ch2,ch3));

       */

        String str1 ="ABC";
        String str2 ="BAC";

        char[] ch2 =str1.toCharArray();
        char[] ch3 = str2.toCharArray();


        Arrays.sort(ch2);  // ABC
        Arrays.sort(ch3);  // ABC

        System.out.println(Arrays.equals(ch2,ch3)); // true


        System.out.println("===========================");

        String sentence = "I like to learn java";

        String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words)); //[I, like, to, learn, java]

        int totalWords = words.length;
        System.out.println(totalWords); // 5

        //reverse==> java learn to like I
        String reverse ="";

        for(int i= words.length-1; i>=0; i--){

           // System.out.print(words[i]+" "); // java learn to like I busekilde de olur
            reverse+=words[i]+" ";
        }

        System.out.println(reverse.trim()); //java learn to like I





}
}