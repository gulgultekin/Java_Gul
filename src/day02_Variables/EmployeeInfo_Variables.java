package day02_Variables;

import java.sql.SQLOutput;

public class EmployeeInfo_Variables {
    public static void main(String[] args) {

        /* your company's name
                your name
                your EmployeeId
                your JobTitle
                your Salary
                */

        String companyName = "Cybertek";
        String employeeName = "Gul Gultekin";
        int employeeID = 1234;
        String jobTitle = "QA";
        int salary = 130000;
        int ssn = 123456;

        System.out.println("Company Name" + companyName);
        System.out.println("Employees name: " +employeeName);
        System.out.println("Emp ID " + employeeID);
        System.out.println("Job Title : " +jobTitle);
        System.out.println("Salary : " +salary);
        System.out.println("SSNumber : " + ssn);

        System.out.println(employeeName +" works at "+ companyName + " as a " + jobTitle+
                "\n with this Emp ID: "+ employeeID + "\n salary of : $"+ salary);

        System.out.println("=============================");

        System.out.println("Employees Name: " + employeeName + "\nCompany Name: " + companyName +
                "\nEmployees ID: " + employeeID + "\nJob Title: " + jobTitle +
                "\nSalary: " + salary + "\nSSN: " + ssn);

        System.out.println("===============================");

        String firstName = "Gul";
        String lastName = "Gultekin";

        System.out.println("Full Name : "+ firstName + " " + lastName);

        System.out.println("***************************");

        System.out.println(11+10); //21 edition
        System.out.println("11"+"10"); //1110  concatenation




    }



}











