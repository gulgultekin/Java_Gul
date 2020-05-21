package Replits;
import java.util.*;

public class Fibonachi_155 {
    /*
    In Fibonacci series, next number is the sum of previous two numbers
    for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,  89,  144,……...
    The first two numbers of Fibonacci series are 0 and 1.
Given a number num, print n-th Fibonacci Number.

Input  : 2
Output : 1

Input  : 9
Output : 34
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num) {
        //WRITE YOUR CODE HERE

//        int t1 = 0, t2 = 1, sum = 0;
//        for (int i = 1; i <= num + 1; ++i) {
//            sum = t1 + t2;
//            t1 = t2;
//            t2 = sum;
//        }
//        System.out.println(sum - t1);

// iki farkli cozum


        int []fib=new int[num+1];
        int k=1;
        for (int i=1; i<fib.length;i++){
            fib[i]=k;
            k+=fib[i-1];
        }
        System.out.println(fib[num]);
    }
}







