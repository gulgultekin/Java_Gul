package day18_NestedLoop;

public class Nested_Loop2 {
    public static void main(String[] args) {

        /*
        make triangle

         */

        for (int j = 1; j <= 10; j++) {

            for (int i = 1; i <= j; i++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println("=================================");
        /*
         * * * * * * * * *
         * * * * * * * *
         * * * * * * *
         * * * * * *
         * * * * *
         * * * *
         * * *
         * *
         *
         */
        System.out.println("============================");

        for (int j = 9; j >= 0; j--) {

            for (int i = 1; i <= j; i++) {
                System.out.print("* ");
            }
            System.out.println();

        }


        for (int b = 9; b >= 0; b--) {

            for (int i = 1; i <= b; i++) {

                System.out.print("* ");
            }

            System.out.println();


/*
            for (int jj = 1; jj <= 10; jj++) {
                for (int i = jj; i <= 10; i++) {
                    System.out.print("* ");
                }
                System.out.println();
                System.out.println("*********************");

*/


        }
    }
}


