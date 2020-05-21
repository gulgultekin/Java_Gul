package day18_NestedLoop;

public class Triangle {
    public static void main(String[] args) {

        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         * * * * * * *
         */

        int j = 1;
        while (j <= 7) {

            int i = 1;
            while (i <= j) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            j++;
        }

        System.out.println("++++++++++++++++++++++++");
        /* * * * * * * *
         * * * * * *
         * * * * *
         * * * *
         * * *
         * *
         *
         */

        int a = 7;
        while (a >= 1) {

            int i = 1;
            while (i <= a) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            a--;
        }


        for (int b = 9; b >= 0; b--) {

            for (int i = 1; i <= b; i++) {

                System.out.print("* ");
            }

            System.out.println();


        }
    }
}
