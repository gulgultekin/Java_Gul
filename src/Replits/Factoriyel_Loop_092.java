package Replits;

import java.util.Scanner;

public class Factoriyel_Loop_092 {
    /*
    In mathematics, the factorial of a positive integer n, denoted by n!,
    is the product of all positive integers less than or equal to n.
    Calculate factorial and output result to the console.
      Example:
        input: 5!--> 5*4*3*2*1=120
         output: 120

     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int n = scan.nextInt();
        long result=1;

        for(int i=1; i<= n; i++){
            result=result*i;
        }
        System.out.println(result);
    }
    }

