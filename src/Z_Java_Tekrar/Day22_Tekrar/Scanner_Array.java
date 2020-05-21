package Z_Java_Tekrar.Day22_Tekrar;

import java.util.Arrays;
import java.util.Scanner;

public class Scanner_Array {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
          /*Task02:
        1. Write a program that will take five Strings and save them into an array called arr.
        2. use for each loop to print out the first three letter of each element of arr, one per line.
        You can assume that every element of arr is at least 3 letters long.
            Example:
                arr -> ["apple", "banana"]
                prints: app
                        ban
         */
          String[] arr = new String[5];

          for(int j=0; j<arr.length; j++){
              arr[j] = scan.next();

          }
        System.out.println(Arrays.toString(arr));

          for(String each: arr){

              System.out.println(each.substring(0,3));
              System.out.println();
              System.out.println(""+each.charAt(0)+each.charAt(each.length()-1));
          }








    }
}
