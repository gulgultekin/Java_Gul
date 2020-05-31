package day45_Exception;


class A{
    public A(){
        System.out.println("A");
    }
}

class B extends A{
    public B(){
       // super();// boyle yazarakta cagirilabilir ama default old. cagirmaya gerek yok
        System.out.println("B");
    }
}


public class Test extends B {
    public Test(){
        System.out.println("C");
    }

    public static void main(String[] args) {
        B obje = new B(); //A B
        Test obje2 = new Test();//A B C
        A obje3 = new A(); //A

    }
}
