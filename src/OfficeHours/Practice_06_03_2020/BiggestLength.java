package OfficeHours.Practice_06_03_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class BiggestLength {

    // Create a method that will accept an ArrayList of Strings and return the String that has the biggest length

    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>(Arrays.asList("car","house","java","mark","thisisreallybiiiig"));

        System.out.println(longestString(list));

    }

    public static String longestString(ArrayList<String>list){

        String biggest="";

        for(String word:list){
            if(word.length()>biggest.length()){
                biggest = word;
            }

        }

        return biggest;
    }




}
