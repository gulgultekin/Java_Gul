package Replits;

import java.util.Arrays;

public class Assessment_3_3 {
    /*
    Write the definition of a method reverse, whose parameter is an array of Strings.
    The method reverses the elements of the array. The method returns an array of strings in the reversed order.
Example:
input: ["apple", "pear"]
output: ["pear", "apple"]
     */
    public static void main(String[] args) {
       String[] arr = {"apple", "pear"};


       String[]rev = reverse(arr);
        System.out.println(Arrays.toString(rev));
    }

    /**
     * Reverses the order of the elements in the specified array
     * @param arr
     * @return array of strings
     */
    public static String[] reverse(String[] arr) {
        String[] rev = new String[arr.length];
        int j=0;
        for(int i=arr.length-1; i>=0; i--){
            rev[j] = arr[i];
            j++;
        }

        return rev;
    }

}
