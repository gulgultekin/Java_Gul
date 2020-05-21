package Z_Java_Tekrar.ArrayList_Tekrar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class SecondMax {
    public static void main(String[] args) {
         /*
            1. write a program that can return the second maximum number from Arraylist
                    Ex: {1,2,3,4,5,6,7,8,8};
                            output: 7
            2. write a program that can return the second minimum number from Arraylist
                Ex: {1,1,2,3,4,5,6,7,8,8};
                   output: 2
         */


        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,8));

        System.out.println(list);
        Integer max = Collections.max(list);

        list.removeAll(Arrays.asList(max));
        System.out.println(list);

        int maximum = Collections.max(list);
        System.out.println(maximum);


        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,8));

        Integer min = Collections.min(list2);
        list2.removeAll(Arrays.asList(min));

        System.out.println(list2);

        int mini =  Collections.min(list2);
        System.out.println(mini);


    }
}
