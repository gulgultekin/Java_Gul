package day03_VariablesContinue;

public class VariablesContinue {

    /*
    comparision operators:
		>: greater
		>=: greater or equal
		<: less
		<=: less or equal
		== : equal
		!= : not equal
     */

    public static void main(String[] args) {
         boolean result1 = true;
         boolean result2 = false;

         boolean result3 = 10>9; // true
        System.out.println("result3 : "+ result3);

        System.out.println(true ==false);

        System.out.println( "Muhtar" != "Good Guy"); //true
        //                  bad guy != Good Guy== true

        boolean r1 = true != true; // false
        System.out.println("r1: " +r1);

        boolean r2 = "Batch 17" == "Batch 18"; // false
        System.out.println("r2 : "+ r2);

        System.out.println("==========================");

        char ch1 = 'A';
        System.out.println("ch1 : "+ ch1);

        char ch2 = 45000;
        System.out.println("ch2 : "+ ch2);

        char ch3 = 2222;
        System.out.println("ch3 : "+ ch3);

        char ch4 = 100; //d
        System.out.println("ch4 : "+ ch4);

        char ch5 = 'D'; //68
        System.out.println("ch5 : "+ ch5);

        int num1 = 'D'; // number
        System.out.println("num1 : "+ num1);

        char a1 = 'z';
        // byte b1= a1 ; // char range > byte range

        byte b1 = 'z';
        // 'z'nin correspanding numberi byte ranginin icinde old icin hata vermiyor

        //short s1 = a1; // char is > short old icin hata verir.
        int i1 = a1; // int  > char old hata vermez






    }

}
