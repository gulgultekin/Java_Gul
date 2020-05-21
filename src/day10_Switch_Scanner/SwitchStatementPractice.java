package day10_Switch_Scanner;

public class SwitchStatementPractice {
    public static void main(String[] args) {

        /*Write a program to display days:
         1-Monday
         2-Tuesday
         3-Wednesday
         4-Thursday
         5-Friday
         6-Saturday
         7- sunday
        */

        int number = 13;
        switch (number){
              //expression
            case 1:
                System.out.println("Monday");
                // case closed bunu yazmazsak sonuna kadar  print eder
                break;
            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid");
                break;
        }



    }
}
