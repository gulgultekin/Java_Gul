package day48_Abstraction;

abstract class T{
    //public default void method2(){}// hata verir cunku --> only for interface


}


public interface DefaultMethod {

    default void method(){ //default method can only be in interface
                      // lambda expression icin
        System.out.println("default method"); // it can only be executed in sub class
    }

    public static void main(String[] args) {

        // method();//static olmadigi icin hata verir,
       // DefaultMethod obj = new DefaultMethod();  // interface old icin obje olusturulamaz
        //bu yuzden default method sdece sub classda execute edilir.

    }

}

class N implements DefaultMethod{

    public static void main(String[] args) {
        N obj = new N();
        obj.method();  //default method inherited old icin calisir
    }
}
