package day52_Collection;

import java.util.*;

public class Sets {

    public static void main(String[] args) {

        Set<String> names = new HashSet<>();

        names.add("Gul");
        names.add("Beyza");
        names.add("Zuura");
        names.add("Yusuf");
        names.add("Gul");
        names.add("Gul");

        System.out.println(names);//[Zuura, Yusuf, Beyza, Gul]
        //duplicatesleri almiyor


        Set<String> names2 = new LinkedHashSet<>();

        names2.add("Gul");
        names2.add("Beyza");
        names2.add("Zuura");
        names2.add("Yusuf");
        names2.add("Gul");
        names2.add("Gul");

        System.out.println(names2); //[Gul, Beyza, Zuura, Yusuf]
        //duplicateleri yine remove yapiyor ma girilis sirasina gore print yapiyor
                                             //insertion order

        System.out.println("*********************************");

        String[] arr ={"A","A","C","B","A"}; //ACB

        LinkedHashSet<String> set1 =  new LinkedHashSet<>(Arrays.asList(arr));

        System.out.println(set1); //[A, C, B]

       // System.out.println(set1.get(1)); // set does not have index number--> bu yuzden hata veriyor

        System.out.println("************TREESET***********************");

        Set<Integer> numbers = new TreeSet<>();
        numbers.addAll(Arrays.asList(10,2,3,3,5,5,7,9,2,10,9,6));//removes duplicates and sort

        System.out.println(numbers); //[2, 3, 5, 6, 7, 9, 10] --> removes duplicates and sort


        System.out.println("*************************");

        TreeSet<String> treeset = new TreeSet<>();
       // treeset.add(null); // treeset does not accept null

       // System.out.println(treeset); //NullPointerException


        HashSet<String> hashset = new HashSet<>();
        hashset.add(null); // hashset  accept null

        System.out.println(hashset); //[null]

    }
}
