package OfficeHours.Practice_06_17_2020;

public class Test2 {
    public static void main(String[] args) {


        //&     &&

        //|     ||


        System.out.println(false && true); // &&  --> sol tarfa bakiyor false ise sagi cek yapmiyor
                                         // & --> iki tarafida cek yapiyor
        int one = 0;

        System.out.println(one++ > 0  && ++one > 0); //false
        System.out.println(one);//1


        int two = 2;
        System.out.println(two ==2 ||3/0 ==0); //true  || --> ilk taraf dogru obur tarafi kontrol etmiyor
                                      // | --> iki tarafida kontrol ediyor



        int three = 3;
        System.out.println(three-- ==3   & 3/3 ==1);//true




    }
}
