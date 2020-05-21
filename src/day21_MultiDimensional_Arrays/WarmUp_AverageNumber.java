package day21_MultiDimensional_Arrays;

import java.text.DecimalFormat;

public class WarmUp_AverageNumber {
    public static void main(String[] args) {
        /*
        warmup tasks:
	1. write a program that can return the average number from an array of integers
			ex:
				[1,2,3]
				average: 2
				[10, 15, 5, 6]
				average: 9
				[4, 5, 6, 7, 8, 10, 20, 30, 0]
				average: 10
				*/
        DecimalFormat DF = new DecimalFormat("0.00");

        int[] arr ={1,2,3,4,5,7,8};
        int sum=0;
        double average=0;

        for(int i=0; i<arr.length; i++){
            sum+=arr[i];

        }
        average=(double)sum/arr.length;
        System.out.println(DF.format(average));//formati kullanmasaydik 4.285714285714286
                       // format ile 4.29==> yuvarliyor








    }
}
