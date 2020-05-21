package OfficeHours.Practice_04_08_2020;

public class WhileLoop_practice {
    public static void main(String[] args) {

        /*
        while(condition){
           statements
        }
        repeated if statement
         */

        for(int i= 0; i<=5; i+=2 ) {

            System.out.println("hello world " + i);
        }
            System.out.println("**********************");

        int z=0;
        while(z<5){

            System.out.println("Hello Cybertek"+ z);
            z++; // bunu yazmazsak infinite tam execute
        }

        System.out.println("**********************");


        int num=0;
        while(num<=100){
            if(num%15==0){
                System.out.print(num+" ");
            }

            num++;
        }








    }
}
