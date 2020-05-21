package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ObjectMemory {


    int a=100;// instance variable old icin heap memoryde

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(10,20,30,40)); //heap memoryde

        ArrayList<Integer> list2 = list1; // same object ikiside ayni objecti paylasiyorlar

        list1.remove(2);

        System.out.println(list1); // [10, 20, 40]

        System.out.println(list2); //[10, 20, 40]


        System.out.println("=================================");

        String str1 = new String("cybertek");
        String str2 =str1;
        str1 = str1.toUpperCase(); //new object olustu

        System.out.println(str1); //CYBERTEK
        System.out.println(str2); // cybertek


        int a=200; // in the stack

    }
}
