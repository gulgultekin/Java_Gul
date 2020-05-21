package Z_Java_Tekrar.day23_Tekrar;

import java.util.Arrays;
import java.util.Scanner;

public class Methods_Max_Min {

    /*
    4. creat a a function that can print the maximum number from any given array
	5. creat a a function that can print the minimum number from any given array
	6. creat e a function that can print out the array in descending order
		[1,2,3] == > [3,2,1]
     */
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        int[] arr= new int [5];


        for(int i=0; i< 5; i++){
            arr[i] = scan.nextInt();
        }
       // int[] arr = {1,5,9,7,6}; scannersiz olursa

        Max_Min_Numbers(arr);
        DescendingOrder(arr);
    }



    private static void DescendingOrder(int[] arr) {
        Arrays.sort(arr);

        int[] result= new int [arr.length];

        for(int i=0; i<arr.length; i++){
            result[i]= arr[arr.length-1-i];

        }
        System.out.println("Descending order: "+Arrays.toString( result));

    }




    public static void Max_Min_Numbers(int[] arr){

        Arrays.sort(arr);
        System.out.println("Max is: "+ arr[arr.length-1]);
        System.out.println("Min is: "+ arr[0]);




    }

}
