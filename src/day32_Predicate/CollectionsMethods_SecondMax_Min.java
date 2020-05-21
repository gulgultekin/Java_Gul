package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsMethods_SecondMax_Min {
    public static void main(String[] args) {

         /*
            1. write a program that can return the second maximum number from Arraylist
                    Ex: {1,2,3,4,5,6,7,8,8};
                            output: 7
            2. write a program that can return the second minimum number from Arraylist
                Ex: {1,1,2,3,4,5,6,7,8,8};
                   output: 2
         */
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,1,2,3,4,4));
              //second max:3


        Integer maxNum = Collections.max(numbers);

        numbers.removeAll(Arrays.asList(maxNum)); //// all max numbers removed
        System.out.println(numbers); // [1, 1, 2, 3]



        int secondMax =Collections.max(numbers); // ilk max numberi remove yapinca secondmax ==max oluyor
        System.out.println(secondMax);



        System.out.println("*********Second min number***************");

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,3,4,5,6,7,8));

        Integer min = Collections.min(list);

        list.removeAll(Arrays.asList(min)); // all min numbers removed

        System.out.println(list); //[2, 3, 4, 5, 6, 7, 8]

        int secondMin =Collections.min(list); // ilk min numberi remove yapinca secondmin == min oluyor

        System.out.println(secondMin);








    }
}
