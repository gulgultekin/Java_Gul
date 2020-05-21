package Tasks;

import java.util.Scanner;

public class Calisma07_Scanner2 {
    /*
     Write a program that calculates the sum of numbers
     entered by the user until user enters a negative number.
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Please enter numbers");
        int num1= scan.nextInt();
        int num2=scan.nextInt();
        int num3 = scan.nextInt();

        int sum=0;
        num1 = num1 > 0? num1 :0;
        num2 = num2 > 0? num2 :0;
        num3 = num3 > 0? num3 :0;

        sum=num1 +num2 + num3;
        System.out.println("sum is: "+ sum);





    }
}
