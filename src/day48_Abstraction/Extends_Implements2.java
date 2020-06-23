package day48_Abstraction;


interface P{
    public abstract  void method1();
}


interface Q {

    int method2();
}


abstract class R{
    abstract void method3();

}


public class Extends_Implements2 extends R implements Q,P {
    //is a relation
    public static void main(String[] args) {
       // R obj = new R(); // abstract class is not concrete o yuzden no object
       // Q obj2 = new Q(); //objects are comes from class  interface are not class, constructor yok, obje olusturulamaz
    }
    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 10;
    }

    @Override
    void method3() {

    }
}
