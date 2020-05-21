package day26_Methods_Overloading;

import java.util.Arrays;

public class Method_Overloading2 {
    /*
    first method : print the sum of two numbers
    second method : print the sum of three numbers
    third method : print the sum of four numbers
     */

    public static void main(String[] args) {
        sum2Numbers(5,8);
        sum3Numbers(2,8,9);
        sum4Numbers(4,7,2,2);
        System.out.println("*******************************");

        sum(4,6,8,9);
        sum(1,4,6);
        sum(3,5);

        int[] arr1 ={3,2,1};
        char[] arr2 = {'z','s','k'};
        double[] arr3 ={3.4, 4.7, 5.5};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);// same method name different parameter-->overloaded method

    }

    public static void sum2Numbers(int a, int b){
        System.out.println(a+b);
    }


    public static void sum3Numbers(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public static void sum4Numbers(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }

//================================================================================================
    //OVERLOADING METHOD

    public static void sum(int a, int b){
        System.out.println(a+b);
    }

    public static void sum(int a, int b,int c){
        System.out.println(a+b+c);
    }

    public static void sum(int a, int b,int c,int d){
        System.out.println(a+b+c+d);
    }









}
