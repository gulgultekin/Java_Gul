package day20_ArraysContinue;

import java.util.Arrays;

public class Arrays_Utilities {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

       String r= Arrays.toString(arr);
        System.out.println(r); //{1, 2, 3};

        System.out.println(arr);// Array must be coverted to string before we print // [I@1b6d3586

        String names[] ={"Madina","zehra","gul"};

        System.out.println(names); // we have to convert to the string

        System.out.println(Arrays.toString(names)); //{"Madina","zehra","gul"};

        double nums[]= {10, 20, 30};
        System.out.println(Arrays.toString(nums)); //[10.0, 20.0, 30.0]

        System.out.println(nums[0]+1); //11.0







    }
}
