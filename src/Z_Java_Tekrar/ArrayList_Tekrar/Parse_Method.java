package Z_Java_Tekrar.ArrayList_Tekrar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static java.lang.Integer.*;

public class Parse_Method {
    public static void main(String[] args) {
        String str = "123";
        int num = parseInt(str);
        System.out.println(num + 1);
        System.out.println(str + 1);

        byte bt = 25;
        Byte b = bt;
        System.out.println(b + 1);

        Integer a = (int) b;
        System.out.println(a);
        System.out.println("*****************");
        String str2 = "23.5";
        double d = Double.parseDouble(str2);
        System.out.println(d+1);
        System.out.println(str2+1);
        System.out.println("******************");


        String st3="falSe";
        boolean bool = Boolean.parseBoolean(st3);
        System.out.println(st3);
        System.out.println(bool);
        System.out.println("***********************\n");
           /*
        1. create a list of Integers
        2. add 5 Integers to it
        3. return the maximum number from the list
         */

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(5,8,3,9,2));
        System.out.println(list);

       int max= MIN_VALUE;
       for(int i=0; i< list.size();)
        System.out.println(max);

    }
}