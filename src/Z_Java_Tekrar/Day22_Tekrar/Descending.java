package Z_Java_Tekrar.Day22_Tekrar;

import java.util.Arrays;

public class Descending {
    public static void main(String[] args) {


    // 2. write a program that sort the array in descending order

    int[] arr ={10,39,2,-1,8,4,0,33};

     Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] reverse = new int[arr.length];
        int j= arr.length-1;

        for(int i=0; i< arr.length; i++){

            reverse[i]=arr[j];
            j--;
        }

        System.out.println(Arrays.toString(reverse));


    }
}