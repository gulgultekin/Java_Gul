package day52_Collection;

import java.util.*;

public class Collections_Utility {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();

        list1.addAll(Arrays.asList(10,9,8,7,6,5,4));

        System.out.println(list1); //[10, 9, 8, 7, 6, 5, 4]


        Collections.sort(list1);

        System.out.println(list1); //[4, 5, 6, 7, 8, 9, 10]

        System.out.println("*****************TREESET ILE SORT********************");
        //1- write a program that can remove the duplicates
        // and print out in  sorted assending order

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(5,5,5,6,6,7,8,8,6,3,3,4,4,0,9,7,2,1));

        TreeSet<Integer> sorted = new TreeSet<>(nums);

        System.out.println(sorted);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        System.out.println(nums); //[5, 5, 5, 6, 6, 7, 8, 8, 6, 3, 3, 4, 4, 0, 9, 7, 2, 1]


        nums = new ArrayList<>(sorted); //yeniden initialize yaptik

        System.out.println(nums); //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        System.out.println("********************YADA*******************");

        //yada

        nums = new ArrayList<>(new TreeSet<>(nums));//bir kere kullanilacagi icin direk boyle kullanilabilir, initialize yapilmayabilir
        System.out.println(nums); //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]


        System.out.println("***********************LINKEDHASHSET****************************************");
        //1- write a program that can remove the duplicates from an arraylist
        //2- do not change the order
        //[6,6,6,6,6,5,5,4,4,3]==> [6,5,4,3]

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,6,6,6,6,5,5,4,4,3));

        list = new ArrayList<>(new LinkedHashSet<>(list)); //removes duplicate and keep insertion order
        System.out.println(list); //[6, 5, 4, 3]


        list = new ArrayList<>(new TreeSet<>(list)); //removes duplicate and sorted
        System.out.println(list); //[3, 4, 5, 6]


        System.out.println("************************FREQUENCY******************************************");


        ArrayList<String> letters = new ArrayList<>();
        letters.addAll(Arrays.asList("A","B","C","B","D"));

        int result1 = Collections.frequency(letters,"A");
        System.out.println(result1); //1

        boolean result = Collections.frequency(letters,"A") == 1 ;
        System.out.println(result); //true





    }
}
