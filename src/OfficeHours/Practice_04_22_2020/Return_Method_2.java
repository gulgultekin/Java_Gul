package OfficeHours.Practice_04_22_2020;

import java.util.Arrays;

public class Return_Method_2 {
    //return second maximum number from an int array

    public static void main(String[] args) {

        int[] arr ={100,30,50,22,77,99};
        Arrays.sort(arr);
        int result = arr[arr.length-2];
        System.out.println(result);

        System.out.println("********************");

        int result2 = secondMaximumNum(arr);
        System.out.println(result2);

    }


    public static int secondMaximumNum(int[] arr){
        Arrays.sort(arr);
        int result = arr[arr.length-2];

        return result;

    }






}
