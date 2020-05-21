package Replits;

import java.util.Arrays;

public class Methods_195 {
    /*
    Anagram is a word, phrase, or name formed by rearranging the letters of another, such as cinema, formed from iceman.

isAnagram method checks if word1 and word2 are anagram to each other then return a boolean.

each letter in word1 should appear in word2 exact number of times
ignore empty spaces
make your code case insensitive

Examples:

isAnagram("listen", "Silent") ==> true

isAnagram("earth", "heart") ==> true

isAnagram("star", "rats") ==> true

isAnagram("hi", "bye") ==> false

isAnagram("java", "cava") ==> false


     */
    public static void main(String[] args) {
        String str1= "e arth";
        String str2= "heart";
        System.out.println(isAnagram(str1,str2));
    }

    public static boolean isAnagram(String word1, String word2) {


        word1 = word1.replace(" ","").toLowerCase();
        word2 = word2.replace(" ","").toLowerCase();
        char[] ch =word1.toCharArray();
        char[] ch1=word2.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        return (Arrays.equals(ch,ch1));

//        word1 = word1.replace(" ","").toLowerCase();
//        word2 = word2.replace(" ","").toLowerCase();
//
//        char[] ch1 = word1.toCharArray();
//        char[] ch2 = word2.toCharArray();
//
//        Arrays.sort(ch1);
//        Arrays.sort(ch2);
//
//        boolean result;
//        if(Arrays.equals(ch1,ch2)) {
//            result = true;
//        }else {
//            result = false;
//
//        }
//        return result;

        }
    }


