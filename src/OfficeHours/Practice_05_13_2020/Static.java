package OfficeHours.Practice_05_13_2020;

public class Static {

    int instanceVariable = 100;
    static int staticVariable =200;

    public static void staticMethod(){
        System.out.println(staticVariable);
       // System.out.println(instanceVariable); static only accepts static
    }

    public void instanceMethod(){
      staticMethod();
        System.out.println(staticVariable);
        System.out.println(instanceVariable);

    }

    public static void main(String[] args) {
        System.out.println(staticVariable);
       // System.out.println(instanceVariable); // hata veriyor obje olusturmadan olmaz
        staticMethod();
        //instanceMethod(); //hata veriyor obje olusturmadan olmaz
    }



}
