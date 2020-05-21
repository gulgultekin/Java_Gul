package day36_StaticBlock;

import day34_CustomClass.Tester;

public class StaticBlock4 {

    static String  name ="Cybertek School";
    static Tester tester1 = new Tester();
  //  tester1.setInfo("Muhtar",123,"SDET",110000);

    int insVariable;

    static{ //designed for static only
        //gets executed as soon as class is loaded
        //designed to initialized static variables
        //main classtan once execut old icin  "cybertek" name e initialized oluyor.
        // main methoddda name print yapinca cybertek print oluyor.

       name ="Cybertek School";
        tester1.setTesterInfo("Muhtar",123,"SDET",110000);
        tester1.setTesterInfo("Namik",12322,"SDET",110000); // bu print yapar. top to bottom son old icin

       // insVariable =300; static only accept static. bunu call yapmak icin obje olusturup class isminden cagirmamiz lazim
        StaticBlock4 obj1 = new StaticBlock4();
        obj1.insVariable =300; // DO NOT use static block for initializing instance variables

    }

    public static void main(String[] args) {

        System.out.println(name);

        System.out.println(tester1);

        StaticBlock4 obj2 = new StaticBlock4();

        System.out.println(obj2.insVariable); //0 initialize olmadigindan 0
    }






}
