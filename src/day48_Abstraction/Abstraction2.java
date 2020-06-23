package day48_Abstraction;


interface A1{
    void method1(); //public
}

interface B1{
   abstract void method2(); //public
}

interface C1{
   public abstract int method3();
}
public class Abstraction2 implements A1,B1,C1 { // 1 class implement more than 1 interface


    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }


    public int method3() {

        return 10;
    }
}
