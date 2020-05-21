package day03_VariablesContinue;

import java.sql.SQLOutput;

public class SalaryCalculator {

     /*write a program that can calculate the taxt, and salary after tax based on the hourly rate & tax rates
			ex:
				if:
					rate = 55;
					stateTax = 0.04;
					federalTax =0.22;
					weeklyHours = 40;
				then output will be:
					your salary is: 105600 USD
					your total tax is: 27456 USD
					your income after tax is: 78144 USD
					*/
     public static void main(String[] args) {
         // DataType variableName = Data;
            double hourlyRate = 55;
            double stateTaxRate = 0.04;
            double federalTaxRate = 0.22;
            byte weeklyHours = 40;
            byte totalWeeksInAYear = 52;

            double salary = hourlyRate*52*weeklyHours; // total salary before tax
            double stateTax = stateTaxRate* salary;
            double federalTax = federalTaxRate*salary;
            double totalTax = stateTax + federalTax;

            double salaryAfterTax = salary-totalTax;


            System.out.println("Your salary is :" + salary+" USD"+"\nYour total tax is : "+ totalTax +" USD"
                    + "\nYour income after tax is : "+ salaryAfterTax + " USD");

         System.out.println("*********************");

         System.out.println("Your Salary is : $"+ salary);
         System.out.println("State tax is : $"+ stateTax);
         System.out.println("Federal tax is : $"+ federalTax);
         System.out.println("Total tax is : $"+ totalTax);
         System.out.println("Your net salary is : $"+ salaryAfterTax);

        }
    }


