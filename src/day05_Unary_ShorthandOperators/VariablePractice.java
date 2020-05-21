package day05_Unary_ShorthandOperators;

public class VariablePractice {
    public static void main(String[] args) {
         // whole number: byte , short, int, long
        //decimals: float, double

        int a1 = 100;
        float f1 = (long) a1;
                //f1 = 100L;
                //f1 = 100.0;
        System.out.println(f1); //100.0

        long l1 = (long)f1;
         // l1 = 100
        System.out.println(l1); // 100

        String name;
        // System.out.println(name); local variables cannot be used without initializing

        name ="Cybertek";

        System.out.println(name);// name must be initialized before use it.
    }
}
