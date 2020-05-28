package OfficeHours.Practice_05_27_2020;

public class MethodOverriding2 {

 protected void method1(){ }

 public static void method2(){ }

 public MethodOverriding2(){}
}


class TextClass extends MethodOverriding2{

    @Override
    protected void method1(){ } // only instance method CAN BE overriden

    //@Override  static method CAN NOT BE overriden
    public static void method2(){ }

    //public MethodOverriding2(){} //constructor CAN NOT BE overriden--> constructor name MUST BE SAME with class Name
}