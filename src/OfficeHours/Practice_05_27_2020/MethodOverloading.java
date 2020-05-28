package OfficeHours.Practice_05_27_2020;

public class MethodOverloading {
    public void method(){

        System.out.println("a");
    }
                                    // method name MUST BE same
    private void method(int a){     //parameter MUST BE different
        System.out.println("b");    //return type can be same or different
    }                               // access-modifier can be different

    protected String method(double a){
        return "c";
    }

    public static void method2(){ //static method can be overloading

    }

    public static int method2(int a){

        return 123;
    }

    public MethodOverloading(){

    }

    public MethodOverloading(int a){ // constructor can be overload-->
                                  //  parameter MUST be different

    }

    public static void main(String[] args) {
        MethodOverloading obj=new MethodOverloading();
        obj.method();
        obj.method(10);
        System.out.println(obj.method(8.9));
    }
}
