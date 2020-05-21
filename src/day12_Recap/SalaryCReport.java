package day12_Recap;

import java.util.Scanner;

public class SalaryCReport{
    /*
    ask the user enter salary
    ask the user enter full name
    ask the user enter Company name
    ask the user enter SSN
    ask the user enter JobTitle
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter salary: ");
        double salary = scan.nextDouble();

        scan.nextLine();

        System.out.println("Please enter full name: ");
        String name = scan.nextLine();

        System.out.println("Please enter Company name: ");
        String companyName =scan.nextLine();

        System.out.println("Please enter SSN: ");
        long ssn = scan.nextLong();

        scan.nextLine();

        System.out.println("Please enter Job Title: ");
        String jobTitle = scan.nextLine();


        System.out.println("Name: "+name );
        System.out.println("Job Title: "+jobTitle );
        System.out.println("Company Name: "+companyName );
        System.out.println("SSN: "+ssn );
        System.out.println("Salary : $"+salary );



    }




}
