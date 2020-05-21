package Tasks;

import java.util.Arrays;

public class Calisma14_2D_Array {
    public static void main(String[] args) {

        int[][] arr2D ={{1,2}, {3,4,5},{6,7,8,9}};

        for(int i=0; i<arr2D.length; i++){
            System.out.print(Arrays.toString(arr2D[i])); //[1, 2][3, 4, 5][6, 7, 8, 9]
            }
        System.out.println();


            for(int i=0; i<arr2D.length; i++){  // checks each index of 1d array

            for(int j= 0; j<arr2D[i].length; j++){ // checks the each index of elements within that 1d array

                System.out.print(arr2D[i][j]+" "); //1 2 3 4 5 6 7 8 9
            }
        }

        System.out.println("***********************************");

            char[][] ch2D ={{'A','B'},{'C','D','E'}};

            for(int i=0; i<ch2D.length; i++){

                for(int j=0; j<ch2D[i].length; j++){

                    System.out.print(ch2D[i][j]+" "); //A B C D E
                }
            }














    }
}
