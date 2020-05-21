package Replits;

import java.util.ArrayList;

public class Methods_ArrayList_190 {
    /*
    Create a static method that:

is called appendPosSum
returns an ArrayList of Integers
takes one parameter: an ArrayList of Integers

This method should:
Create a new ArrayList of Integers
Add only the positive Integers to the new ArrayList
Sum the positive Integers in the new ArrayList and add the Sum as the last element

For example, if the incoming ArrayList contains the Integers (4,-6,3,-8,0,4,3),
 the ArrayList that gets returned should be (4,3,4,3,14), with 14 being the sum of (4,3,4,3).
 The original ArrayList should remain unchanged.
     */

    public static void main(String[] args) {
        ArrayList<Integer>nums=new ArrayList<>();
        nums.add(4);
        nums.add(-4);
        nums.add(2);
        nums.add(8);
        nums.add(-1);

        ArrayList<Integer>res = appendPosSum(nums);
        System.out.println(res);


    }

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer>nums){

        ArrayList<Integer>result =new ArrayList<>();
        int sum=0;
        for(int each: nums) {
            if (each > 0) {
                result.add(each);
            }
        }
            for(int each: result){
                if(each>0){
                    sum+=each;
                }
        }

        result.add(sum);
        return result;

    }
}
