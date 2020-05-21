package day18_NestedLoop;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        /*
        write a program for the room reservation:
        king bed==> 120$
        queen bed==> 100$
        single bed==> 80$

        should ask which bedroom do you wanna reserve
        if user provided invalid entry==> plese re-enter

        calculate the total price

        do you want to reserve another room:
             if yes==>repeat the previous steps
             if no==> your total price is:$$

             if answer either yes or no ==> please re-enter
             nested-loop

         */
        Scanner scan = new Scanner(System.in);



        int price = 0;

        while (true) {

            System.out.println("Hello, Welcome to Cybertek Hotel*****");

            System.out.println("Which bedroom do you want to reserve?");
            String room = scan.nextLine();

            if (room.equalsIgnoreCase("king")) {

                price += 120;

            } else if (room.equalsIgnoreCase("queen")) {

                price += 100;

            } else if (room.equalsIgnoreCase("single")) {

                price += 80;
            }
            System.out.println("Your total price is : $"+price);

            System.out.println("Do you want to reserve another room?");

            String answer =scan.nextLine();

            while (!((answer.equalsIgnoreCase("yes") || (answer.equalsIgnoreCase("no"))))) {

                System.out.println("please enter yes or no");
                answer = scan.nextLine();

            }
            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you for choosing us. ");
                System.out.println("Your total price is : $" + price);
                break;
            }



            }


        }
    }

