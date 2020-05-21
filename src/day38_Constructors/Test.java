package day38_Constructors;

public class Test {

    static{
        System.out.println("Static block");
    }


    {
        System.out.println("instance block");
    }


    public Test(){
        System.out.println("Constructor block");
    }

//    public static void method(){
//        System.out.println("ins method");
//    }

    public static void main(String[] args) {

        new Test();//instance , constructor
        new Test();

        System.out.println("main method");
        //method();
    }

}
