package day22_Array_Loops_Practice;

import java.util.Arrays;

public class WarmUp_ {
    public static void main(String[] args) {
          /*
        warmup tasks:
    1. write a program that can reverse the array*/


        String sentence = "Today is Java";
        char[] ch = sentence.toCharArray();
        System.out.println(Arrays.toString(ch)); //[T, o, d, a, y,  , i, s,  , J, a, v, a]

        char[] reverse= new char[ch.length];

        for( int i=0; i< ch.length ; i++){
            reverse[ch.length-1-i]= ch[i];

        }
        System.out.println(Arrays.toString(reverse));


        /*
        int[] reverse =new int[num.length];

        for(int i=0; i<num.length; i++){

            reverse[num.length-1-i] = num[i];
        }
        System.out.println(Arrays_Pract.toString(reverse));
         */


        //2. write a program that sort the array in descending order

        String[] arr2 = {"Today is Java"};





    /*3. write a program that can return the number of appearances of "java" and "python" anywhere in the sentence
                (it's similar to the task 97 in repl.it, But this time you MUST use arrays and for each loop)
    4. write a program that can count the even and odd number from an array of integers
                        MUST use for each loop

         */

    }
}
