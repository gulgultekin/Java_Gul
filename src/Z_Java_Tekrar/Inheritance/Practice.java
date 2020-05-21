package Z_Java_Tekrar.Inheritance;

class A{

    public A(int a){
        //this(2.2f);
        System.out.println("int");
    }

    public A(double a){
        this(10);
        System.out.println("double");
    }

    public A(float a){
        System.out.println("Float");
    }
    public A(){
        //this(5.5);//float int double def B
        System.out.println("default");
    }

}


public class Practice extends A{

    public Practice(){
        super();
        System.out.println("B");
    }

    public static void main(String[] args) {

        Practice obj = new Practice();
    }

}
