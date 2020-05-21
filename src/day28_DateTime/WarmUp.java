package day28_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class WarmUp {
    /*
    Warmup task:
    1. create an array of string, store five of your friends names in it
    2. create Array of localdates and store thier birthdays in the same order
    3. use for loop to print out your friends' names and thier birthdays

     */
    public static void main(String[] args) {
        String[] name = {"Sener","Beyza","Yusuf","Gul","Cinnamon"};

        LocalDate[] birtday ={ LocalDate.of(1970,10,01), LocalDate.of(1998,9,12),
                LocalDate.of(2001,12,20),LocalDate.of( 1973,11,18),
                LocalDate.of(2014,3,19)};

       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM.dd.yyyy");
       for(int i=0; i< name.length; i++){

           System.out.println(name[i]+"'s birthday is "+birtday[i]);
       }


        }

    }



