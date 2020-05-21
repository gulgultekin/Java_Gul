package day18_NestedLoop;

import java.util.Scanner;

public class deneme2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int price =0;

        while(true){

            System.out.println("WELCOME TO HILTON INTERNATIONAL!!!");
            System.out.println("Do you want to reserve a room with King bed, Queen bed OR Single bed? :");
            String answer = scan.nextLine();

        /*    while( ! (answer.equalsIgnoreCase("King Bed") ||
                    answer.equalsIgnoreCase("Queen Bed") ||
                    answer.equalsIgnoreCase("Single Bed"))){
                System.out.println("Invalid entry!Please re-enter? ");
                answer = scan.nextLine();
            }*/

            if(answer.equalsIgnoreCase("King Bed")){
                price+=120;

            }else if(answer.equalsIgnoreCase("Queen Bed")){
                price+=100;

            }else if(answer.equalsIgnoreCase("Single Bed")){
                price+=80;
            }

            System.out.println("Your room total is: "+price+" $");

            System.out.println("Do you want to continue?");

            String reply = scan.next();

            if(reply.equalsIgnoreCase("Yes")){
                answer = scan.nextLine();
            }

            if(reply.equalsIgnoreCase("NO")){
                System.out.println("Thank you for staying with us!");
                System.out.println("Your total price is: "+price+" $");
                break;
            }
        }

    }
}
