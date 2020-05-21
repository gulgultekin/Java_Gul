package day38_Constructors;

public class ConstructorCalls3 {


    public ConstructorCalls3(){
        this(9);// int argument& default            //chain relation
        System.out.println("Default Constructor");
    }



    public ConstructorCalls3(int a){
        // this(); //constructor can not contain itself -cunku default cons. int arg ile olani cagirmisti orada onun bilgileri oluyor
        // this(5); Constructor cannot call it self
        System.out.println("Constructor with int argument");
    }


    public ConstructorCalls3(String str){


        System.out.println("Constructor with string argument");
    }

    public void method1(){
       // this(); Only a constructor can call another constructor
    }

    public static void main(String[] args) {

         new ConstructorCalls3();


    }


}
