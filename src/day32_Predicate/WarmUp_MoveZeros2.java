package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUp_MoveZeros2 {
     /*  warmup tasks:
    Write a program that can move all the zeros to  last indexes of ArrayList
    Ex:
    list:  {1, 0, 2, 0, 3, 0, 4, 0};
    output: [1, 2, 3, 4, 0, 0, 0, 0]
    DO NOT USE SORT method, DO NOT declare any extra arrayList*/
     public static void main(String[] args) {

         ArrayList<Integer> list = new ArrayList<>();

         list.addAll(Arrays.asList(10, 0, 20, 0, 30, 0, 40, 0, 0, 0));

         System.out.println(list); // [10, 0, 20, 0, 30, 0, 40, 0, 0, 0]


         int count = Collections.frequency(list,0);
         System.out.println(count); //6


         list.removeAll(Arrays.asList(0));
         System.out.println(list); //[10, 20, 30, 40]


         for(int i=0; i<count; i++){
             list.add(0);
         }

         System.out.println(list); // [10, 20, 30, 40, 0, 0, 0, 0, 0, 0]




     }
}
