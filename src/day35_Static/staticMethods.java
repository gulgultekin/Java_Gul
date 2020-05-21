package day35_Static;

public class staticMethods {

    int a= 100;
    static int b= 200;

    public static void main(String[] args) {

      //  System.out.println(a); // we need a object to call instance variable
            //static only accepts static


        staticMethods obj = new staticMethods();
        //System.out.println(a); // boyle yazinca hata veriyor cunku instance belongs to object, bu yuzden obje uzerinden cagirmamiz lazim

        System.out.println(obj.a); // boyle olur obje den

        System.out.println(b); // b static old icin boyle yazilabilir
        System.out.println(staticMethods.b);// yada class name uzerinden cagirilabilir
        System.out.println(obj.b); // boylede olur ama warning veriyor, cunku static preferred calling through classname not obj


    }


    public void method(){ // instance method belongs to the object

        System.out.println(a); //o yuzden instance method icinde boyle yazilabilir
        System.out.println(b); // static global old icin burada da cagirilabilir

    }



}
