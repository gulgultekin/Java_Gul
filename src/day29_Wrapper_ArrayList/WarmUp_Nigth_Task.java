package day29_Wrapper_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class WarmUp_Nigth_Task {
    /*
    WARMUP TASKS:
    1. write a program that can return the sum of all the digits from a string
            ex:
                input: "a1b2c3"
                output: 6
                    (1+2+3= 6)
                input: "Today's date is 04/27/2020"
                output: 17
                    (0+4+2+7+2+0+2+0=17)
            HINT: on ascii table, the characters between #48 ~ #57 are digits*/
    public static void main(String[] args) {

        String str = "a1b2c3";
        ArrayList<Integer> sum = new ArrayList<>();




    /*2. write a program that can print the list of integers in reversed order
        ex:
            list=> {1,2,3,4,5}
            output: 5 4 3 2 1
            */


            int[] liste = {1, 2, 3, 4, 5};
            ArrayList<Integer> reverse = new ArrayList<>();
            // int[] reverse = new int[list.length];

            for (int i = liste.length - 1; i >= 0; i--) {
                reverse.add(liste[i]);


            }
            System.out.println(reverse);




    /*
    3. write a program that can print out the unique elements from an int array
           HINT: store all the unqie elemenbts of array into a list of integers
           Ex: array==> {1,1,2,3,3,4,5}
               output: {2,4,5}
               */

            int[] arr = {1, 1, 2, 3, 3, 4, 5};
            ArrayList<Integer> result = new ArrayList<>();
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




    /*4.  write a program that can find the unique elements from an ArrayList of integers and stores
           into another list called uniques
            ex: list==> {1,1,2,3,3,4,5}
                uniques ==> {2,4,5}
                */



   /* 5. write a program that can combine two String arrays into one arrayList
            ex:
                arr1 = {"A", "B", "C"};
                arr2 = {"D", "E", "F", "G"};
                list ==> {"A", "B", "C", "D", "E", "F", "G"}

     */
        }
    }
