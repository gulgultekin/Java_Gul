package day05_Unary_ShorthandOperators;

import java.sql.SQLOutput;

public class LeapYear {
    public static void main(String[] args) {

        /*1. create a class called LeapYear, and write a program that can identify if the given is Leap Year,
        print true if it's leap year, otherwise print false
                Ex:
                    year = 2020
               output:
                   2020 is leap year: true
       */
        short year = 2020;
        //leap year:year % 4==0 (divisible by 4 without remainder)
                //if returns true==>leap year, if it returns false==> not leapYear

        boolean leapYear = year %4==0; // if the year can be divided by 4 without any remainder, then it is LeapYear

        System.out.println(year + " is leap year: "+ leapYear);
                //hem alttaki hem ustteki sout dogru.
        String result = year + " is leap year: "+ leapYear;
        System.out.println(result);


    }
}
