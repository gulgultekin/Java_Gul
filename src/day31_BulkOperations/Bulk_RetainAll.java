package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_RetainAll {
    public static void main(String[] args) {

       ArrayList<Integer> list = new ArrayList<>();
       list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5));

       //only keep1,2,3

        list.retainAll(Arrays.asList(1,2,3));//[1, 2, 3, 1, 2, 3] 1 2 3 ile match yapmayanlari siliyor

        System.out.println(list);




    }
}
