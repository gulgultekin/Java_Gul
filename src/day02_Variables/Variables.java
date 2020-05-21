package day02_Variables;

public class Variables {

    public static void main(String[] args) {

        /*
        decleare variables:
        Datatype variableName = Data;
         */
        byte l = 4;
        byte w = 2;
        byte area = 8;
        System.out.println(l);
        System.out.println(w);
        System.out.println(area);

        // byte num = 130; exceeds the range of byte
        // byte num = 2.5; byte,short, int, long they only accept whole numbers

        short num3 = 1000;
        // short num4 = 40000; exceeds the range of short

        System.out.println(num3);

        System.out.println(12345 ); // by default compiler takes it as int primitive

        int n1 = 20000;
        System.out.println(n1);
        // int n2 = 10000000000; out of int  range

        // long n3 = 99999999999;  out of int range. compiler by default takes it as int
        // compiler long yazsanda int olarak algiliyor onun icin sonuna L(lowcase or uppercase)yazmamiz gerekiyor.

        long n4 = 999999999999L; // forcefully telling the compiler that this is long data number

        System.out.println(n4);
        System.out.println(8888888888888L);

        long n5 = 19; // burada hata vermiyor cunku bunu int olarak goruyor zaten

            // double > float > long > int > short > byte
         // int num6 = 7L; // larger one cannot be assigned to smaller one

        short s1 = 10;
        // byte b1 = s1; short is larger than byte

        int i1 = s1;
        // byte b2 = i1; larger one cannot be assigned to smaller one

        double d1 = 3.5;
        System.out.println(d1);

        // float f1 =4.5; double primitive is larger than float primitive, cannot assigned
        // f koymadan yazinca compiler onu double olarak algiliyor ve double > float

        float f2 = 5.5f;
        System.out.println(f2);

        System.out.println("\n=================================");


        double pi = 3.14f;
        System.out.println(pi);

        int a1 = 3000;

        double d2 = a1; // int < double old icin a1=d2 diyebiliriz. ama 3000.0 olarak print yapar
        System.out.println(d2);

    }
}
