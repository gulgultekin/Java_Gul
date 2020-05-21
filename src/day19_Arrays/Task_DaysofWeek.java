package day19_Arrays;

import java.util.Scanner;

public class Task_DaysofWeek {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String[]days ={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        for(int i=0; i<7 ; i++){

            System.out.println("Enter a number for day");
            int num = scan.nextInt();

            if(num<1 || num>7){
                System.out.println("Invalid entry");

            }else{
                System.out.println("Today is: "+ days[num-1]);
            }


        }



    }
}
