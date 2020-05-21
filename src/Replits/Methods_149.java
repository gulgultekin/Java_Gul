package Replits;

import java.util.Arrays;

public class Methods_149 {
    /*
    add_to_r is a method that gets an array and a number.

the method creates a new array bigger by one then (int[] r).
It populates the new array with the old ones(r) values.
and finally in the last position adds the number (int n) to it.

for example:

method input: add_to_r(new int{1,5,77,8}  ,2)

outputs (int array):
[1, 5, 77, 8, 2]

     */

    public static void main(String[] args) {
        int[] r={1,2,3,4};
        int n=6;

        add_to_r( r,n);



    }


    public static void add_to_r(int[] r,int n) {
        //create new array with one more position.
        int l = r.length;
        int[] arr = new int[l+ 1];

        for (int i = 0; i <r.length ; i++) {
            arr[i] = r[i];
        }
        arr[arr.length-1] = n;

        System.out.println(Arrays.toString(arr));
    }
    }
