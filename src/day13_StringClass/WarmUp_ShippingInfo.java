package day13_StringClass;

import java.util.Scanner;

public class WarmUp_ShippingInfo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
         /* 2. write a program for the shipping info that, the program should ask:
                    building number
                    Street address (Assume it has more than one word)
                    city name
                    state name
                    zip code
                    full name of the person:
            and prints the ship to info in the following format:

            ex output:
                    Ship To:  Jimmy joe
                              7925 Jones Branch Dr
                              MCLean, VA 22102
         */

        System.out.println("please enter building number: ");
        int buildingnumber=scan.nextInt();

        System.out.println("please enter Street address: ");
        String street= scan.next();

        scan.nextLine();//takes enter
        System.out.println("please enter city name: ");
        String cityName=scan.nextLine();

        System.out.println("please enter state name: ");
        String state=scan.nextLine();

        System.out.println("please enter zip code: ");
        int zipCode=scan.nextInt();

        scan.nextLine();
        System.out.println("please enter your full name: ");
        String fullName= scan.nextLine();

        System.out.println("Ship To: "+fullName+"\n \t\t"+buildingnumber+" "+street+"\n \t\t"+cityName+", "+state+" "+zipCode);




    }
}
