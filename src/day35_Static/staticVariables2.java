package day35_Static;

public class staticVariables2 {


        int insVariable;  // every single object of the class has its own copy

        static int staticVariable; // there is only 1 copy of static shared by all objects (static can not have more than 1 copy)

    public static void main(String[] args) {

        staticVariables2 obj1 = new staticVariables2();
        obj1.insVariable =300;
        obj1.staticVariable =400;

        staticVariables2 obj2 = new staticVariables2();


        System.out.println(obj1.insVariable); //300
        System.out.println(obj2.insVariable); //0 iinstance old icin herbiri farkli

        System.out.println(obj1.staticVariable);
        System.out.println("**********************");
        obj2.staticVariable =888;
        System.out.println(obj2.staticVariable);
        System.out.println();

        System.out.println(obj1.staticVariable); //400

        System.out.println(obj2.staticVariable); //400  static olunca hepsinde ayni result


        System.out.println(staticVariables2.staticVariable); //400
          // static can be called through class name

      // System.out.println(staticVariable2.insVariable); // instance can NOT be called throgh class name


    }
}
