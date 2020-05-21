package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lambda_Expressions {
    public static void main(String[] args) {

        Predicate<Integer> oddNumber = x -> x %2 !=0;

        ArrayList<Integer> list = new ArrayList<>();
           list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

           list.removeIf(oddNumber); // oddnumberlari remove

        System.out.println(list); // [2, 4, 6, 8, 10]

        System.out.println("*************************************");

        Predicate<Integer> lessThan5 = Y -> Y<5;

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));// 5 ten kucukleri remove

        list2.removeIf(lessThan5);
        System.out.println(list2); //[5, 6, 7, 8, 9, 10]


        System.out.println("***********String ile**********************");

        Predicate<String> startWithM = s ->s.toLowerCase().startsWith("m"); // ignore case sen.  M ile baslayanlari remove yap

      //  Predicate<String> startWithM = s -> !s.startsWith("M"); // M ile baslaMAyanlari remove yap //[Murt, Mom]

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Murt","Mom","Bori","Sha","Bilal"));

        names.removeIf(startWithM);  // M ile baslayanlari remove yap
        System.out.println(names); //[Bori, Sha, Bilal]









    }
}
