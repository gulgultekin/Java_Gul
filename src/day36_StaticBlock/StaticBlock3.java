package day36_StaticBlock;

import day34_CustomClass.Tester;

public class StaticBlock3 {

    static String name;
    static int num;

    static Tester tester1;

//    public static void main(String[] args) {
//        name ="Muhtar";
//        num = 200;
//        System.out.println(name);
//        System.out.println(num);
//
//    }
    static{

        name ="Muhtar";
        num =100;

        tester1 = new Tester();
        tester1.setTesterInfo("jean",123,"Sdet",100000);

    }


}
