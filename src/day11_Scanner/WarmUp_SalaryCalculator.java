package day11_Scanner;

import java.util.Scanner;

public class WarmUp_SalaryCalculator {
    public static void main(String[] args) {
        /*
         2. write a program that can calculate the salary after tax
                needed informations:
                                employee' salaray
                                state tax
                                federal tax
                                must use scanner
          state tax=0.04
          federal tax=0.22
         */
        Scanner scan =new Scanner(System.in); //scanner object
        System.out.println("Please enter your salary ");

    /*  double salary = scan.nextDouble();
        double stateTax = salary*0.04;
        double federalTax = salary*0.22;
        double totaltax = stateTax +federalTax;
        double incomeAftertax = salary-totaltax;
      */
        int salary= scan.nextInt();
        System.out.println("Enter the state tax : ");
        byte stateTax = scan.nextByte();
        double stateTaxpercentage=stateTax/100.0;// 100.0 yaziyoruz ki tax'i decimal olarak hesaplayabilelim

        System.out.println("please enter federal tax: ");
        byte federaltax = scan.nextByte();
        double federaltaxpercentage = federaltax/100.0;

        double totaltax= (federaltaxpercentage +stateTaxpercentage)*salary;
        double salaryAftertax= salary-totaltax;

        System.out.println("Your salary after tax is : $ "+salaryAftertax);
        System.out.println("Total tax you paid is : $"+ totaltax);
    }
}
