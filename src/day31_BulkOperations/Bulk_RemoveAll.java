package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_RemoveAll {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1,3,3,3,3));
        //remove1,3,5,8

//        Integer a= 1;
//        list.remove(a);// it removes first one
//        list.remove(a);// it removes second one

        list.removeAll(Arrays.asList(3,1));// butun 3 leri ve 1 leri silecek

        System.out.println(list); //[2, 4, 5, 6, 7, 8, 9]

       // yukaridakinin aynisi-- boylede yapilabilir

        Integer[] arr ={2,4,5};

        list.removeAll(Arrays.asList(arr));
        System.out.println(list); //[6, 7, 8, 9]

        System.out.println("******************************");
        //removes all names Ahmed
        String[] names={"Ahmed", "Ali","John","Muhtar","Ahmed"};

        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));

        System.out.println(nameList);//[Ahmed, Ali, John, Muhtar, Ahmed]

        nameList.removeAll(Arrays.asList("Ahmed"));// butun ahmedleri sildi

        System.out.println(nameList);// [Ali, John, Muhtar]


    }
}
