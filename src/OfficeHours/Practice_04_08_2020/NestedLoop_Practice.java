package OfficeHours.Practice_04_08_2020;

public class NestedLoop_Practice {
    public static void main(String[] args) {
        /*
        nested loop: loop inside another loop
        inner loop& outer loop
        nested loop:
         */
       int j=5;

       while(j < 10){

           for(int i =10; i <=50; i+=10){
               System.out.print(i+" ");
           }

           System.out.println();

           j++;
       }

        System.out.println("====================");

       /*
       * * * * * *
       * * * * * *
       * * * * * *
       * * * * * *
       * * * * * *
       * * * * * *
       * * * * * *

        */
       int a=1;
       while(a<=8){                  //for(inta =0; a<=8; a++)  for loop ile

           for(int k =0; k<=5; k++){
               System.out.print("* ");
           }
           System.out.println();


           a++;
       }

        System.out.println("========================");

       // print triangle

      for(int b=0; b<=7; b++){

            for(int k =0; k<= b; k++){
                System.out.print("* ");
            }
            System.out.println();

        }


      //reverse triangle

        for(int b=7; b>0; b--){

            for(int k =0; k<= b; k++){
                System.out.print("* ");
            }
            System.out.println();

        }



    }
}
