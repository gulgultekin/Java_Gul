package Replits;

import java.util.Arrays;

public class Assessment_4_1_isSorted {
    /*
    this is a sorted collection (in this case array):

7,8,9,10

this is an unsorted collection:

5,4,9,8,7,3

sorted in this case means smallest number to biggest.
isSort gets an array and returns true if its sorted.

for example:
isSort([2,3,5,4,9]);
returns: false

isSort([1,2,3]);
returns: true

isSort([7,8,9]);
returns: true.
     */
    public static void main(String[] args) {
        int[]num={14,8,15};

        System.out.println(isSort(num));
    }


    public static boolean isSort(int[] nums){

        int[] copy = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            copy[i]=nums[i];
        }
        Arrays.sort(copy);

        boolean res =Arrays.equals(nums,copy);
        return res;
    }



//    public static boolean isSort(int[] nums)
//    {
//
//        boolean result =false;
//
//        for(int i=0; i< nums.length; i++){
//            if(nums[i]<nums[i+1]){
//                result=true;
//            }
//            else{
//                result=false;
//            }
//        }
//        return result;
//
//    }
}
