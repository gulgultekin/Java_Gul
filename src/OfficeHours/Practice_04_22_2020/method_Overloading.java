package OfficeHours.Practice_04_22_2020;

public class method_Overloading {
    public static void main(String[] args) {

        method1();
        method1(5,8);
      int num1 = method1(5);
        System.out.println(num1);



    }

    public static void method1(){
        System.out.println("Hello Cybertek");


    }

    public static int method1(int a){
        System.out.println("Hello world");// bu print yapar, cunku return den once
        return 123;
    }

    public static void method1(int a, int b){
        System.out.println("Hello Batch 18");


    }
}
