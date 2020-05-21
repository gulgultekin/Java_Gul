package day37_Constructors;

public class ConstructorIntro {

    public ConstructorIntro(int a){ // constructor name must be same with className
        // constructor with argument
        System.out.println("Constructor with argument of int: "+a);
    }

    public static void main(String[] args) {

       // ConstructorIntro obj =new ConstructorIntro(); // yukardaki constructorla ayni olmali yoksa hata veriyor.
                                 // yani parameter(argument) vermemiz lazim

        ConstructorIntro obj =new ConstructorIntro(15);

        ConstructorIntro obj2 =new ConstructorIntro(10);



    }

}
