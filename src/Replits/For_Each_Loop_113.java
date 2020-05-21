package Replits;

public class For_Each_Loop_113 {
    /*
    Write a for loop that prints all the even integers from 80 through 20 inclusive, separated by spaces.
MUST USE FOR EACH LOOP
     */
    public static void main(String[] args) {

       int[] arr = new int[61];

       int i = 81;

        for (int each: arr) {
             i--;
            if (i%2 == 0 ) {
                System.out.print(i + " ");
            }

        }


        // for(int i=80; i>=20;i--) {
        // if(i%2==0){
        // System.out.print(i+" ");
        //}
    }
}
