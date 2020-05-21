package day38_Constructors;

public class ConstructorCalls2 {

    public ConstructorCalls2(){

        System.out.println("Default Constructor");

    }


    public ConstructorCalls2(int a){
        this(); //Default Constructor
       // this(5); Constructor cannot call it self
        System.out.println("Constructor with int argument");
    }

    public ConstructorCalls2(String str){
      //  System.out.println(); // Constructor call must be the first statement in the constructor or compile error verir

        this(20); // default & int argument  //chain relation

       // this(); One Constructor can ONLY call 1 constructor
        System.out.println("Constructor with string argument");
    }

    public static void main(String[] args) {

        ConstructorCalls2 obj = new ConstructorCalls2(10);
        ConstructorCalls2 obj2 = new ConstructorCalls2("Hello");

    }

}
