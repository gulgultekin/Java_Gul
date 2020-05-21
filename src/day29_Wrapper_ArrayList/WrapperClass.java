package day29_Wrapper_ArrayList;

public class WrapperClass {

    public static void main(String[] args) {

        int a = 100; // primitive

        Integer b =200; // wrapper class

        short s1 = 200;

        int n1 = s1; // int short kabul ediyor ama Wrapper class Integer int ten baska birsey kabul etmez, hata verir
        // Integer N1 =s1; //  Integer is dedicated to int primitive

        Integer n2 = n1; // sadece int kabul ediyor

        //=======================================================

        int a1 = 20;
        float f1 = a1;

       // Float f2 = a1; // wrapper class are loyal--> yani sadece kendi turunu kabul ediyor Float--float, int kabul etmiyor

        Integer I1 =200;
        int a2 =I1;

        Byte B1 = 126;
        int a3 = B1;// primitives any wrapper class kabul ediyor
        // ama wrapper class her primitive kabul etmiyor sadece kendi primitive kabul ediyor





    }
}
