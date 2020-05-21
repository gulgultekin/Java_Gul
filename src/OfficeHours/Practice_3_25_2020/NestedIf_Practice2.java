package OfficeHours.Practice_3_25_2020;

public class NestedIf_Practice2 {
    public static void main(String[] args) {

        /*
        for the loan:
        if he/she has a job that pays >50000$ ====> might be eligible
        if he/she has good credit
        if job history is  more than or equal two years ==> then eligible
         */

        int salary = 55000;
        short creditScore= 750;
        byte jobHistory = 10;

        if(salary>50000){ //might be eligible

            if(creditScore>650){//might be eligible

                if(jobHistory>=2){ // eligible for loan
                    System.out.println("You are qualified");

                }else{// not eligible due to job history
                    System.out.println("You do not have enough job history, come back later.");
                }

            }else{ // not eligible due to credit score
                System.out.println("Your do not have good credit score");
            }

        }else{ // not eligible due to salary
            System.out.println("Your salary should be more than $50000");
        }





    }
}
