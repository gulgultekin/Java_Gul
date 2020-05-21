package Replits;

import java.util.Arrays;

public class MethodsOverloading_176 {
    /*
    In this task, you need to write 2 methods findMax() that will find a maximum number in the array. First method should work with array of integers (int[]) and return int, and second method should work with an array of doubles (double[]) and return double as a result.
Methods must have the same name and different parameters.
Fo more information:  https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html

Comment: Methods should be non static and with a return type.
     */
    public static void main(String[] args){

        int[] arr1 ={1,3,5,6};
        int result1 = findMax(arr1);
        System.out.println(result1);

        double[] arr2 ={1.5,5.4,3.2};
        double result2= findMax(arr2);
        System.out.println(result2);

    }


    public static int findMax(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];

    }

    public static double findMax(double[] arr){
        Arrays.sort(arr);
        double result =arr[arr.length-1];
        return result;
    }


}
