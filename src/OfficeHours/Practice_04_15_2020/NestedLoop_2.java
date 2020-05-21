package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class NestedLoop_2 {

    public static void main(String[] args) {

        int[][]  numbers = {
                {5,4,3,2,1},
                {10,11,12,13,14,15},
                {16,17,18,19,20},
        };

         // print all the odd numbers with regular for loop. MUST use continue statement

        for(int j = 0; j<numbers.length; j++){

            for(int i=0; i< numbers[j].length; i++){

                if(numbers[j][i] %2 ==0){
                    continue;
                }
                    System.out.println(numbers[j][i]);


            }
        }





        System.out.println("******************************");

        // print all the even numbers with for each loop. MUST use continue statement

        for(int[] each1D : numbers){

            for(int each : each1D){

                if(each %2 ==0){
                    continue;
                }
                System.out.print(each+" "); //5 3 1 11 13 15 17 19
            }
        }

    }
}
