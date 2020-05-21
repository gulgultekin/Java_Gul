package day26_Methods_Overloading;

public class Method_Overloading {

    public static void main(String[] args) {
        method(10); // Original method

        method(10.0);// Overloaded method

    }


    public static void method(int a){
        System.out.println("Original method");

    }

    public static void method(double a){
        System.out.println("Overloaded method");

    }



}
