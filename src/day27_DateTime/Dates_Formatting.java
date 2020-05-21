package day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Formatting {
    public static void main(String[]args){

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");//2020/04/23
                                                     //  ("yyyy/MMM/dd"); 2020/Apr/23
                                                    // ("MMM/dd/yy")  Apr-23-20
                                                   // ("MMMM/dd/yyyy") April/23/2020
    LocalDate date1 = LocalDate.now();
        System.out.println(date1.format(dtf));






    }
 }