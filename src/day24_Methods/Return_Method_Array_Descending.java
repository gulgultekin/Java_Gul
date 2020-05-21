package day24_Methods;

import java.util.Arrays;

public class Return_Method_Array_Descending {

    //6. creat e a function that can print out the array in descending order
    public static void main(String[] args) {

        int[] arr1 = {1,10,9,3,6};

        int[]  arr2 = {200, 100, 400, 550, 250};

        int[] arr3 = {1000, 800, 4000, 2000};

       sortDescending(arr1); // void ile

        // return method ile

        arr1= sortDescending2(arr1);
        arr2= sortDescending2(arr2);
        arr3= sortDescending2(arr3);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

    }

     //return value

    public static int[] sortDescending2 (int[] arr){

        Arrays.sort(arr);

        int[] RevArr = new int[arr.length];

        int j = arr.length-1;

        for(int i = 0; i< arr.length; i++){
            RevArr[i]= arr[j];

            j--;
        }
        return RevArr;

    }

    public static void  sortDescending (int[] arr){

        Arrays.sort(arr);

        int[] RevArr = new int[arr.length];

        int j = arr.length-1;

        for(int i = 0; i< arr.length; i++){
            RevArr[i]= arr[j];

            j--;
        }
        System.out.println(Arrays.toString(RevArr));

    }
}
