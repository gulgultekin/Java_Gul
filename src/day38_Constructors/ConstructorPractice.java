package day38_Constructors;

public class ConstructorPractice {


    public ConstructorPractice(){
        this(5.5); //C
        System.out.println("A");
       // this(5.5); Constructor call must be the first statement in the constructor
    }



    public ConstructorPractice(int a){
        this(); //C A
       // this(10.4);  //One Constructor can ONLY call 1 constructor
        System.out.println("B");
    }


    public ConstructorPractice(double a){
       // this();  //constructor can not contain itself-> default olan zaten double olani contain ediyor.
        // O yuzden defaultu burada cagiramiyoruz
       // this(10);// int arg olan defaultu call yapmis-> default double call yapmis-> o yuzden double kendini call
          // yapiyor gibi old icin compiler error
        System.out.println("C");
    }

    public static void main(String[] args) {

        new ConstructorPractice(1);


    }

}
