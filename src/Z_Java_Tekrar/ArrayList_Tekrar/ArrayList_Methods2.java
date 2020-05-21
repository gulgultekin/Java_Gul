package Z_Java_Tekrar.ArrayList_Tekrar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_Methods2 {
    public static void main(String[] args) {


        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,6,8,9));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,9,3,6,8,2));


        Collections.sort(list1);
        Collections.sort(list2);
//        boolean bool = list1.equals(list2);
//
//        System.out.println(list1.equals(list2));
//        System.out.println(bool);
//
        ArrayList<Integer> reversed = new ArrayList<>();
        for(int i=list1.size()-1; i>=0; i--){

            reversed.add(list1.get(i));
        }

        System.out.println(reversed);


    }
}
