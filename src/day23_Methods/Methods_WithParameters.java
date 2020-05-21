package day23_Methods;

import java.util.Scanner;

public class Methods_WithParameters {


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your age");
        byte age = scan.nextByte();

        EligibleToBuyAlcohol(age);// explicit casting

    }



    public static void EligibleToBuyAlcohol(byte age){

        if(age>=21){
            System.out.println("Eligible to buy alcohol");
        }else{
            System.out.println("Eligible to buy milk");
        }

    }



}
