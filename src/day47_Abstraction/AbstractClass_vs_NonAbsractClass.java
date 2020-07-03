package day47_Abstraction;


final class Test1{ // normal (concrete) class

    public Test1(){} // can have default constructor
    public void method1(){} // can have instance method
    public static void method2(){} // can have static method
    //public abstract void method3();  // that can not be --> abstract method can only be in abstract class

    int a =100; //can have ins variable
    static int b =200; //can have static variable

    {  //can have ins block

    }

    static{ //can have static block

    }

}

abstract class Test2{ // abstract class because has abstract method

    public Test2(){}  //can have constructor
    public void method1(){}  //can have instance method
    public static void method2(){} //can have static method
    public abstract void method3(); //can have abstract method

    int a=100; //can have ins variable
    static int b =200; //can have static variable
    { //can have ins block
      //Test2 obj = new CountLetters(); you can not create object from abstract class
    }
    static{ //can have static block

    }
}



public class AbstractClass_vs_NonAbsractClass {


}
