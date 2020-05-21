package day29_Wrapper_ArrayList;

import java.util.Arrays;

public class WarmUp_WrapperClass {
    /*
    Given:
	String[] arr = {"1","2.5", "3", "3.5", "4.5"}
	find the maximum and minimum numbers
		NOTE: Do not use sort method
     */
    public static void main(String[] args) {

//        double[] arr = {1, 2.5, 3, 3.5, 4.5};  // eger bu double array olsaydi boyle yapacaktik
                                                  // ama soruda String array old icin once double ceviriyoruz
//
//        double max =Double.MIN_VALUE;
//
//        for(double each: arr){
//
//            if(each > max){
//                max = each;
//            }
//
//        }
//        System.out.println(max);

        String[] arr = {"1","2.5", "3", "3.5", "4.5"};

        double max =Double.MIN_VALUE;

        for(String each: arr){
            double num =Double.valueOf(each);

            if(num > max){
               max = num;
            }

        }
        System.out.println(max);


        System.out.println("**********************************");

        String[] arr2 = {"1","2.5", "3", "3.5", "4.5"};

        double[] numbers = new double[arr2.length]; //[0.0, 0.0, 0.0, 0.0, 0.0]

        for(int i=0; i<arr2.length;i++){

            numbers[i] = Double.parseDouble(arr2[i]);
        }

        System.out.println(Arrays.toString(numbers)); // [1.0, 2.5, 3.0, 3.5, 4.5]

        Arrays.sort(numbers);

        System.out.println(numbers[numbers.length-1]); //4.5



    }
}