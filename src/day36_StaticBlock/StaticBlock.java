package day36_StaticBlock;

public class StaticBlock {



    public static void main(String[] args) {

        System.out.println("Main method");
        method1();
    }


    public static void method1(){

        System.out.println("custom method");
    }

    static{
        System.out.println("Static method ");
    }


}
