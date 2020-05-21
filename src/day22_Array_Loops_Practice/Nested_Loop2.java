package day22_Array_Loops_Practice;

public class Nested_Loop2 {
    public static void main(String[] args) {
                //  i==>    0 1   0 1 2   0 1 2 3
        int[][] numbers={  {1,2},{3,4,5},{6,7,8,9}};// bu arrayin lengthi 3
             //    k==>     0       1        2
        /*
           numbers[0] ==>{1,2}       numbers[0][i] i needs to be repetad 2 times ( butun elemanlari reitrew icin)
           numbers[1] ==>{3,4,5}     numbers[1][i] i needs to be repetad 3 times
           numbers[2] ==>{6,7,8,9}   numbers[2][i] i needs to be repetad 4 times

         */

        for(int k=0; k<numbers.length; k++) {

            for (int i = 0; i < numbers[k].length; i++) {
                System.out.print(numbers[k][i]+" ");  // 1 2 3 4 5 6 7 8 9
            }
            System.out.println(); // bu her 1D arrayin ayri ayri print edilmesini saglar

            /*               System.out.println();
               1 2         her bir looptan sonra line i break yapacagi icin alt alta print yapar
               3 4 5
               6 7 8 9   seklinde print eymek icin bos bir statement vermemiz gerekiyor ki line i break yapsin
             */

            //REVERSE ARRAY

            // numbers={  {1,2},{3,4,5},{6,7,8,9}}
              //          2 1   5 4 3    9 8 7 6

            for(int j =0; j< numbers.length; j++){ // j==>index num of 1D arrays

                for(int i= numbers[j].length-1; i>=0; i--){ // i==> index of elements in 1D
                    System.out.print(numbers[j][i]+" ");// 2 1 5 4 3 9 8 7 6
                }
            }
            System.out.println();


            // numbers={  {1,2},{3,4,5},{6,7,8,9}}
                  //6 7 8 9   3 4 5   1 2

            for(int n = numbers.length-1; n>=0; n--) { // n: index num of 1D arrays(reversed)

                for(int i=0; i< numbers[n].length; i++){
                    System.out.print(numbers[n][i]+" ");  //6 7 8 9 3 4 5 1 2
                }
            }

            System.out.println();

           // numbers={  {1,2},{3,4,5},{6,7,8,9}}
            // 9 8 7 6 5 4 3 2 1

            for(int j=numbers.length-1; j>=0; j--){
                for(int i= numbers[j].length-1; i>=0; i--){
                    System.out.print(numbers[j][i]+" ");  // 9 8 7 6 5 4 3 2 1
                }
            }



        }

    }
}
