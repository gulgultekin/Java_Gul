package day52_Collection;

import java.util.ArrayList;

public class Null_Keyword {

    static String str; //== null  --> this variable does not reference to any object
    static String str2 = new String("Cybertek");

    // static ArrayList<Integer> list1 ;



    public static void main(String[] args) {

      //  System.out.println(str.charAt(0)); //NullPointerException -->obje olmayinca

        System.out.println(str2.charAt(0)); //C

        //System.out.println(list1.get(1));//NullPointerException--> does not refer to any object

       // WebElement element = null;
        String str2 = null;
        Integer i1 = null;
        //int num = null;
        int num =0;

        ArrayList<String> list1 = new ArrayList<>();
        list1.add(null); //list accepts null

        System.out.println(list1);

        System.out.println("*********************************");

//        String number = null;
//        int num1 = Integer.parseInt(number); //NumberFormatException--> obje olmayinca
//
//        System.out.println(num1);

        String number2 = "123";
        int num2 = Integer.parseInt(number2);

        System.out.println(num2); //123


        System.out.println("****************************");


        String[]arr = {null,"Cybertek",null}; // 1 object created in index1

       // arr[2].toUpperCase(); //NullPointerException  arr[2]--> null -->obje yok demek yani

        System.out.println(arr[1].toUpperCase()); //CYBERTEK

        String name1 = "gul".toUpperCase();
        System.out.println(name1); //GUL

        name1 = null;//it does not refer to object (reinitialize yaptik --null)
        name1 = name1.toLowerCase();
        System.out.println(name1); //NullPointerException




    }
}
