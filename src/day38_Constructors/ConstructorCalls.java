package day38_Constructors;

public class ConstructorCalls {
    //Only a constructor can call another constructor
    // Constructor cannot be called by their name, We MUST use this() keyword

    //Constructor call must be the first statement in the constructor
    //One Constructor can ONLY call 1 constructor
    // Constructor cannot call it self
    //constructor can not contain itself


    public ConstructorCalls(){

        method1();
        method2();

    }

    public ConstructorCalls(int a){
     this();// used for calling constructor

    }


    public static void method1(){

       // method2(); instance method old icin call yapamiyoruz
       // ConstructorCalls(); only constructor can call another constructor
    }

    public void method2(){

        method1();

    }


}
