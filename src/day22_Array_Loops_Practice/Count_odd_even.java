package day22_Array_Loops_Practice;

public class Count_odd_even {
    public static void main(String[] args) {
        /*
        4. write a program that can count the even and odd number from an array of integers
                        MUST use for each loop and continue statements
         */

        int[] arr = {1,2,3,4,5,6,7,8,9,10,11};

        int countOddNumbers = 0;
        int countEvenNumbers =0;

        for(int each: arr){

            if(each%2==0){
                countEvenNumbers++;
                continue; // eger even numbersa evencountu arttir ve  oddcountu skip yap demek
            }
            countOddNumbers++;

            // baska bir cozum yolu

           /* if(each%2==0){
                countEvenNumbers++;
            }else{
                countOddNumbers++;
            }*/

        }
        System.out.println("Even numbers: "+ countEvenNumbers); // 5
        System.out.println("Odd numbers: "+ countOddNumbers); // 6



    }
}
