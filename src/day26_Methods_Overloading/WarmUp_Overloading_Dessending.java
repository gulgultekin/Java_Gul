package day26_Methods_Overloading;

import java.util.Arrays;

public class WarmUp_Overloading_Dessending {
    /*
    5. write an int[] return method that can sort an int array in desending order
	6. write a double[] return method that can sort a double array in desending order
	7. write a char[] return method that can sort a char array in desending order
			NOTE: MUST apply method overloading
     */
    public static void main(String[] args) {
        int[] arr1 = {4,6,7,2,9};
       int[] result1 = descending(arr1);

        System.out.println(Arrays.toString(result1));


        double[] arr2 = {41.3, 5.6, 17,1,2.9};
        double[] result2 = descending(arr2);

        System.out.println(Arrays.toString(result2));



        char[] ch={'f','e','i','g','a'};
        char[] result3= descending(ch);
        System.out.println(Arrays.toString(result3));

    }

    public static double[] descending(double[] arr){

        Arrays.sort(arr);
        double[] descending =new double[arr.length];
        int j=0;
        for(int i= arr.length-1; i>=0; i--){
            descending[j] = arr[i];
            j++;
        }
        return descending;

    }


    public static int[] descending(int[] arr){

        Arrays.sort(arr);
        int[] descending =new int[arr.length];
        int j=0;
        for(int i= arr.length-1; i>=0; i--){
            descending[j] = arr[i];
            j++;
        }
        return descending;

    }

    public static char[] descending(char[] ch){
        Arrays.sort(ch);
        char[] descending = new char[ch.length];
        int j=0;
        for(int i= ch.length-1; i>=0; i--){
            descending[j]=ch[i];
            j++;
        }
        return descending;
    }









}
