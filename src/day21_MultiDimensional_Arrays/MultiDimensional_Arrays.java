package day21_MultiDimensional_Arrays;

import java.util.Arrays;

public class MultiDimensional_Arrays {
    public static void main(String[] args) {

        int[] arr ={1,2,3};

        int[][] arr2D = {{1,2,3},{4,5,6,7,8}};
                      //     0       1
        System.out.println(arr2D.length);

       int[] arr1D = arr2D[0]; //{1,2,3}

        System.out.println(Arrays.toString(arr1D)); //[1, 2, 3]       bu ikisi de ayni seyi gosteriyor.
        System.out.println(Arrays.toString(arr2D[0])); //[1, 2, 3]   iki turlu de olur


       int num1 = arr2D[1][3];
        System.out.println(num1); // 7

        char[][] ch2D = { {'A','B','C'},{'D','E','F'},{'G','H','I'}  };
                 // index:     0           1                2

        char c1 = ch2D[1][0];
        System.out.println(c1); // D

        char[] c2= ch2D[2];
        System.out.println(Arrays.toString(c2)); //  ['G','H','I']


        String[][] str2D = {{"A","B","C"},{"D","E","F"},{"G","H","I","J"}};

        String str1= str2D[2][2];
        System.out.println(str1); // I ==> sadece bunu yazmak icin  str2D[2][2]; tam adres

        String[] str2 = str2D[1];
        System.out.println(Arrays.toString(str2)); //[D, E, F] --> 1 D arrayi yazdirmak icin


        String r1 =   str2D[2] [1]; // H

        System.out.println(r1);


        /*
                        ColumNums
                 RowNum	 0	1	2
                      0  A	B	C
                      1	 D	E	F
                      2	 j	H	I
         */

    }
}
