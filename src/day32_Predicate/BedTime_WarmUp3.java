package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class BedTime_WarmUp3 {
    /*
    3. task:
			1. create an ArrayList of string called country names
			2. write a program that can remove all the country names that have length of 10 or greater

     */

    public static void main(String[] args) {

        Predicate<String> tooLong = p->p.length()>10;

        ArrayList<String> countryNames = new ArrayList<>();
        countryNames.addAll(Arrays.asList("Turkey","Holland","Germany","United States of America"));

        countryNames.removeIf(tooLong);

        System.out.println(countryNames);




    }
}
