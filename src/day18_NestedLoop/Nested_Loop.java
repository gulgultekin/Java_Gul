package day18_NestedLoop;

public class Nested_Loop {
    public static void main(String[] args) {

        for (int j = 0; j < 10; j++) {

            for (int i = 1; i <= 5; i++) {//1 2 3 4 5 --> bunu 10 kere yazdirmak icin bir ust loop kullaniyoruz
                System.out.print(i + " ");
            }

            System.out.println();//it is for break the line --alt alta yazdiriyoruz
        }

        System.out.println("=================================");
        /*
         *****
         *****
         *****
         *****
         *****
         */

        for (int i = 0; i < 7; i++) { // outter loop repeating the inner loop over and over again


            int a = 1;
            while (a <=50) {

                System.out.print("* ");

                a++;
            }
            System.out.println();

        }
    }
}