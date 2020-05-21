package Z_Java_Tekrar.Day22_Tekrar;

import java.util.Arrays;

public class Multi_D_Arrays {
    public static void main(String[] args) {
        int[][] arr2D ={ {1,2,3},{4,5,6,7} };

        for(int[] each: arr2D){
            System.out.println(Arrays.deepToString(arr2D));
        }
        for(int each2 : arr2D[0]){
            System.out.println((each2));
        }

        System.out.println("=====================");
          int[] arr1D =arr2D[0];
        System.out.println(Arrays.toString(arr1D));


        System.out.println("================");
        System.out.println(arr2D[0][1]);
        System.out.println(arr2D[1][3]);
        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println(Arrays.deepToString(arr2D));

        System.out.println("*(*******");
        int[] arr={1,2,3,4};
        System.out.println(Arrays.toString(arr));
        for(int eachh: arr){
            System.out.println(eachh);
        }
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        for(int i=0;i< arr2D[1].length; i++){

            int num= arr2D[1][i];
            System.out.println(num);

        }





    }
}
