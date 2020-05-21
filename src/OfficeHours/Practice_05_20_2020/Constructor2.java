package OfficeHours.Practice_05_20_2020;


class test{

    public test(String str){
        System.out.println("String");

    }

    public test(int a){
        System.out.println("int");

    }
    public test(double a){
        System.out.println("double");

    }
}


public class Constructor2 extends test {

   public Constructor2(){//String
       super("Hello");
       System.out.println("default");// string default
    }

    public static void main(String[] args) {

        Constructor2 obj = new Constructor2();
    }


}
