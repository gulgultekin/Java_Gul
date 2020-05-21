package day26_Methods_Overloading;

import java.util.Arrays;

public class WarmUp_Overloading_Maximum {
    /*
    warmup task:
	1. write a method that can return the maximum number from an int array
	2. write a method that can return the maximum number from a double array
			NOTE: MUST apply method overloading
	3. write a method that can return the minimum number from an int array
	4. write a method that can return the minimum number from a double array
			NOTE: MUST apply method overloading
	5. write an int[] return method that can sort an int array in desending order
	6. write a double[] return method that can sort a double array in desending order
	7. write a char[] return method that can sort a char array in desending order
			NOTE: MUST apply method overloading
     */
    public static void main(String[] args) {
        int[] arr1 = {4,9,22,65,54,33};
        int result1 = maximumNumber(arr1);
        System.out.println(result1);

        double[] arr2 = {42.3, 92.1, 2.2, 6.5, 54,3.3};
        double result2 = maximumNumber(arr2);
        System.out.println(result2);
    }


    public static int maximumNumber(int[] arr){

        Arrays.sort(arr);
        int result= arr[arr.length-1];
        return result;
    }

    public static double maximumNumber(double[] arr){
        Arrays.sort(arr);
        double result= arr[arr.length-1];
        return result;
    }



}
