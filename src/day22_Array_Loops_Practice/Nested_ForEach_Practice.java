package day22_Array_Loops_Practice;

import java.util.Arrays;

public class Nested_ForEach_Practice {
    public static void main(String[] args) {

        int[][] numbers = {
                {1,2,3},
                {4,5,6,7,8,9},
                {10,11,12,13,14},
                {15,16,17,18,19,20,21}
        };
        // 1. print all even numbers in a same line
        // 2. count odd numbers ==> return the total odd number
        //3. finf sum of odd and even numbers

        int countOdd =0;
        int sumOfOdd=0;
        int sumOfEven=0;

        for( int[] each1Darray : numbers){
         //   System.out.println(Arrays.toString(each1Darray));

            for(int eachElement : each1Darray){

                if(eachElement%2 ==0){
                    sumOfEven+=eachElement;

                    System.out.print(eachElement+" ");

               }else{
                   countOdd++;
                   sumOfOdd+=eachElement;
               }
            }

        }
        System.out.println();
        System.out.println(countOdd);
        System.out.println("sum of even num: "+sumOfEven);
        System.out.println("sum of odd num: "+sumOfOdd);





    }
}
