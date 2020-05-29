package day42_Inheritance;


class test001{

    public test001(){
        System.out.println("A");
    }
}

public class Constructor001 extends test001 {

    public Constructor001(){

        System.out.println("B");
    }

    public static void main(String[] args) {
       Constructor001 obj = new Constructor001(); // A B child old icin parenttan default const auto cagiriliyor

       test001 obj2=new test001(); // A  parent classtan obje olustirdugumuz icin sadece onun const cagiriliyor
    }
}
