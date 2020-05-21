package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_RemoveDuplicates {
    public static void main(String[] args) {

        //write a program that can remove duplicates from an arrayList

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,3));

        ArrayList<Integer> result =new ArrayList<>(); //expected result [1,2,3]

        for(Integer each: list){
            if(!result.contains(each)){
                result.add(each);
            }
        }
        System.out.println(result); //[1, 2, 3]

        System.out.println("***********************************");

        ////write a program that can remove duplicates from an array of integer
        //do not use for each


        Integer[] arr1 = {1,1,2,2,3,3,4,4};
        ArrayList<Integer> nonDuplicates = new ArrayList<>();

        for(int i=0; i<arr1.length; i++){
            if(!nonDuplicates.contains(arr1[i])){
                nonDuplicates.add(arr1[i]);
            }
        }

        System.out.println(nonDuplicates); // [1, 2, 3, 4]




    }
}
