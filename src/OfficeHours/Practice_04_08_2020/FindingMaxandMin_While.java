package OfficeHours.Practice_04_08_2020;

import java.util.Scanner;

public class FindingMaxandMin_While {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        int i=1;

        int max= -2147483648;
        int min= 2147483647;

        while(i <= 5){

            System.out.println("Enter a number");
            int num = scan.nextInt();

            if(num > max){
              max = num ;
            }
            if(num < min){
                min = num;
            }

            i++;
        }
        System.out.println("Maximum number is: "+ max);
        System.out.println("Minimum number is: "+ min);
















    }
}
