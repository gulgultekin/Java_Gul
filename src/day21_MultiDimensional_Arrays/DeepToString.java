package day21_MultiDimensional_Arrays;

import java.util.Arrays;

public class DeepToString {
    public static void main(String[] args) {

        //1 D Array print icin

        int[] arr1D ={1,2,3};
        System.out.println(Arrays.toString(arr1D)); // [1, 2, 3]

        //2 D Array print icin

        int[][] arr2D = {{1,2,3},{4,5}};
        System.out.println(Arrays.deepToString(arr2D)); // [[1, 2, 3], [4, 5]]


                           //     0      1                 0      1
        int [][][] arr3D = { { {1,2,3},{4,5} }   ,   { {7,8,9},{10,11} }  };
                     //           0              ,          1

        System.out.println(Arrays.deepToString(arr3D[1]));  //  [[7, 8, 9], [10, 11]]

        System.out.println(Arrays.toString(arr3D[0][1])); // [4, 5]

        System.out.println(arr3D[1][0][0]); // 7

        System.out.println(arr3D[1][1][1]); // 11


    }
}
