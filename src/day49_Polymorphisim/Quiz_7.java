package day49_Polymorphisim;


interface A{
     void readBook(); //public abstract
    abstract void watchTV(); // public
}

abstract class B implements A{

    @Override
    public void readBook(){//it is already overrided--> instance method oldu
        // oyuzden asagidaki classda tekrar override olmasina gerek yok
        System.out.println("reading book");
    }
  // abstract void watchTV();
}



public class Quiz_7 extends B {
    @Override
    public void watchTV() {
        System.out.println("watching tv");
    }


}
