package OfficeHours.Practice_04_08_2020;

public class ForLoops_Practice {
    public static void main(String[] args) {

        /*
        for(initializatin; condition; iterator ){
           iterator : co-related to your condition
         */

        for(int i= 0; i<=5; i+=2 ){ // iterator koymazsak infinite time print yapar

            System.out.println("hello world "+i);

        }
        System.out.println("******************************");


        for( int i=1; i<=5; ){
            i++;  // it execute first before statement
            System.out.println((i)); // 2, 3, 4, 5, 6,
        }


    }
}
