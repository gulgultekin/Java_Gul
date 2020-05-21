package Resources;

import day42_Inheritance.Data;

public class Inheritance extends Data {
         //    sub               super

    public static void main(String[] args) {
        System.out.println(Inheritance.publicData);  // public and protected inherited any sub class
        System.out.println(Inheritance.protectedData);  // even different package

       // System.out.println(Inheritance.defaultData); //default baska package inherit edilmez
        // System.out.println(Inheritance.privateData); // private old icin inherit edilmez
    }








}
