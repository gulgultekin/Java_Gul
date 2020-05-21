package Z_Java_Tekrar.Methods_Practice;

import java.util.Arrays;

public class Sort_Array_Descending {

    // write a method that accepts an int array and sorts it hhen returns an array

    public static void main(String[] args) {

        int[] array = {4,7,9,2,5};

        int[] number = Sort(array);

        System.out.println(Arrays.toString(number));


    }


    public static int[] Sort(int[] arr){

        Arrays.sort(arr);
        int[] numbers = new int[arr.length];

        int z =0;
        for (int i= arr.length-1; i>=0; i--){
           numbers[z]+= arr[i];
         z++;
        }

        return numbers;
    }




}
