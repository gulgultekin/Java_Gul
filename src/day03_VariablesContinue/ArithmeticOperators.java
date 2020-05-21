package day03_VariablesContinue;

public class ArithmeticOperators {

    public static void main(String[] args) {
        System.out.println(5+3); // 8
        System.out.println(10-2); // 8
        System.out.println(10*3); // 30
        System.out.println(10/2); // 5  10: numerator --- 2: denominator cannot be 0(sifir)


        int result1 = 10 %3 ; // 10 un 3 e bolumunden kalan ==> 1
        System.out.println(result1);

        int result2 = 11 %3; // 2
        System.out.println(result2);


        System.out.println(10/4);
        int c1 = 10/4;

        System.out.println(c1); // 2

        System.out.println(10.0/ 4); // 2.5
        System.out.println(10/4.0);  //2.5

        double d1 = 10/4; //2.0 int olarak islem yapiyor o yuzden 2.0
        System.out.println(d1); //2.0

        double d2 = 10/4f; // float old icin sonuc 2.5
        System.out.println(d2);


    }
}
