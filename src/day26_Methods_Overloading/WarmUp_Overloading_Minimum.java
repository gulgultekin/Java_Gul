package day26_Methods_Overloading;

import java.util.Arrays;

public class WarmUp_Overloading_Minimum {
    /*
    3. write a method that can return the minimum number from an int array
	4. write a method that can return the minimum number from a double array
			NOTE: MUST apply method overloading
     */
    public static void main(String[] args) {

        int[] arr1 ={3,5,7,1,7};
        int result1 = minimumNumber(arr1);
        System.out.println(result1);

        double[] arr2 ={3.5, 4.5, 0.7, 11, 1.7};
        double result2 = minimumNumber(arr2);
        System.out.println(result2);


    }

    public static int minimumNumber(int[] arr){
        Arrays.sort(arr);
        int result= arr[0];
        return result;
    }


    public static double minimumNumber(double[] arr){
        Arrays.sort(arr);
        double result= arr[0];
        return result;
    }

}
