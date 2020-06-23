package day47_Abstraction;


abstract class A{  //super class
    public abstract void method1();
    public void method2(){}
}


public  class Abstract_vs_NonAbsract2 extends A { //Mandatory to override the abstract method of A
  // sub classda abstract olabilir ama obje olusturulamaz

    // 2 method ama ikiside instance not abstract (A classindan inherit old icin method1 ve method2 var)
    @Override
    public void method1() { } //Mandatory to override the abstract method of A
                              // instance method override yapmak gerekmiyor sdece abstract methodu override mandatory

}

abstract class B extends A{ //optional to override the abstract method of A
  //A clasindan inherit old icin method1 ve method2 vvar
    //one abstract and 1 instance method
  @Override
  public void method1() {

  }

    @Override
    public void method2() {
        super.method2();
    }
    //public abstract void method1();


}

class C extends B{

    @Override
    public void method1() {

    }


}