package day41_Inheritance;

import day41_Inheritance.Data;

public class TestData extends Data {

    public static void main(String[] args) {

//        System.out.println(Data.a);
//        Data.method1();
//        //System.out.println(TestData.a); a variable Data claasina ait. import edilse bile inherit olmadigi icin cagirilamiyor
//        //TestData.method1();


        System.out.println(TestData.a);//inherit yapinca TestData classinadan cagirabiliyoruz extra copy yapilmis oluyor
        TestData.method1();


    }

}
