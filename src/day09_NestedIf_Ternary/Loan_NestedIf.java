package day09_NestedIf_Ternary;

public class Loan_NestedIf {
    public static void main(String[] args) {

        double salary = 100000;
        byte workHistory = 1;

        if (salary >= 30000) {

            if (workHistory >= 2) {
                System.out.println("You are qualified to loan");
            } else {
                System.out.println("You must have been on job at least 2 years.");
            }
        } else {
            System.out.println("You must earn at least $30000.");
        }

    }
}
