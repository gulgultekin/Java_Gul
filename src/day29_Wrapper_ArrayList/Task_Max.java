package day29_Wrapper_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task_Max {

          /*
        1. create a list of Integers
        2. add 5 Integers to it
        3. return the maximum number from the list
         */
          public static void main(String[] args) {

              ArrayList<Integer> num = new ArrayList<>();
              num.add(5);
              num.add(8);
              num.add(9);
              System.out.println(num);

              int max = Integer.MIN_VALUE;
              for(int each: num){
                  if(each>max){
                      max=each;
                  }
              }

              System.out.println(max);

          }
}
