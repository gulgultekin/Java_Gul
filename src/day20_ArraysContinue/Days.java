package day20_ArraysContinue;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
  /*
  Create an array that holds the days
  User should be able to enter the day index
  and output should be:“Today is Monday”
   */
        String[]days ={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"}; //size: 7, max index: 6

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a number: ");

        int num= scan.nextInt();
        int attempts = 1;

        while(num >7 || num< 1){
            System.out.println("Invalid Entry Please re-enter");

            num = scan.nextInt();
            attempts++;


            if(attempts==3 && (num >7 || num< 1)){
                System.out.println("You already have 3 attempts");
               System.exit(0); // bunun yerine break koyarsak sadece looptan cikar
                                    // ama loop disindakileri print yapacagi icin burada system.exit(0) daha uygundur
            }

        }
          String result = "Today is "+ days[num-1];

        System.out.println(result);








    }
}
