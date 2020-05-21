package day19_Arrays;

import java.util.Scanner;

public class Array_Task_Kisa_Yol_print {
    public static void main(String[] args) {
        /*
         // write a program that asks "enter a name' and store each of the name in the array student
         */

       Scanner scan=new Scanner (System.in);

        String[] students = new String[10];

        String name ="";

       for(int i = 0; i < 10 ; i++){

           System.out.println("Enter name");

           name=scan.nextLine();

           students[i] = name;

       }

        System.out.println("Print names: ");

        for (String s: students){
            System.out.println(  s.toUpperCase());
        }




    }
}
