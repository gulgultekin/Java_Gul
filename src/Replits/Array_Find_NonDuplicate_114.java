package Replits;

import java.util.Scanner;

public class Array_Find_NonDuplicate_114 {
    public static void main(String[] args) {
        /*
        Given an array nums with 7 integers every element is repeated twice - except one.
        Find that element and print it to console.

Example:

nums -> [1, 1, 2, 3, 4, 3, 4]
         2
         */
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt()
                ,input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: write your code below

        int result=0;



        for(int i=0; i<nums.length; i++){

            int count=0;// bu counterin her loopta 0 olmasi icin loop icinde olmasi gerekiyor

            for(int j=0; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    count++;

                    }

                }
            if(count==1){
                result=nums[i];
                System.out.println(result);
            }

        }

    }
}
