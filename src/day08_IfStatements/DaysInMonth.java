package day08_IfStatements;

public class DaysInMonth {
    public static void main(String[] args) {
        /* 2. write a program that can find the number of days in a month
        (Assume that Feb has 28 days)

        int month = 0..12;
     1     2    3    4   5    6    7   8     9   10    11   12
    jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec
    31    28   31   30   31   30   31   31   30   31   30   31

       28 days: 2
       30 days: 4,6,9,11
       31 days: 1,3,5,7,8,10,12

         */

        byte month =10;

        if (month == 1) {
            System.out.println("31 days");
        } else if (month == 2) {
            System.out.println("28 days");
        } else if (month == 3) {
            System.out.println("31 days");
        } else if (month == 4) {
            System.out.println("30 days");
        } else if (month == 5) {
            System.out.println("31 days");
        } else if (month == 6) {
            System.out.println("30 days");
        } else if (month == 7) {
            System.out.println("31 days");
        } else if (month == 8) {
            System.out.println("31 days");
        } else if (month == 9) {
            System.out.println("30 days");
        } else if (month == 10) {
            System.out.println("31 days");
        } else if (month == 11) {
            System.out.println("30 days");
        } else if (month == 12) {
            System.out.println("31 days");
        } else {
            System.out.println("Invalid Entry");
        }


        //bu sekilde de yazilabilir

       /* 2. write a program that can find the number of days in a month
                (Assume that Feb has 28 days)
        byte month =  3
        28 days: 2
        30 days: 4,6,9,11
        31 days: 1,3,5,7,8,10,12
        */

       boolean days28 = month ==2;
       boolean days30 = month ==4 || month ==6 || month ==9 || month ==11;
       boolean days31 = days28==false && days30 == false;
       //boolean days31 = !days28 && !days30;  bu da dogru

       /* if(days28){
            System.out.println("It has 28 days");
        }
        if(days30){
            System.out.println("It has 30 days");
        }
        if(days31){
            System.out.println("It has 31 days");
        }
        bu sekilde de yazilabilir ya da asagidaki gibi
        */

        int days = 0;
        if(days28){
            //  System.out.println("It has 28 days");
            days = 28;
        }

        else if(days30){
            //  System.out.println("It has 30 days");
            days =30;
        }

       else  if(days31){
            //   System.out.println("It has 31 days");
            days = 31;
        }
        else {
            System.out.println("Invalid Entry");
        }

        System.out.println("It has "+days +" days");

         // 1 print statement at the end --Bu sekilde de yazilabilir

        String result = " ";
        if (month == 1) {
            result ="January has 31 days";
        } else if (month == 2) {
            result = "February has 28 or 29 days";
        }
          else if (month == 3) {
            result ="March 31 days";
        }
          else if (month == 4) {
            result ="April 30 days";
        }
          else if (month == 5) {
            result ="May 31 days";
        }
          else if (month == 6) {
            result ="June 30 days";
        }
          else if (month == 7) {
            result ="July 31 days";
        }
          else if (month == 8) {
            result ="August 31 days";
        }
          else if (month == 9) {
            result ="September 30 days";
        }
          else if (month == 10) {
            result ="October 31 days";
        }
          else if (month == 11) {
            result = "November 30 days";
        }
          else if (month == 12) {
            result ="December 31 days";
        }
          else {
            System.out.println("Invalid Entry");
        }
        System.out.println(result);





    }
}
