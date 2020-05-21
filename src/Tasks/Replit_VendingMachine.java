package Tasks;

import java.util.Scanner;

public class Replit_VendingMachine {
    /*Write a program that determines the change to be dispensed from a vending
machine. An item in the machine can cost between 25 cents and 1 dollar, in 5-cent
increments (25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single
dollar bill to pay for the item.

- int variable itemPrice
- int variables quarters, dimes, nickels
- Scanner object

Program accepts itemPrice, which is a price for the item you would like to purchase.

Positive behaviour:

Please follow the example in the image. dots mean empty space.
-Since the item price was entered 95, change is 1 nickels

Negative behaviour:

If itemPrice is less than 25 or more than 100 cents, then display error message:
Invalid price!

If itemPrice is not divisible by 5, then also display error message:
Invalid price!

use (itemPrice % 5 == 0) expression to find it is divisible by 5.

Do not display anything else.



     */
    public static void main(String[] args) {
        //ENTER CODE HERE
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter price in cents:");

        int itemPrice = scan.nextInt();

        if (itemPrice < 25 || itemPrice > 100 || (itemPrice % 5 != 0) ) {
            System.out.println("Invalid entry");
        }
        else
        {
            int change=(100-itemPrice);
            int quarterCount =  change / 25;
            int remainder1 =  change % 25;
            int dimeCount = remainder1 / 10;
            int remainder2 = remainder1 % 10;
            int nickelCount = remainder2 / 5;

            System.out.println("When you give $1 for " +itemPrice+ "cents item. You will get back "+
                    quarterCount+ (quarterCount>1 ? "quarters " :"quarter ")+
                    dimeCount + (dimeCount > 1 ? "dimes " : "dime ") +
                    nickelCount+ (nickelCount > 1 ? "nickels " :"nickel ") );

        }



    }
}
