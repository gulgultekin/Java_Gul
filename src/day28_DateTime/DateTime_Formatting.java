package day28_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime_Formatting {
    public static void main(String[] args) {

        LocalDateTime dateTime1= LocalDateTime.of(2015,11,25,11,20,45);//2015-11-25T11:20:45
        System.out.println(dateTime1);

        //11/25/2015 11:20 am
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("E MM/dd/yyyy hh:mm a"); // Wed 11/25/2015 11:20 AM
        System.out.println(dateTime1.format(dtf));

        System.out.println("****************************");

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMM/dd hh:mm a, E"); // Nov/25 11:20 AM, Wed
        System.out.println(dateTime1.format(dtf2));







    }
}
