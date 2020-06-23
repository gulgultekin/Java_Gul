package day48_Abstraction;

public interface Interface3 {

    public void method1(); //abstract method

    public abstract void method2();//abstract method;

    static final int num = 100; // by default public

    int num2 = 300; // by default --> public static final

    public static void main(String[] args) {

        System.out.println(num2); // static old icin direct cagiriliyor

        //method1(); you can not direct call abstract method--> cunku meant to be inherited
        Interface3.method3(); //static method old icin isimle cagiriliyor
    }


    static void method3(){ //static method can NOT be abstract o yuzden body olamsi lazim
       //public --> default var, yazmaya gerek yok
    }
}
