package day36_StaticBlock;

import OfficeHours.Practice_05_06_2020.Developer;

public class HumanResources {


   static Developer dev1 ;
   static Developer dev2 = new Developer();
   static Developer dev3 = new Developer();
   static Developer dev4 = new Developer();
   static Developer dev5 = new Developer();

//    public static void main(String[] args) {
//
//        dev1.setInfo("Namik","Developer",120000,123);
//        //burada tanimlayinca capitolOne dan cagirunca bilgiler gelmiyor.
//        // ama Static block ta apply yapinca capitolOne da bilgileri gorebiliyoruz
//    }
   static{
    dev1 = new Developer(); //burada da tanimlayabilirsin
       dev1.setInfo("Namik","Developer",120000,123);
       // ilk run yaptigi icin bilgiler CapitolOne da cagirinca geliyor
    //setInfo methodu inside the blockta olmali
    //static variable old (static Developer dev1 ) icin static blockta olmali method
   }


}
