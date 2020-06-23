package Z_Java_Tekrar.HaftaSonu_Calisma;

import java.util.Arrays;

public class Ders1 {
    public static void main(String[] args) {


   // String name; //declare
  //  name ="I am learning Java"; //assign

    String name = "I am learning Java"; // initialize


    // primitive types--> byte,short,int,long,double,float,char,boolean


        String g = " Program";
        System.out.println(name.concat(g));//I am learning Java Program

        System.out.println(name); //I am learning Java

        name = name.concat(g);
        System.out.println(name); //I am learning Java Program

        System.out.println(name.contains("learn"));//true
        System.out.println(name.contains("JAVA")); //false

        System.out.println(name.endsWith("Program")); //true

        //2==2--> matematiksel esitlik
        //2=2--> assign

        String s = "abc";
        System.out.println(name.equals(s)); //false

        //System.out.println(name.equals());


        System.out.println(name.indexOf("learn")); //5


        String name2 ="123java java324java234  678945java";
        System.out.println(name2.replaceAll("[0-9]",""));

        String name3 = "I-am-learning-java";
        //split methodu array olusturmak icin kullanilir

        System.out.println(Arrays.toString(name.split("-")));

        //yada
        String[] arr = name3.split("-");

        for(String each: arr){
            System.out.println(each);
        }
        System.out.println("************************");


        String[]arr2 =name.split(" ");

        for(int i=0; i<arr2.length; i++){
            System.out.println(arr2[i]);
        }


        System.out.println( name.substring(0,10) );  //I am learn
        System.out.println(name.charAt(0)); //I



//        int  x=2;
//        x=2+2;
//        System.out.println(x); //4





//    char c = 'a';
//    String s = String.valueOf(c);
//
//    int i = c;
//    double d = i;
//    double e = c;
//        System.out.println(c);
//        System.out.println(i);

    }

}
