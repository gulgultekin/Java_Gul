package day23_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class Max_Min_Numbers_Array {
    /*
    4. creat a a function that can print the maximum number from any given array
	5. creat a a function that can print the minimum number from any given array
	6. creat e a function that can print out the array in descending order
		[1,2,3] == > [3,2,1]
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter array of number");
        int[] arr  = new int[5];

        for (int i = 0; i <5 ; i++) {
            arr[i] = scan.nextInt();
        }

        MaxMinNumber(arr);
        descendingOrder(arr);
    }

    public static void descendingOrder(int[] arr) {

        Arrays.sort(arr);

        int[] res = new int[arr.length];
         int j = 0 ;
        for(int i=arr.length-1; i>=0; i--){
            res[j]=arr[i];
            j++;
        }

        // baska bir yolla descending

         //for (int i = 0; i <arr.length ; i++) {
         //   res[i] = arr[arr.length-1-i];
         // }

        System.out.println("in descending order: " + Arrays.toString(res));


                }


        public static void MaxMinNumber(int[] num){

        Arrays.sort(num);
        System.out.println("Maximum number is :"+ num[num.length-1]);
        System.out.println("Minimum number is: "+ num[0]);
        }

        }
