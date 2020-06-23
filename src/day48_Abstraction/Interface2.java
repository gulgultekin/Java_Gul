package day48_Abstraction;

public interface Interface2 {

    int a = 100;// hemen initialize etmemiz lazim cunku--> final ayni zamanda--> default static

    // public static final int a = 100;  aslinda boyle ama yazmamiza gerek yok

    //public Interface2(){}  constructors only for  class, interface CANNOT have constructor

    // public void method1(){} // you can not have instance method in interface

  // {} instance variable olmadigi icin ins. block olmaz

      //static{}  variable final old icin tekrar initialize yapamayiz o yuden static block da olamaz

    public static void main(String[] args) {

        System.out.println(a); //by default static and final

          //a instance olsaydi static methodda obje olusturmadan cagrilamazdi
        // a = 200; // re-initialize yapamayiz cunku default final

        System.out.println(Interface2.a); // static variable can call from interface name

        Interface2.method4();//interface can have static method


    }

    public static void method4(){}//interface can have static method

     void method5(); //public abstract basinda yazilmayabilir ama default orada

     default void method6(){ // only can be created in the interface--> only for lambda expression

         System.out.println("Default method");
     }



}
