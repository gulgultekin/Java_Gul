package day27_DateTime;

import java.util.Arrays;

public class WarmUp_FindMinimum {
    /*
    Warmup task:
        1. write a return method that can return the minimum number from an int array
        2. write a return method that can return the minimum number from a double array
                    NOTE: apply method overloading,  DO NOT USE SORT METHOD.
     */

    public static void main(String[] args) {
        int[] arr ={5,4,9,3,10,3,2};
        int result = minimumNumber(arr);
        System.out.println(result);

        double[] arr2 ={2.3, 4.5, 6.2, 1.3};
        double result2 = minimumNumber(arr2);
        System.out.println(result2);
    }


    public static int minimumNumber(int[] arr){

        Arrays.sort(arr);
        return arr[0];

    }

    public static double minimumNumber(double[] arr){
        Arrays.sort(arr);
        return arr[0];
    }






}
