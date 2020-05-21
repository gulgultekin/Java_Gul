package Replits;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

        /*
        Write your code inside the method.
Use the values given as method parameters.
Assign final values.
Then user should select service quality that will correspond to tip percent.
Poor = 5%
Fair = 10%
Good = 15%
Great = 20%
Excellent = 25%
The program should display the following information based on the user input:
Split or No split
Number of people entered: &&&&
Service Quality:
Total to pay:
Total tip:
Total per person:
Tip per person:
https://itunes.apple.com/us/app/ihandy-tip-calculator/id324501526?mt=8

Input:
Split:Yes
Number of people:4
Check amount:476.0
Service Quality:Excellent

Output:

Number of people entered: &&&&
Total to pay: 595.0
Total tip: 119.0
Total per person: 148.75
Tip per person: 29.75
         */

        Scanner scan=new Scanner(System.in);

        System.out.println("Split:");
        String split = scan.next();

        System.out.println("Number of people:");
        int people = scan.nextInt();

        System.out.println("Check amount:");
        double checkAmount = scan.nextDouble();

        System.out.println("Service Quality:");
        String quality = scan.next();

        String NumofPeople = (people == 1) ? "&" : (people == 2) ? "&&"
                : (people == 3) ? "&&&" : (people == 4) ? "&&&&" : "&&&&&";

        double tip = (quality.equals("Poor")) ? checkAmount*0.05 : (quality.equals("Fair"))
                ? checkAmount*0.1 : (quality.equals("Good")) ? checkAmount*.15 : (quality.equals("Great"))
                ? checkAmount*.2 : (quality.equals("Excellent")) ? checkAmount*.25 : 0.0;

        System.out.println("Number of people entered: "+NumofPeople);

        System.out.println("Total to pay: "+(checkAmount+tip));

        System.out.println("Total tip: "+tip);

        System.out.println("Total per person: "+(checkAmount+tip)/people);

        System.out.println("Tip per person: "+tip/people);

    }
}
