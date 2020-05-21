package Replits;

import java.util.Scanner;

public class OnlineBook_Merchant {
    public static void main(String[] args) {
        /*
          Online Book Merchants offers premium customers 1 free book with every purchase of 5 or more books
       and offers 2 free books with every purchase of 8 or more books.
       It offers regular customers 1 free book with every purchase of 7 or more books,
      and offers 2 free books with every purchase of 12 or more books.
     Write a program that assigns freeBooks the appropriate value based on the values
     of the boolean variable isPremiumCustomer and the int variable nbooksPurchased.
     Print amount of freeBooks into the console.
         */
        int freeBooks = 0;
        Scanner scan = new Scanner(System.in);
        boolean isPremiumCustomer = scan.nextBoolean();
        int nbooksPurchased = scan.nextInt();

        if(isPremiumCustomer){
           if( nbooksPurchased>=8){
               freeBooks+=2;
           } else if (nbooksPurchased < 8 || nbooksPurchased >= 5) {
               freeBooks+=1;
           }
            System.out.println(freeBooks);
         }else{
            if(nbooksPurchased>=12){
                freeBooks+=2;
            }else if(nbooksPurchased>=7 ||nbooksPurchased<12){
                freeBooks+=1;
            }
            System.out.println(freeBooks);
        }

    }
}
