package Z_Java_Tekrar.Day22_Tekrar;

import java.util.Arrays;

public class Even_Numbers {
    public static void main(String[] args) {
      /*  Warmup tasks:
        Task01:
        1. create an int array called numbers that has length of 100
        2. assign 1~100 to the array' each indexes
        3. use for each loop to rpint out all the even numbers.
                MUst use continue statement*/

      int[] numbers= new int[100];

      for(int i=0; i< numbers.length ; i++){

          numbers[i]=i+1;

          }
        System.out.println(Arrays.toString(numbers));

      for( int each: numbers){

          if(each %2==0){
              System.out.print(each+" ");
              continue;
          }

      }




    }
}
