package day12_Recap;

import java.util.Scanner;

public class Scanner_NextLine_Practice {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        //123 Vista Ave. Staten Island, NY 12345

        System.out.println("Building number: ");
        int Bnumber = input.nextInt();

        input.nextLine();// bunu koymazsak street yerine "Enter"i aliyor. digerine geciyor

        System.out.println("Street: ");
        String street = input.nextLine();

        System.out.println("City: ");
        String city = input.nextLine();

        System.out.println("Zip code: ");
        int zipCode= input.nextInt();

        input.nextLine();//bunu koymazsak state yerine "Enter" i aliyor

        System.out.println("State: ");
        String state =input.nextLine();



        String FullAddress = Bnumber + " "+ street+" "+ city +" "+state+ " "+zipCode;
        System.out.println("Adress: "+FullAddress);

        input.close();//closes the scanner




    }
}
