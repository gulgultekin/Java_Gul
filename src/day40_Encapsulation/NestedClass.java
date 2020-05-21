package day40_Encapsulation;

public class NestedClass {//out side class can not be static

    static class data{//nested inner class can be static
        static int a = 300;
        static int b = 100;

    }

    public static void main(String[] args) {

       // NestedClass.data// outside class name i ile inner class i cagirabiliyorsun
        System.out.println(NestedClass.data.a);
    }


}
