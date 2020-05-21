package Replits;

import java.util.Scanner;

public class Tipcalculator2 {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE

        Scanner scan=new Scanner(System.in);
        System.out.println("Split:");
        String split = scan.next();

        System.out.println("Number of people:");
        int people = scan.nextInt();

        System.out.println("Check amount:");
        double amount = scan.nextDouble();

        System.out.println("Service Quality:");
        String service = scan.next();

        String peoplenumber = (people == 1) ? "&" : (people == 2) ? "&&"
                : (people== 3) ? "&&&" : (people== 4) ? "&&&&"
                : (people == 5) ? "&&&&&" : "";
        System.out.println("Number of people entered: " +peoplenumber);

        String service1 = "Poor";
        String service2 = "Fair";
        String service3 = "Good";
        String service4 = "Great";
        String service5 = "Excellent";

        if (service.equals(service1)) {
            double totaltip = amount * 5 / 100;
            double totaltopay=totaltip+amount;
            double totalperperson=totaltopay/people;
            double tipperperson=totaltip/people;

            System.out.println("Total to pay: "+totaltopay);
            System.out.println("Total tip: " + totaltip);
            System.out.println("Total per person: "+totalperperson);
            System.out.println("Tip per person: "+tipperperson);

        } else if (service.equals(service2)) {
            double totaltip = amount * 10 / 100;
            double totaltopay=totaltip+amount;
            double totalperperson=totaltopay/people;
            double tipperperson=totaltip/people;

            System.out.println("Total to pay: "+totaltopay);
            System.out.println("Total tip: " + totaltip);
            System.out.println("Total per person: "+totalperperson);
            System.out.println("Tip per person: "+tipperperson);

        } else if (service.equals(service3)) {
            double totaltip = amount * 15 / 100;
            double totaltopay=totaltip+amount;
            double totalperperson=totaltopay/people;
            double tipperperson=totaltip/people;

            System.out.println("Total to pay: "+totaltopay);
            System.out.println("Total tip: " + totaltip);
            System.out.println("Total per person: "+totalperperson);
            System.out.println("Tip per person: "+tipperperson);

        } else if (service.equals(service4)) {
            double totaltip = amount * 20 /100;
            double totaltopay=totaltip+amount;
            double totalperperson=totaltopay/people;
            double tipperperson=totaltip/people;

            System.out.println("Total to pay: "+totaltopay);
            System.out.println("Total tip: " + totaltip);
            System.out.println("Total per person: "+totalperperson);
            System.out.println("Tip per person: "+tipperperson);

        } else {
            double totaltip = amount * 25 / 100;
            double totaltopay=totaltip+amount;
            double totalperperson=totaltopay/people;
            double tipperperson=totaltip/people;

            System.out.println("Total to pay: "+totaltopay);
            System.out.println("Total tip: " + totaltip);
            System.out.println("Total per person: "+totalperperson);
            System.out.println("Tip per person: "+tipperperson);
        }
    }
}
