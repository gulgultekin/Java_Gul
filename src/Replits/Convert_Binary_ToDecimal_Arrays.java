package Replits;

import java.util.Scanner;

public class Convert_Binary_ToDecimal_Arrays {
    /*
    Binary number is a number expressed in the base-2 numeral system or binary numeral system,
    which uses only two symbols: typically 0 (zero) and 1 (one). Each digit is referred to as a bit.

Given an array binary with 8 integers (0s or 1s), write java program to calculate decimal value and print out to console.
 Feel free to use additional arrays or formulas.

    128  64  32  16  8  4  2  1
    0    0   0   0   0  1  1  1

Example:
binary -> [0, 0, 0, 0, 0, 0, 1, 1]
print 3

binary -> [0, 0, 1, 0, 0, 0, 1, 1]
print 35

binary -> [1, 1, 1, 1, 1, 1, 1, 1]
print 255

     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] binary = new int[8];

        for (int i = 0; i < binary.length; i++) {
            binary[i] = input.nextInt();
        }

        //TODO: Write your code below.
        int result=0;
        for(int i =0; i< binary.length; i++){
            result+= binary[i]*Math.pow(2,binary.length-i-1);

    }
        System.out.println(result);
}

}
