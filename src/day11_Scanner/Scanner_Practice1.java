package day11_Scanner;

import java.util.Scanner;

public class Scanner_Practice1 {
    /*
       Task_Max: Scanner_Practice1
   1. ask the user enter first name
   2. ask user to enter last name
   3. ask the user employeed or not? true ==> employeed, false ==> unemployeed
   4. if he is employeed , ask the salary
   4. if he is not employeed set the salary to 0
   output:
       full name:
       employeeed status:
       salary:
        */
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = scan.next();

        System.out.println("Enter your last name: ");
        String lastName = scan.next();

        String fullName = firstName +" "+ lastName;

        System.out.println("Are you employeed?");
        boolean employmentStatus = scan.nextBoolean();

        double salary=0;
        if(employmentStatus==true){
            System.out.println("Enter your salary: ");
            salary = scan.nextDouble();
        }//burada else blok a ihtiyac yok cunku unemployee ise  basta salaryi zaten 0 verdik


        System.out.println("Full name is : "+fullName);
        System.out.println("Employeed : " +employmentStatus);
        System.out.println("Salary: $"+salary);


    }
}
