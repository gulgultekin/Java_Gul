package Replits;

import java.util.Scanner;

public class Party_Loop_083 {
    /*
    Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)
Ask for the first guest name.
Then ask does user want to enter one more guest.
 If yes - take input from.
If not - finish the program and print list of the guests.

Example of the program:

Please enter guest name:
Nick
Do you want to enter new guest name:
yes
Please enter guest name:
Linda
Do you want to enter new guest name:
no

Guest's list: Nick, Linda
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String answer="";
        String name ="";
        String result ="";

        while (true) {
            System.out.println("Please enter guest name: ");
            name = input.nextLine();
            result = result + name + ", ";

            System.out.println("Do you want to enter new guest name: ");
            answer = input.nextLine();

            if(answer.equalsIgnoreCase("no")) {
                break;
            }

        }
        System.out.println("Guest's list: "+ result.substring(0, result.length()-2));















//        do {
////            System.out.println("Please enter guest name: ");
////             name = input.nextLine();
////            result = result + name + ", ";
////
////            System.out.println("Do you want to enter new guest name: ");
////            answer = input.nextLine();
////
////        }while(answer.equalsIgnoreCase("yes"));
////
////        System.out.println(result.substring(0, result.length()-2));




    }
}
