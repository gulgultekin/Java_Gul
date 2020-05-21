package Z_Java_Tekrar.Methods_Practice;

import java.util.Arrays;

public class Method_OverLoading {

    // overloading--> same method, different parameters
    // overload method example--> the sort method of Array class, it accepts all data type(int, byte...)


    public static int sum(int a, int b) {

        return a + b;
    }

    public static double sum(double a, double b){
        return a+b;

    }

    public static int sum (int a, int b, int c){

        return a+b +c;
    }

    public static void main(String[] args) {
        int result = sum(4,6,9);
        System.out.println(result);

        System.out.println(sum(5,6.0));

        System.out.println(sum(3,7));

        int[] arr = {90,66,33,6};
        Sort(arr);

        System.out.println();

        char[] ch = {'a','g','w'};
        Sort(ch);

        System.out.println();

        String[] str ={"a","aa","dss","abc"};
        Sort(str);

    }

    // int array descending order

    public static void Sort(int[] arr){

            Arrays.sort(arr);

        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }

    public static void Sort(char[] arr){

        Arrays.sort(arr);

        for (int i = arr.length-1; i >=0; i--) {
            System.out.print(arr[i]+" ");

        }
    }


    public static void Sort (String[] arr){
        Arrays.sort(arr);

        for (int i= arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }



}