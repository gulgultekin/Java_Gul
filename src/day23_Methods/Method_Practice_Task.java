package day23_Methods;

public class Method_Practice_Task {
    /*
    1. write a method that can print all odd number between 1~100
    2. write a method that can print all even number between 1 ~ 100
     */
    public static void main(String[] args) {

        oddNumbers1_100();
        System.out.println();
        evenNumbers1_100();

    }




    public static void oddNumbers1_100(){

        for(int i=1; i<= 100; i++){

             if(i%2!=0){
                 System.out.print(i+ " ");

             }
        }

    } // sol taraftaki + ya basinca expand yapiyor



    public static void evenNumbers1_100(){

        for(int i=1; i<= 100; i++){

            if(i%2==0){
                System.out.print(i+" ");

            }
        }

    }




}
