package Replits;

import java.util.Arrays;

public class Reverse_Array_Asses_3_3 {
    /*
    Write the definition of a method reverse, whose parameter is an array of Strings. The method reverses the elements of the array. The method returns an array of strings in the reversed order.
Example:
input: ["apple", "pear"]
output: ["pear", "apple"]
     */

    public static void main(String[] args) {

        String[] arr = {"apple", "pear"};
        String[] result = reverse(arr);
        System.out.println(Arrays.toString(result));
    }

    /**
     * Reverses the order of the elements in the specified array
     * @param arr
     * @return array of strings
     */
    public static String[] reverse(String[] arr) {
        String[] arr1 = new String[arr.length];
        for(int i=arr.length; i>=0; i--){
           arr1[i]+=arr[i];
        }

        return arr1;
    }
}
