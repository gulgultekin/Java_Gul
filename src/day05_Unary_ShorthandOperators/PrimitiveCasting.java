package day05_Unary_ShorthandOperators;

public class PrimitiveCasting {
    public static void main(String[] args) {

    //IMPLICIT CASTING:  done by automaticly
        int a = 10;
        long b = a; // implicit casting is done automaticly by compiler
            // b = 10L;
                System.out.println(b);

         int a1 = 100;
         long b1 = (long) a1; // manually doing the implicit casting

    //EXPLICIT CASTING;
        int num = 100;
        byte bnum = (byte)num;

        short Snum = (byte)num;

        double Dnum = 5.5;
        float Fnum = (float) Dnum; //5.5

        float Fnum1 = (int)Dnum; //5.0
           // Fnum = (int) 5.5
         // Fnum = 5;
         // Fnum = 5.0
      System.out.println(Fnum); // 5.5
      System.out.println(Fnum+1); // 6.5

        double D1 = 10.5;
        long L1 = (int)D1;
        System.out.println(L1); // 10

        float F1 = 60.5f;
        int I1 = (int) F1; // 60 -- same or smaller dataType cast yapilir
        //int I1 = (short)F1;// 60--s ame or smaller dataType cast yapilir
        //int I1 = (byte)F1;// 60-- same or smaller dataType cast yapilir
        System.out.println(I1);

        long LargeNum = 999999999999L;
        int intNum = (int)LargeNum;
        System.out.println(intNum); // it gives different num because  9999999999999999 is out of int range.


        char ch1 = 'a';

        short sh1 = (short)ch1;
        System.out.println(sh1); //97

        char ch2 = 1888;
        short sh2 = (short) ch2;
        System.out.println(sh2);

        double dbl1 = ch2; // 1888.0 -->double chardan buyuk old icin automatic cast oluyor(implicit casting)
        System.out.println(dbl1);

        int z1 = 10;
        double y2 = z1;
        System.out.println(y2); // 10.0
        short ss1 = (short) y2;
        System.out.println(ss1); // 10







    }
}
