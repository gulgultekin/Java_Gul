package Replits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class ArrayList_AspendPosSum {
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
    public static void main(String[] args)
    {
        ArrayList<Integer>list = new ArrayList<>(Arrays.asList(4,-6,3,-8,0,4,3));
        System.out.println(appendPosSum(list));

    }
    //create your method below


    static ArrayList<Integer> appendPosSum(ArrayList<Integer> list){

       //list.addAll(Arrays_Pract.asList(4,-6,3,-8,0,4,3));
        Predicate<Integer> positive = p->p<0;
        list.removeIf(positive);
        Integer sum=0;
        for(Integer each: list){
            sum+=each;
        }

        list.add(sum);

        return list;

    }


}
