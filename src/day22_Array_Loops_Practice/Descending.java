package day22_Array_Loops_Practice;

import java.util.Arrays;

public class Descending {
    public static void main(String[] args) {
        // 2. write a program that sort the array in descending order

        int[] arr ={10,39,2,-1};
        Arrays.sort(arr); //sort in ascending order

        System.out.println(Arrays.toString(arr)); //[-1, 2, 10, 39]

        int[] revArr = new int[arr.length];

        int j=arr.length-1;

        for(int i=0; i<arr.length; i++){

            revArr[i]=arr[j];
            j--;

        }
        System.out.println(Arrays.toString(revArr)); // [39, 10, 2, -1]





    }
}
