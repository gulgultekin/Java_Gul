package day29_Wrapper_ArrayList;

import java.util.Arrays;

public class ValueOfMethods {
    public static void main(String[] args) {

        String str = "123";

        Integer a = Integer.valueOf(str); // Integer,123

        System.out.println(a);

        double b = Integer.valueOf(str); // unboxing
        // double = Integer
        System.out.println(b); // 123.0


        System.out.println("************************************");

        String str2 = "15.5";

        double d1 = Double.parseDouble(str2);
        // double=double --> no boxing


        double d2 = Double.valueOf(str2);
        // double = Double Wrapper class-->unboxing

        System.out.println(d1);//15.5
        System.out.println(d2);//15.5

        System.out.println(d1==d2); //true


        System.out.println("************************************");

        int z1 = 2000;
       // Long L1 = z1; // does not accept any other primitives except for long

        Short sh1 =3000;
        int z2 = sh1;  // primitives accept any Wrapper class

        System.out.println("*******************************");

        /*
        "True"
        "FALse"==> to boolean
        "1000000.5" ==> to float
        "123456" ==> to int
         */

        String str4 = "True";
        boolean d = Boolean.valueOf(str4); // Boolean, true

        System.out.println(d); //true

        String str5 = "FALse";
        boolean e = Boolean.valueOf(str5);
        System.out.println(e); //false

        String str6 = "1000000.5";
        float f = Float.valueOf(str6);
        System.out.println(f); // 1000000.5

        String str7 = "123456";
        int g = Integer.valueOf(str7);
        System.out.println(g); //123456

        System.out.println("**********************************");

        String r1 = "true";
        Boolean t1 = Boolean.valueOf(r1);// Boolean, true
        //Boolean ==Boolean --> no boxing

        boolean t2 = Boolean.valueOf(r1);
        // boolean == Boolean --> unboxing

        System.out.println(t1);
        System.out.println(t2);

        System.out.println("========================");

        int maxNum = Integer.MAX_VALUE;
        System.out.println(maxNum); //2147483647--> maximum value that int can have

        double maxNum2 = Double.MAX_VALUE;
        System.out.println(maxNum2); //1.7976931348623157E308 --> max value that double can have

        int minNum = Integer.MIN_VALUE;
        System.out.println(minNum); // -2147483648 --> min value that int can have

        byte maxNum3 = Byte.MAX_VALUE;
        System.out.println(maxNum3); //127

        byte minNum2 = Byte.MIN_VALUE;
        System.out.println(minNum2); // -128

        System.out.println("========================");
        int[] arr = new int[3];
        System.out.println(Arrays.toString(arr)); // [0, 0, 0]

        boolean[] arr1 = new boolean[3];
        System.out.println(Arrays.toString(arr1)); // [false, false, false]

        Boolean[] arr2 = new Boolean[3];
        System.out.println(Arrays.toString(arr2)); // [null, null, null]





    }
}
