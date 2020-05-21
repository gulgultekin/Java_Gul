package Replits;

public class Methods_166_String_Merge {
    /*
    When gears merge and work together, one teeth from each one goes in order.
    Write a method mergeStrings hat will return the strings merged, one letter at a time, starting with one.
     Please note one and two can be of different lengths. Please look at below examples:

    s1 ==> "12345"
    s2 ==> "abcde"
    mergeStrings(s1,s2) ==> "1a2b3c4d5e"

    mergeStrings("wooden", "spoon") ==> "wsopoodoenn"

    mergeStrings("java", "selenium") ==> "jsaevlaenium"
    */
    public static void main(String[] args) {
        String str1 = "java";
        String str2 = "selenium";
        String result = mergeStrings(str1, str2);
        System.out.println(result);
    }

    public static String mergeStrings(String str1, String str2) {

        String result = "";

        if (str1.length() > str2.length()) {
            for (int i = 0; i < str2.length(); i++) {
                result +=""+ str1.charAt(i) + str2.charAt(i);
            }
            result += str1.substring(str2.length());

        } else if (str2.length() > str1.length()) {
            for (int i = 0; i < str1.length(); i++) {
                result +=""+ str1.charAt(i) + str2.charAt(i);
            }
            result += str2.substring(str1.length());

        } else {
            for (int i = 0; i < str1.length(); i++) {
                result += ""+str1.charAt(i) + str2.charAt(i);
            }
        }

        return result;
    }
}

