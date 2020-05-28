package OfficeHours.Practice_05_27_2020;

public class MethodOverriding {

    public void method1(){

        System.out.println("Super class");
    }


}

class Test extends MethodOverriding{

    @Override
    public void method1(){

        System.out.println("Sub class");
    }

    public static void main(String[] args) {

        Test obj = new Test();
        obj.method1();//Sub class

        MethodOverriding obj1 = new MethodOverriding();
        obj1.method1(); //Super class

    }

}