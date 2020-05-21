package day20_ArraysContinue;

import java.util.Arrays;

public class Combine_TwoArray {
    public static void main(String[] args) {
        /*
        write a program that can combine two arrays of any length and return the third array
         arr1=[1,2,3];
         arr2=[4,5,6,7];
         arr3=[1,2,3,4,5,6,7];
         */

        int[] arr1 ={1,2,3};
        int[] arr2 ={4,5,6,7,8};
        int size1 = arr1.length;
        int size2 = arr2.length;

        int[] result = new int[size1+size2] ;

        for(int i= 0; i <arr1.length; i++){
            result[i]= arr1[i];

        }

        for (int i = size1; i < result.length; i++) {
            result[i] = arr2[i-size1];
        }


        System.out.println("Result:  "+Arrays.toString(result));
    }
}
