package OfficeHours.Practice_06_03_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class AddingNumbers {
    /*
    1- 1) Create a method that will accept an int array
     and return the sum of all the numbers in the given array


    2- Overload the method to accept an ArrayList of integers
    and return the sum of all the numbers in the given ArrayList
     */

    //1
    public static int sumElements(int[]arr){
        int sum=0;

        for(int i =0; i<arr.length;i++){

            sum+=arr[i];

        }
        return sum;
    }

   //2
    public static int sumElements(ArrayList<Integer>list){
        int sum=0;

        for(int i =0; i<list.size();i++){

            sum += list.get(i);

        }
        return sum;
    }

    public static void main(String[] args) {
        int[]a ={1,2,3,4};
        System.out.println(sumElements(a));

        ArrayList<Integer> list =new ArrayList<>(Arrays.asList(1,2,4,6));
        System.out.println(sumElements(list));

    }

}
