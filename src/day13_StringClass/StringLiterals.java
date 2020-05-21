package day13_StringClass;

public class StringLiterals {
    public static void main(String[] args) {

        String str1 = "cat"; //string pool
        String str2 = new String("cat"); //java heap

        System.out.println(str1 + " : " + str2); //same visible object but different memory location==>  FALSE

        System.out.println(str1 == str2);// locationlari farkli old icin false

        String str3 = "cat"; //string pool
        System.out.println(str1 == str3); //ikiside string pool da old icin ve visible objectleri ayni old.==> TRUE

        String str4 = new String("cat");
        System.out.println(str2 == str4);//two independent object==>FALSE
        // new keyword ile yazildigi icin java heap de ayri ayri memory location'dalar.visible objectleri ayni olsada ==>FALSE


        String s1 = "java"; //string pool, immutable we cannot modify it
        s1 = "javaScript"; //new object will be created
        //first "java" it will stay stored until we need to assign it again to another variable no longer s1="java" now javaScript
        System.out.println(s1);//javaScript
        String s2 = "java"; // no new object will be created in the memory

        System.out.println(s1==s2);
                    //"javaScript"=="java" ==>false


    }
}
