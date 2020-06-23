package day46_Final_Abstract;

public class Final_Practices {

    final int a = 10;
    final static int b = 20;

    {

        System.out.println(a);
        //a = 20; // can Not be reassigned
    }

    static{
        System.out.println(b);
        //b =80;  final old icin reassigned olmaz.
    }

    public Final_Practices(){
        //constructor can not final
    }

    public final void method1(){
        //instance method can be final
    }

//    public  void final method3(){  final keyword must come before return type
//        //instance method can be final
//    }
     public final static void method2(){
         //static method can be final
        // final public  static void method2-->bu sekildede yazilabilir

    }

final class text extends Final_Practices{//final class can be subclass

//        protected void method1(){
//           // final method can not be override
//        }

    public void method1(int a){
        //it is not override -->Overloading
    }

    private final int method2(int a){//overloading
        return 12;
    }

    }

}
