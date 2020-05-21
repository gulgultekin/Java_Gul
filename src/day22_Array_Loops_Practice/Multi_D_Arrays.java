package day22_Array_Loops_Practice;

import java.util.Arrays;

public class Multi_D_Arrays {
    public static void main(String[] args) {

        // n dimensional array contains (n-1) dimensional arrays

        int[] arr ={1,2,3};
            //      0 1 2

        // 2D array:[index num of index num of 1D array ][]
        int[][] arr2D ={ {1,2,3},{4,5,6,7} };// yani bu 2 D array old icin icindeki valueler 1D array olmali
              //           0         1
        int[] arr1D = arr2D[0];
        System.out.println(Arrays.toString(arr1D)); // [1, 2, 3] single D array

        System.out.println(Arrays.toString(arr2D[0])); //[1, 2, 3] yukaridakiyle ayni sonucu verir

        System.out.println(arr2D[0][2]); // 3 single element old icin direk print yapabiliriz


        //butun arrayi print yapmak icin

        System.out.println(Arrays.deepToString(arr2D)); // [[1, 2, 3], [4, 5, 6, 7]]

        System.out.println(Arrays.toString(arr2D[1])); // [4, 5, 6, 7]



        for(int eachElement : arr2D[0]){
            System.out.println(eachElement);// yukardan asagi sirali print yapar

            // baska bir yolla ==> 1D arrayin icindekileri yukardan asagi print yapma


            for(int i=0; i<arr2D[0].length; i++){

                int num = arr2D[0][i];
                System.out.println(num);
            }


        }


    }
}
