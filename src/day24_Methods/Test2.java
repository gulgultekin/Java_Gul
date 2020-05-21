package day24_Methods;

import Resources.Library;

import java.util.Arrays;


public class Test2 {

    public static void main(String[] args) {

        String str = "Gul Gultekin";

        String RevStr = Library.Reverse(str);

        System.out.println(RevStr);  // niketluG luG


        int[] arr = {2,6,7,4,9,-2};

        arr = Library.sortDesending(arr); // assign etmek gerekiyor  //[9, 7, 6, 4, 2, -2]

        System.out.println(Arrays.toString(arr));


        //remove dup from string
        // frequency of string
        // merge two array and return third one
        // max -min number

    }
}
