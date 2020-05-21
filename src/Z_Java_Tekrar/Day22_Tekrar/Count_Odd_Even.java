package Z_Java_Tekrar.Day22_Tekrar;

public class Count_Odd_Even {
    public static void main(String[] args) {
        /*
        4. write a program that can count the even and odd number from an array of integers
                        MUST use for each loop and continue statements
         */

        int[] arr = {1,2,3,4,5,6,7,8,9,10,11};

        int countEven =0;
        int countOdd =0;

        for(int each : arr){
            System.out.println(each);
            if(each %2== 0){
                countEven++;
            }else{
                countOdd++;
            }
        }
        System.out.println(countEven);
        System.out.println(countOdd);



    }
}
