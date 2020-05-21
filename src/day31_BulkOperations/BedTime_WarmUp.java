package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class BedTime_WarmUp {
    /*
    warmup tasks:
    Write a program that can move all the zeros to  last indexes of ArrayList
        Ex:
            list:  {1, 0, 2, 0, 3, 0, 4, 0};
            output: [1, 2, 3, 4, 0, 0, 0, 0]
            DO NOT USE SORT method, DO NOT declare any extra arrayList*/

    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));

       for(int i=0; i<list.size(); i++){

           if(list.get(i).equals(0)){
               list.remove(list.get(i));
               list.add(0);
           }
       }

        System.out.println(list);



        /* write a program that can return the duplicated values from an ArrayList of String
        Ex:
            list: {"A", "B", "A", "C", "D"};
            output: ["A"]
            list: {"A", "B", "B", "C", "D", "D"};
            output: ["B", "D"]
     */

        ArrayList<String> list2= new ArrayList<>(Arrays.asList("A", "B", "A", "C", "D"));

        ArrayList<String> result = new ArrayList<>();

        for(String each: list2){
            int count=0;

            for(String each2: list2){
                if (each.equals(each2)) {
                    count++;
                }
            }
            if(count>1 && !result.contains(each)){
                result.add(each);

            }
        }
        System.out.println(result);












    }
}
