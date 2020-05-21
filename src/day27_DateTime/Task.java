package day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task {
    public static void main(String[] args) {


    /*
        create a date called birthDay: month/Days/year
                eX: 2020 04  23
                    Aprl/23/20
         */

   LocalDate birthDay = LocalDate.of(1973,11,18);
        System.out.println(birthDay); //1973-11-18

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("E MMM/dd/yy");
        System.out.println(birthDay.format(dtf)); //Sun Nov/18/73


        System.out.println("***********************************");

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEEE MMMM/dd/yyyy"); //Saturday September/12/1998
                    // E--> 3 letter of the day name    EEEE--> full name of the day name
        LocalDate date2 = LocalDate.of(1998,9,12);
        String str1 = date2.format(dtf2);
        System.out.println(str1); //September/12/1998


        System.out.println("*********************");


        LocalDate date3 = LocalDate.now();
        System.out.println(date3.format(dtf2));
}
}