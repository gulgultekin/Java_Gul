package OfficeHours.Practice_3_25_2020;

public class ExplicitCasting_Practice {
    public static void main(String[] args) {

        byte bnum=100;

        short snum=bnum;// implicit casting done automaticly
               // smaller primitives to larger primitives

        int inum=200;
        short sNum =(short)inum;// explicit casting must be done manually
            // larger primitive to smaller primitive

        float FNum = (float)0.5;
        System.out.println(FNum);

        float FNum2 =(long) 0.5;// once longa cevirdi 0 oldu sonra float olarak yazdi 0.0
        System.out.println(FNum2);

        long lNum1 = (int)4.5;// bu 4.5 double ve  long dan buyuk old icin cast yapmamiz lazim. sonuc 4
        System.out.println(lNum1);

        System.out.println(9/2);//4
        System.out.println(9/(float)2);//4.5


         }
}
