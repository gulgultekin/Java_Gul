package Z_Java_Tekrar.ArrayList_Tekrar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class moveZeros {
    public static void main(String[] args) {
        /*  warmup tasks:
    Write a program that can move all the zeros to  last indexes of ArrayList
    Ex:
    list:  {1, 0, 2, 0, 3, 0, 4, 0};
    output: [1, 2, 3, 4, 0, 0, 0, 0]
    DO NOT USE SORT method, DO NOT declare any extra arrayList*/

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));

        int a= Collections.frequency(list,0);
        System.out.println(list);
        System.out.println(a);

        list.removeAll(Arrays.asList(0));
        System.out.println(list);

        for(int i=0; i<a; i++){
            list.add(0);
        }

        System.out.println(list);





    }
}
