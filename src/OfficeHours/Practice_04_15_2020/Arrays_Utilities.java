package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class Arrays_Utilities {
    public static void main(String[] args) {
        /*
        Arrays_Pract.sort(arr):
        Arrays_Pract.equal(arr1,arr2):
        Arrays_Pract.toString():

        Arrays_Pract.deepToString()
         */

        int[] arr ={9,6,1,5,44,22};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr)); // [1, 5, 6, 9, 22, 44]

        int[] salaries ={10000,20000,33000,5000,150000};
        int length = salaries.length;
        int lastIndex= length-1;

        Arrays.sort(salaries);// ascending

        System.out.println(Arrays.toString(salaries));

        System.out.println("Min salaries :"+salaries[0]);
        System.out.println("Max salaries :"+salaries[lastIndex]);

        System.out.println("*******************************");

        int[] arr1 ={1,2,3};
        int[] arr2 ={1,3,2};
        System.out.println(Arrays.equals(arr1,arr2)); //false rkamlarin yeri degisik olursa false verir

        System.out.println("=====");

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1,arr2)); //true





    }
}
