package day24_Methods;

import java.util.Arrays;

public class TasksFromYesterday {
     /*
    4. creat a a function that can print the maximum number from any given array
	5. creat a a function that can print the minimum number from any given array
	6. creat e a function that can print out the array in descending order
		[1,2,3] == > [3,2,1]
     */




     public static void MaxNumber(int[] array){
         Arrays.sort(array);
         System.out.println("Maximum number is :"+ array [array.length-1] );

     }

     public static void MinNumber(int[] arr ){

         Arrays.sort(arr);
         System.out.println("Minimum number is: "+ arr[0]);
     }

     public static void Descending(int[] array){
         Arrays.sort(array);


         for(int i=array.length-1; i>=0; i--){

             System.out.print( array[i]+" ");

         }
         System.out.println();

     }





    public static void main(String[] args) {
        int[]arr ={10,8,9,5,3,2,1,4};
        // MaxNumber( 10 );// if parameter is array, the argument MUST be array
        MaxNumber(arr);

        MinNumber(arr);

        Descending(arr);

        int[] arr2={100,300,500,240,600,-100};

        MaxNumber(arr2);

        MinNumber(arr2);

        Descending(arr2);
    }




}
