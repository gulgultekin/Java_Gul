package Z_Java_Tekrar.Day22_Tekrar;

import java.util.Arrays;

public class NestedFor_Each {
    public static void main(String[] args) {

        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}};
        for (int[] each : arr2D) {
            for(int element : each){
                System.out.println(element);

            }


        }
        System.out.println(Arrays.deepToString(arr2D));

        System.out.println("***************************************");
        char[][] ch2D ={ {'A','B'}, {'C','D'}};

        for(char[] eachch: ch2D){

            for(char each: eachch){
                System.out.println(each);
            }

        }
        System.out.println(Arrays.deepToString(ch2D));

        System.out.println("***************************************");

        char[][] chh2D ={ {'A','B','H'}, {'C','D','E','G'}};
        System.out.println(Arrays.deepToString(chh2D));
        System.out.println(Arrays.toString(chh2D[1]));

        for(char[] each3 :chh2D){
            System.out.println(Arrays.toString(each3));
        }


    }
}

