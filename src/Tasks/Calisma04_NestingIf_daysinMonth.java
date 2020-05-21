package Tasks;

public class Calisma04_NestingIf_daysinMonth {
    public static void main(String[] args) {

         /* 2. write a program that can find the number of days in a month
        (Assume that Feb has 28 days)

        int month = 0~12;
     1     2    3    4   5    6    7   8     9   10    11   12
    jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec
    31    28   31   30   31   30   31   31   30   31   30   31

       28 days: 2
       30 days: 4,6,9,11
       31 days: 1,3,5,7,8,10,12
          Must use Nested if
         */

         //iki turlu yazilabilir

        int month =8;
        if (month == 1) {
            System.out.println("31 days");
         if (month == 2) {
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
            } else if (month % 2 == 0) {
                //month greater than 7, if it is even number==>31 days
                System.out.println("31 days");
            } else {
                System.out.println("30 days");
            }

        }
        else {
            System.out.println("invalid entry");

        }

        // boyle de yazilabilir
        /*
        28 days: 2
       30 days: 4,6,9,11
       31 days: 1,3,5,7,8,10,12
       Leap year=29
         */
        int month2 =2;
        int year =2020;
        if(month2>0 && month2<13){
            if(month2==2) {
                if (year % 4 == 0) { //condition for leaap year
                    System.out.println("29 days");
                } else {
                    System.out.println("28 days");
                }
            }
            else if (month2 == 4 || month2 == 6) {
                    System.out.println("30 days");
                } else if (month2 == 9 || month2 == 11) {
                    System.out.println("30 days");
                } else { //31 days: 1,3,5,7,8,10,12

                    System.out.println("31 days");
                }

        }
        else{
            System.out.println("invalid entry");
        }
    }
}
