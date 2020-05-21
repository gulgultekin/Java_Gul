package day24_Methods;

import java.util.Scanner;

public class BirthYear {

    public static void main(String[] args) {

        Age((short)1973); // compalier int olarak aliyor. bu yuzden explicit casting yapiyoruz

       //ustteki gibi yada alttaki gibi de olabilir

         int a = 1998;
        Age((short)a);

    }




    public static void Age(short birthYear){

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the current year");
        int currentYear = scan.nextInt();

        currentYear =2020;
        int age= currentYear-birthYear;

        if(age > 0 && birthYear > 1900){
            System.out.println(age);
        }else{
            System.out.println("Invalid birth year");
        }

        System.out.println(age);

    }

}
