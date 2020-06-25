package day52_Collection;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Practice {
    /*
    Tasks:
 1. write a program that can remove the duplicated characters from String without changing insertion order
 2. write a program that can identify if two strings are build out of the same letters
        ex:
            str1 = "abababa"
            str2 ="ab";
            output: true

     */
    public static void main(String[] args) {

                    //SHORTEST WAY

        String str = "ABABABCDEF";//["A","B","C","D","E","F"]
        String[]arr = str.split("");

       // System.out.println(Arrays_Pract.toString(arr)); //[A, B, A, B, A, B, C, D, E, F]

        str = new LinkedHashSet<>(Arrays.asList(arr)).toString().replace(",","");
        System.out.println(str);

        // bu da asagidakiyle ayni wihout loop

              //LONGER WAY
/*
        String str = "ABABABCDEF";//["A","B","C","D","E","F"]
        String[]arr = str.split("");
        str = "";

        for(String each: new LinkedHashSet<>(Arrays_Pract.asList(arr))  ){
            str += each;
        }

        System.out.println(str);//ABCDEF
        */

        //asagidakiyle ayni daha kisa  variable initiat yapmadan


               //LONGEST WAY
/*
        String str = "ABABABCDEF";//["A","B","C","D","E","F"]
       String[]arr = str.split("");
       // System.out.println(Arrays_Pract.toString(arr)); //[A, B, A, B, A, B, C, D, E, F]

        LinkedHashSet<String>ls = new LinkedHashSet<>(Arrays_Pract.asList(arr));
        System.out.println(ls); //[A, B, C, D, E, F] removed duplicates and sorted--> linked hashset-- not string

        String result = "";// string olarak sonuc almak icin

        for(String each: ls){
            result+=each;
        }

        System.out.println(result); //ABCDEF -->string
*/

    }
}
