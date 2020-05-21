package day28_DateTime;

import java.time.LocalDate;

public class LocalDate_Practice {
    /*
   Warmup task:
   1. create an array of string, store five of your friends names in it
   2. create Array of localdates and store thier birthdays in the same order
   3. use for loop to print out your friends' names and thier birthdays

    */


    public static void main(String[] args) {
        String[] friends = {"Gul", "Sener"};

        LocalDate GulBirthDay = LocalDate.of(1973,11,18);
        LocalDate SenerBirthDay = LocalDate.of(1970,10,01);

        LocalDate[] birthdays = {GulBirthDay,SenerBirthDay};

        for(int i=0; i< friends.length; i++){

            String name =friends[i];
            LocalDate bday = birthdays[i];
            System.out.println(name+"'s birthday is "+bday);
        }

    }

}
