package day44_Exceptions;

public class Unchecked {

    public static void main(String[] args) {

        System.out.println("Test started");// hepsinden once yazildigi icin print eder sonra hata verir.top to bottom

       // System.out.println(9/0); // ArithmeticException bundan sonraki print yapmasi icin bunun duzeltilmesi lazim

        String str = "Cybertek";
       // System.out.println(str.charAt(-1));//String index out of range: -1

        int[]arr ={1,2,3};
         System.out.println(arr[10]); //ArrayIndexOutOfBoundsException

        System.out.println("Test completed");

    }

}
