package day27_DateTime;

import java.time.LocalDate;

public class Dates {


    public static void main(String[] args) {


        LocalDate date1 = LocalDate.of(2020,4,23);
        System.out.println(date1);

        LocalDate birthday = LocalDate.of(1973,11,18);
        System.out.println(birthday);


        //isAfter(date2)  return boolean
        boolean result1 = date1.isAfter(birthday); //date1 birthday den sonra mi? demek
        System.out.println(result1); // true

        //isBefore(date2)
        boolean result2= date1.isBefore(birthday);  //date1 birthday den once mi? demek
        System.out.println(result2); //false

        //isEqual(date2)
        boolean result3 = date1.isEqual(birthday);
        System.out.println(result3); //false

        //isLeapyear();
        boolean result4 = birthday.isLeapYear();
        System.out.println(result4); // false

        boolean result5 =date1.isLeapYear();
        System.out.println(result5); // true 2020 is leapyear


        System.out.println("******************************************");

        //current date icin

        LocalDate now = LocalDate.now(); // 2020-04-23
        System.out.println("Today is: "+now); // Today is: 2020-04-23

      String str = now.toString();
        System.out.println(str.replace("-"," ")); // 2020 04 23



    }








}
