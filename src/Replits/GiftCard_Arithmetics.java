package Replits;

import java.util.Scanner;

public class GiftCard_Arithmetics {
    public static void main(String[] args) {
        /*
        Let's say I've got a 100$ gift card and you want to buy something in your online store .
         Write a program that will help me to buy something and display leftover balance after purchase.
         If item is not in the list, display message: "Invalid item!".
         If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".
Hint
Use if/ else if / else
CODE EXAMPLE:
Example #1
input: Hat
output: Thank you for your purchase!
output: Your current balance is: 75$

Example #2
input: Pants
output: Thank you for your purchase!
output: Your current balance is: 50$

Example #3
input: Laptop
output: Sorry, not enough funds on your gift card!

Example #4
input: Cupcake
output: Invalid item!
List of items



         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your item");
        String item=scan.nextLine();

        double giftCard= 100.00;
        double Charger =15.00;
        double USBcable=10.00;
        double HeadPhones =30.00;
        double Pants =50.00;
        double Socks =5.00;
        double Blanket =60.00;
        double Pillow = 40.00;
        double Laptop =400.00;

        if(item.equalsIgnoreCase("Charger")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: $" + (giftCard-Charger));

        }else if(item.equalsIgnoreCase("USBcable")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: $" + (giftCard-USBcable));

        }else if(item.equalsIgnoreCase("HeadPhones")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: $" + (giftCard-HeadPhones));

        }else if(item.equalsIgnoreCase("Pants")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: $" + (giftCard-Pants));

        }else if(item.equalsIgnoreCase("Socks")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: $" + (giftCard-Socks));

        }else if(item.equalsIgnoreCase("Blanket")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: $" + (giftCard-Blanket));

        }else if(item.equalsIgnoreCase("Pillow")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: $" + (giftCard-Pillow));

        }else if(item.equalsIgnoreCase("Laptop")){
            System.out.println("Sorry, not enough funds on your gift card!");

        }else{
            System.out.println("Invalid item!");
        }



    }
}
