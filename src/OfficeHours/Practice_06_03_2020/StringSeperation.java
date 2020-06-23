package OfficeHours.Practice_06_03_2020;

import java.util.Arrays;

public class StringSeperation {
  //Create a method that will accept a String of multiple words
  // separated by a space and return the String with which part reversed.

    public static void main(String[] args) {

        String str = "Gul Gultekin";// "lug niketlug"


        System.out.println(reverseEachWord(str));
    }

    public static String reverseEachWord(String str){

        String[]words = str.split(" ");
        System.out.println(Arrays.toString(words)); //[Gul, Gultekin]
        String finalWord="";

       for(String word: words){
           String rev="";
           for(int i=word.length()-1; i>=0; i--){
               rev+=word.charAt(i);
           }
           finalWord+=rev+" ";
       }


        return finalWord;
    }


}
