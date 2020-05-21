package Z_Java_Tekrar.Day22_Tekrar;

import java.util.Arrays;

public class Nested_practice {
    public static void main(String[] args) {
        int[][] numbers = {
                {1,2,3},
                {4,5,6,7,8,9},
                {10,11,12,13,14},
                {15,16,17,18,19,20,21}
        };
        // 1. print all even numbers in a same line
        // 2. count odd numbers ==> return the total odd number
        //3. find sum of odd and even numbers
        System.out.println(Arrays.deepToString(numbers));
        int countOdd=0;
        int countEven=0;
        int sumEven=0;
        int sumOdd=0;

       for(int[] each: numbers){

           for(int element : each){

               if(element%2==0){
                   System.out.print(element+" ");
                   countEven++;
                   sumEven+=element;

               }else{
                   countOdd++;
                   sumOdd+=element;
               }

           }


       }
        System.out.println();

        System.out.println("Odd"+countOdd);
        System.out.println("Even"+countEven);
        System.out.println("sum of even "+sumEven);
        System.out.println("sum of odd "+sumOdd);










    }
}
