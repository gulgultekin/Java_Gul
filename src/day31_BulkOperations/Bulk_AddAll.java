package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_AddAll {
    public static void main(String[] args) {

        ArrayList<Integer> list1= new ArrayList<>();
        //add 30,20,40,50,45,35,200

//        list1.add(30);
//        list1.add(20);
//        list1.add(40);
//        list1.add(50);
//        list1.add(45);
//        list1.add(35);
//        list1.add(200); boyle tek tek add yapmak yerine collectionType ile addAll yapilir

       // list1.addAll(Arrays.asList(30,20,40,50,45,35,200)); yada daha kisa

        //int[]arr1={30,20,40,50,45,35,200};// collection type does not support primitive yani(int..)
        Integer[] arr1 = {30,20,40,50,45,35,200}; //old icin  int[] arr1  yazamiyoruz  Integer[] arr1 kabul ediyor


        list1.addAll(Arrays.asList(arr1));

        System.out.println(list1);

        System.out.println("*************************");
        String[] names={"gul","sener","beyza","yusuf","cinnamon","aa"};

       // names[5] ="romeo";// yazamayiz cunku array size is fixed ama ArrayList olsaydi ekleyebilirdik
        ArrayList<String> nameList = new ArrayList<>();

        nameList.addAll(Arrays.asList(names));
                     //  collectionType

        nameList.add("romeo"); //added
        nameList.remove("aa"); // removed  case sensitive
        System.out.println(nameList); //[gul, sener, beyza, yusuf, cinnamon, romeo]

        System.out.println("=============================");

        Integer[] numbers = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> numList =new ArrayList<>(Arrays.asList(numbers));
        System.out.println(numList); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]




    }
}
