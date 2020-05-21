package day30_ArrayList;

import java.util.ArrayList;

public class WarmUp_3_Unique_int {
    public static void main(String[] args) {

         /*
    3. write a program that can print out the unique elements from an int array
           HINT: store all the unqie elemenbts of array into a list of integers
           Ex: array==> {1,1,2,3,3,4,5}
               output: {2,4,5}
               */

            int[] arr = {1, 1, 2, 3, 3, 4, 5};
            ArrayList<Integer> result= new ArrayList<>();

            for (int each2 : arr) {
                int count = 0;
                for (int each : arr) {
                    if (each == each2) {
                        count++;
                    }

                }
                if (count == 1) {
                    result.add(each2);
                }

            }
        System.out.println(result);


        }
    }
