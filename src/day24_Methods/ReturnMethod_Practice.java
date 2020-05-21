package day24_Methods;

import java.util.Arrays;

public class ReturnMethod_Practice {
    //  4. creat a method that can print the maximum number from any given array

    public static void main(String[] args) {
        int[] arr ={9,4,6,22,4};

        int max = maxNumber(arr);

        int min = minNumber(arr);

        System.out.println(max);
        System.out.println(min);

    }

     public static int maxNumber(int[] arr){

         Arrays.sort(arr);

         return arr[arr.length-1];
     }

     public static int minNumber(int[] arr){

        Arrays.sort(arr);

        return arr[0];
    }



}
