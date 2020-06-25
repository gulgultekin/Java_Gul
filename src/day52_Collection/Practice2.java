package day52_Collection;

import java.util.Arrays;
import java.util.TreeSet;

public class Practice2 {
    /*
    1. write a program that can remove the duplicated characters from String
    2. write a program that can identify if two strings are build out of the same letters
        ex:
            str1 = "abababab" // ab==> ab
            str2 ="baba";  // ba ==> ab
            output: true
     */

    public static void main(String[] args) {
/*
        String str1 = "abababab";
        String str2 = "baba";

        String[] arr1 = str1.split("");
        String[] arr2 = str2.split("");

        TreeSet<String> t1 = new TreeSet<>(Arrays_Pract.asList(arr1));
        TreeSet<String> t2 = new TreeSet<>(Arrays_Pract.asList(arr2));

        System.out.println(t1); //[a, b]
        System.out.println(t2); //[a, b]

        str1 = t1.toString();
        str2 = t2.toString();

        System.out.println(str1.equals(str2)); //true

*/
             //daha kisa yol

        String str1 = "ababababC";
        String str2 = "baba";

       str1 =  new TreeSet<>( Arrays.asList(str1.split("")) ).toString();

        str2 =  new TreeSet<>( Arrays.asList(str2.split("")) ).toString();

        System.out.println(str1.equals(str2)); //false


    }

}
