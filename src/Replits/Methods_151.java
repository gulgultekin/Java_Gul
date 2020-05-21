package Replits;

import java.util.Scanner;

public class Methods_151 {
    /*
    Write a void method printUniqueNumbers that will print unique numbers from an array of ints.

Example:
input:[2, 5, 5, 6, 3, 6, 9, 34, 3]
output:
2
9
34
     */

    public static void main(String[] args) {

        int[] nums = {2, 5, 5, 6, 3, 6, 9, 34, 3};

        printUniqueNumbers(nums);
    }


    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE
//
//        for(int each2: nums){
//            int count=0;
//            for(int each: nums){
//                if(each2==each){
//                    count++;
//                }
//            }
//            if(count==1){
//                System.out.println(each2);
//            }
//
//        }
//









        for(int j=0; j< nums.length; j++){

           int count =0;
           for(int i=0; i< nums.length; i++){

              if(nums[j]==nums[i]){
                  count++;
              }

            }
            if(count==1){
                System.out.println(nums[j]);

            }

        }



    }
}
