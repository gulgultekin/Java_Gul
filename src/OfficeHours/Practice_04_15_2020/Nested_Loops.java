package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class Nested_Loops {
    public static void main(String[] args) {

        char[][] arr2D = {{'A', 'B'}, {'C', 'D', 'E'}, {'F', 'G', 'H'}};

        System.out.println(Arrays.toString(arr2D[0])); //[A, B]

        //butun array icin

        for (int j = 0; j < arr2D.length; j++) { //j--> index num of 1D arrays

            for (int i = 0; i < arr2D[j].length; i++) { // i--> index number of elements in 1 D
                System.out.println(arr2D[j][i]); //  butun arrayi print yapar
            }

        }
        System.out.println("********************************************");
            //  for each ile

        //arr2D = {{'A', 'B'}, {'C', 'D', 'E'}, {'F', 'G', 'H'}};

        for(char[] each1Darray: arr2D){
            for(char element : each1Darray){
                System.out.println(element);
            }
        }



    }
}
