package day50_Polymorphism;


interface I{

    void method2(); // public abstract
    abstract int method3();

   // protected abstract void method4(); // only access modifier --> public


    //public I(){}// no constructor in interface
    //public void m(){}//no instance method

    //{} // no instance block
    //static{}   no static block

    int a= 1000; // this is static final by default
    // no instance variables
    public static void main(String[] args) {
        System.out.println(a);// static variable old icin static methodda direct cagirilabilir
    }

}

interface I2{

}




abstract class A{

    int a= 10; //instance variable
    static int b= 20; //static variable
    {
        // instance blok
    }

    static{
        //static block
    }

    public A(){//constructor

    }

    public abstract void method1();
    protected abstract void method4();
    abstract void method5();
}



public class Abstraction extends A implements I,I2 {
     //abstract class olamdigi icin abstract methodlar MUST Be override

    // public abstract void method1(); //abstract class olamdigi icin abstract method olmaz

    @Override
    public void method1() {

    }

    @Override  //anitation
    protected void method4(){

    }

    @Override
    void method5() {

    }


    @Override
    public void method2() {

    }

    @Override
    public int  method3() {
     return 3;
    }
}
