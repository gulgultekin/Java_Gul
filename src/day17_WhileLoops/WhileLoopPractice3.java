package day17_WhileLoops;

public class WhileLoopPractice3 {

    public static void main(String[] args) {

       for(int i=1; i<=100; i++){
           System.out.print("*");
       }

        System.out.println();

       //while loop ile

        int i=1;
       while(i<=100){
           System.out.print("* "+i);

           i++;
       }

        System.out.println();




       /*
       ****
       * *
       * *
       ***
        */
        int number =0;

            System.out.println("*******");

        while(number< 3){
            System.out.println("*     *");
            number++;
        }
            System.out.println("*******");


    }
}
