package day13_StringClass;

import java.util.Scanner;

public class initials {
    public static void main(String[] args) {
        /*
        ask first and last name
        then make initials
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your first name and last name");
        String fullName=scan.nextLine();

        String firstName=fullName.substring(0,fullName.indexOf(" "));
        String lastname=fullName.substring(fullName.indexOf(" ")+1);

        firstName= firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        lastname=lastname.substring(0,1).toUpperCase()+lastname.substring(1).toLowerCase();

        System.out.println(firstName);
        System.out.println(lastname);

        String initials=firstName.charAt(0)+"."+lastname.charAt(0);
        initials=initials.toUpperCase();
        System.out.println("Initials is : "+initials);


    }
}
