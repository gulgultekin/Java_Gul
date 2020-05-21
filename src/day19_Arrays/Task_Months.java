package day19_Arrays;

import java.util.Scanner;
import java.util.SortedMap;

public class Task_Months {
    public static void main(String[] args) {
        /*
        Create an array that holds 12 months names
        User should be able to enter month index
        and output should be:“The month name is <MonthName>”
         */
        Scanner scan= new Scanner(System.in);

        String[] monthName ={"January ","February ","March ","April ","May ","June ",
                       "July ","August ","September ","October ", "November ","December "};

        for(int i=0; i<12 ;i++){

            System.out.println("Enter a month number ");

            int monthNumber = scan.nextInt();

            if(monthNumber<1 ||monthNumber>12){
                System.out.println("Invalid entry");

            }else{

                System.out.println("The month name is: < "+monthName[monthNumber-1]+">");
            }

        }

    }
}
