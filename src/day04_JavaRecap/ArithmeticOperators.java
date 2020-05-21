package day04_JavaRecap;

public class ArithmeticOperators {

    public static void main(String[] args) {
      //10 / 3 ==>3.333
     int a = 10/3 ;// 3
        System.out.println(a);

        //10 / 4 ==> 2.5
        System.out.println(10 /4); // 2

        double d = 10/4; // whole number old icin int olarak goruyor ve 2.0 veriyor
        // double d=2; 2.0
        System.out.println(d); //2.0

        System.out.println(10.0 / 4); //2.5
        System.out.println(10 /4.0); // 2.5

        System.out.println(10.0 /4.0); // 2.5

        float f1 = 10/4 ; // whole number old icin compiler int olarak aliyor ve 2.0 veriyor
        System.out.println(f1); //2.0

        float f2 = 10/4f; // 2.5
        System.out.println(f2);// simdi float olarak gordugu icin 2.5 veriyor

        System.out.println("*********************");

       boolean evenNumber = 25 % 2 ==0;
       // if 25 /2 has a remainder of zero , then it's even number

        System.out.println(evenNumber); //false

        System.out.println(25 % 2); // 1  1==0 ==> false

        boolean oddNumber = 22 % 2 != 0; // odd number
                     //  0 != 0 ==> false

        System.out.println(oddNumber);

        System.out.println(10 % 2 == 0); // 10 is even number  //true

        System.out.println(11 % 2 == 0); // 11 is odd number  // false

        System.out.println("10 is even number: "+( 10 % 2 == 0));
        System.out.println("11 is even number : "+ (11 %2 == 0 ));

        System.out.println("25 is odd number : "+(25 % 2 != 0));

        System.out.println("25 is even number : "+ (25 % 2 == 0));
        System.out.println("25 is even number : "+ !(25 % 2 !=0));


    }
}
