package day10_Switch_Scanner;
import java.util.Scanner;
public class RateCalculator {
    public static void main(String[] args) {
        // asks the user to enter salary
       // asks the user how many hours does she works in a week
        //print the hourly rate

        Scanner input = new Scanner(System.in);//this is called creating object

        System.out.println("please enter your salary : ");
        int salary = input.nextInt();

        System.out.println("please enter how many hours do you work per week : ");
        byte weeklyHours = input.nextByte();

        System.out.println("How many weeks do you work in a year? ");
        byte numberOfWeeks = input.nextByte();

        int hourlyRate= (salary/numberOfWeeks)/weeklyHours;
        System.out.println("Your hourly rate is $"+ hourlyRate+ " with tax");





    }


}
