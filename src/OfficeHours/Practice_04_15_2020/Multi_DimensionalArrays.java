package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class Multi_DimensionalArrays {
    public static void main(String[] args) {

        int[] arr1D = {1,2,3};

        int[][] arr2D = {  {1,2,3} , {4,5,6,7}};

        //{4,5,6,7}
        System.out.println(Arrays.toString(arr2D[1])); // [4, 5, 6, 7]

        //7
        System.out.println(arr2D[1][3]); //7

        //4
        System.out.println(arr2D[1][0]);

        System.out.println(Arrays.deepToString(arr2D)); //[[1, 2, 3], [4, 5, 6, 7]]



    }
}
