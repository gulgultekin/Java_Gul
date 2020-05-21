package day42_Inheritance;


class Test{

    public Test(int a){
        this(2.5);//C A
        System.out.println("A");
    }

    public Test(double a){
        System.out.println("C");
    }
}


public class Constructor2 extends Test {

    public Constructor2(){
        super(10); // if parent class constructor not default we should call it manually with super();
        //  super(10.5)  // Test parent clasindaki constructorlardan  birini cagirmamiz gerekiyor . ikisi birden cagirilmaz hata verir
        System.out.println("B");
    }

    public static void main(String[] args) {

        Constructor2 obj = new Constructor2();//C A  B
       // Test obj2 = new Test(12);// A

    }
}
