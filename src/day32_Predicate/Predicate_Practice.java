package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Predicate_Practice {
    public static void main(String[] args) {


      //  Predicate<Character> digits = c-> c>=48 && c<=57; // digit olanlari remove yap

        Predicate<Character> digits = c-> Character.isDigit(c); // digit olanlari remove yap yukaridakiyle ayni

        ArrayList<Character> chars = new ArrayList<>();

        chars.addAll(Arrays.asList('A','B','3','4','@','Z'));
        chars.removeIf(digits);

        System.out.println(chars); // [A, B, @, Z]







        System.out.println("*******************************");


        // if name started with M or A remove thenama from list


        Predicate<String> startsWithMorA = each-> each.startsWith("M")||each.startsWith("A");

        ArrayList<String> nameList= new ArrayList<>();

        nameList.addAll(Arrays.asList("Muhtar","Asiya","Alex","Dilnaz","Radu"));

        nameList.removeIf(startsWithMorA);


        System.out.println(nameList); // [Dilnaz, Radu]


        System.out.println("=================================================");


        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

       nums.removeIf(p->p >5); // declare yapmaan da bu sekilde yazilabilir
        // Predicate<Integer> greaterThan5 = p-> p>5;
       // nums.removeIf(greaterThan5);

        System.out.println(nums); //[1, 2, 3, 4, 5]




    }
}
