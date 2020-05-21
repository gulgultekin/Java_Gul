package Replits;

import java.util.Scanner;

public class Car_Factory {
    public static void main(String[] args) {
        /*
        Clunker Motors Inc. is recalling all vehicles in its Extravagant line from model years 2010-2012
        as well all vehicles in its Guzzler line from model years 2015-2018.
        A boolean variable named recalled has been declared.
        Given a variable year and a String model write a statement that prints true to recalled
       if the values of year and model match the recall details and prints false otherwise.
         */

            Scanner scan = new Scanner(System.in);
            String model = scan.next();

            int year = scan.nextInt();
            boolean recalled = false;

            if((year>=2010 && year<2013)&&(model.equalsIgnoreCase("Extravagant "))){
                recalled = true;
                System.out.println(recalled);
            }else if( year>=2015 && year<2019 && model.equalsIgnoreCase("Guzzler") ){
                recalled = true;
                System.out.println(recalled);
            }else{
                System.out.println(recalled);
            }

        }



    }


