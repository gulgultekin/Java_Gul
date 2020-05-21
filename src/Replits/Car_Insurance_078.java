package Replits;

import java.util.Scanner;

public class Car_Insurance_078 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";

        System.out.println("Welcome to the CountyFarm car insurance!");
        //WRITE YOUR CODE HERE
        System.out.println("Enter your name");
        name = scan.nextLine();
        System.out.println("Do you have a US driver license?");
        String driverLicense = scan.next();
        if (driverLicense.equalsIgnoreCase("no")) {
            System.out.println("Invalid data!");
            System.exit(0);
        } else {
            premium += 0;
        }
        System.out.println("Enter your zip code");
        int zipCode = scan.nextInt();
        if (zipCode == 20910 || zipCode == 20740) {
            premium += 60.0;
        } else if (zipCode == 22102 || zipCode == 22103) {
            premium += 30.0;
        } else {
            premium += 50.0;
        }
        System.out.println("Is this vehicle Owned, Financed, or Leased?");
        vehicleOwnership = scan.next();
        if (vehicleOwnership.equalsIgnoreCase("owned")) {
            premium += 10.0;
        } else {
            premium += 20.0;
        }
        System.out.println("How is this vehicle primarily used?");
        vehicleUsage = scan.next();
        if (vehicleUsage.equalsIgnoreCase("Business")) {
            premium += 50.0;
        } else if (vehicleUsage.equalsIgnoreCase("Pleasure")) {
            premium += 10.0;
        } else if (vehicleUsage.equalsIgnoreCase("Commute")) {
            premium += 20.0;
            System.out.println("Days Driven To Work And/Or School");
            daysDrivenToWorkOrSchool = scan.nextInt();
            premium += daysDrivenToWorkOrSchool * 5.0;
            System.out.println("Miles Driven To Work And/Or School");
            milesToWorkOrSchool = scan.nextInt();
            premium += milesToWorkOrSchool;
        }
        System.out.println("How old are you?");
        int age = scan.nextInt();
        if (age < 16) {
            System.out.println("Invalid data!");
            System.exit(0);
        } else if (age > 16 && age < 18) {
            premium *= 20;
        } else if (age >= 18 && age <= 21) {
            premium *= 6;
        } else if (age > 21 && age < 25) {
            premium *= 2;
        }
        System.out.println("How many years you've been driving?");
        int exp = scan.nextInt();
        if (!(exp > 0 || age - exp > 16)) {
            System.out.println("Invalid data!");
            System.exit(0);
        } else if ((age - exp) >= 16) {
            premium -= (exp * 5);
        }
        System.out.println("Have you had any accidents in the last 5 years?");
        String answer = scan.next();
        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("How many?");
            accidentsAmount = scan.nextInt();
            premium += accidentsAmount * (premium * 0.2);
        } else {
            premium += 0;
        }
        System.out.println("Have you had continuous insurance for the past 12 months?");
        continuousInsurance = scan.next();
        if (continuousInsurance.equalsIgnoreCase("no")) {
            premium *= 2;
        } else if (continuousInsurance.equalsIgnoreCase("yes")) {
            premium += 0;
        }
        scan.nextLine();
        System.out.println("What is the highest level of education you have completed?");
        education = scan.nextLine();
        if (education.equalsIgnoreCase("PhD") || education.equalsIgnoreCase("Bachelors") || education.equalsIgnoreCase("Masters")) {
            premium = premium - (premium * 0.05);
        } else if (education.equalsIgnoreCase("Doctors")) {
            premium = premium - (premium * 0.1);
        } else {
            premium += premium * 0.05;
        }
        referenceNumber = name.charAt(0) + "" + name.charAt(1) + age +
                name.charAt(name.length() - 2) + name.charAt(name.length() - 1) + zipCode + education.replace(" ", "");
        referenceNumber = referenceNumber.toUpperCase();


        System.out.println(name + ", here's your quote!");
        System.out.println("Start Your Policy Today For: $" + premium);
        System.out.println("Reference number: " + referenceNumber);


    }
}
