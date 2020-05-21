package day04_JavaRecap;

public class Variable_Practice {

    public static void main(String[] args) {
        // DataType variableName
        //double> float> long >int > short > byte

        byte num1 = 127;
        short num2 = num1;

        //  byte num3 = num2; byte < short
        int num4 = num2; // int is prefered by complier
        long num5 = 99999999999L; // int is prefered by complier so we have put L or l end of it

        float num6 = 100L;
        System.out.println(num6);  // 100.0

        float num7 = 0.5f; // double is prefered by compiler for decimal numb. so we have to put f or F
        System.out.println(num7);  //0.5

        double num8 = 0.5f;
        double num9 = 99999999999L;
        System.out.println(num9);

        double num10 = 100.5;
        System.out.println(num10);

        char ch1 = '$'; // every single character has a corresponding number
        System.out.println(ch1);

        char ch2 = 2210;
        System.out.println(ch2);

        char ch3 = 45900;
        System.out.println(ch3);

        int a1 = '8';
        System.out.println(a1); //56

        int a2 = 'G';
        System.out.println(a2); // 71

        double d1 = 'z' + '8';
        System.out.println(d1); //122+56 =178.0

        char ch4 = 178;
        System.out.println(ch4); // alttakiyle ayni characteri print yapiyor

        char ch5 = 'z' + '8';
        System.out.println(ch5); // toplami 178 old icin 178 number hangi characteri veriyorsa onu print edecek

        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println(9 > 10); //false
        System.out.println(9 >= 9); //true

        System.out.println(9 != 10); // true

        System.out.println('a' == 'b'); //false

        System.out.println('a' == 'b' - 1); // true they have same corresponding number
        // compiler numbera 97 ==98-1 bakiyor ve ikiside ayni old icin true print yapiyor

        // System.out.println('a'=="a"); doesn't match

        System.out.println("muhtar" == "good guy"); //false
        //   iki taraf ayni degil ==> false

        System.out.println("muhtar" != "good guy"); // true

        System.out.println("Muhtar" == "muhtar"); //false

        // System.out.println("Cybertek"==1000); iki taraf ayni data type degil

        boolean r1 = !true; // false
        System.out.println(r1); //false
        System.out.println(!r1); //false

        System.out.println(!true== false);//true
        System.out.println(!true != !false); // true


    }
}
