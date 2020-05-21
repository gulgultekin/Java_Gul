package Z_Java_Tekrar.Methods_Practice;

import java.util.Arrays;

public class returnMethod {

    public static void sum(int a, int b){

        System.out.println(a+b);
    }


    public static void main(String[] args) {
        sum(5,6);


      float num=  addition(3,9);

        System.out.println(num);


        int max = maxNum(60,94,88);
        System.out.println(max);

      int[] arr ={93,5,8,109,22,55};
      int maxNum = maximum (arr);
        System.out.println(maxNum);



    }

    // write amethod accept an int array and returns the max number from an array

    public static int maximum(int[] arr){

        Arrays.sort(arr);
        return arr[arr.length-1];

    }





    public static int addition(int a, int b){
        return a+b;
    }



    // write method that accept 3 numbers and returns the largest number

    public static int maxNum (int a, int b, int c){
        int[] arr ={a,b,c};
        Arrays.sort(arr);

        return arr[arr.length-1];

    }








}
