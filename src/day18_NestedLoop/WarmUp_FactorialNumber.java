package day18_NestedLoop;

import java.util.Scanner;

public class WarmUp_FactorialNumber {
    public static void main(String[] args) {
         /*2. write a program that can return the factorial number of any given number
			Ex:
				input: 5
				output: 120
			because:
				5! = 5 * 4 * 3 * 2* 1 = 120
         */
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a number");
        long number= scan.nextLong();

        long factorial=1;

        while(number>=1){

            factorial*=number; // factorial=factorial*number

            number--;
        }
        System.out.println(factorial);

    }
}
