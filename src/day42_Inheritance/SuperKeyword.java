package day42_Inheritance;

class A{
    int a=100;
    public A(double b){
        System.out.println(this.a);//100
    }

}


public class SuperKeyword extends A{
    int a=200;

    public SuperKeyword(){
        super(10.5);//100
        System.out.println(super.a);//100
    }

    public static void main(String[] args) {

       // SuperKeyword obj = new SuperKeyword(); //100 100

        A obj2 = new A(2.0); //100
    }

}
