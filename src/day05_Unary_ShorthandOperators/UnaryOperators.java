package day05_Unary_ShorthandOperators;

public class UnaryOperators {
    public static void main(String[] args) {

        int a = 10; // positive 10
        int b = a; // positive 10

        System.out.println(a);
        System.out.println(b);

        int a2 = -10;
        boolean result1 = a2 > 0; //false
        boolean result2 = a2 < 0; //true

        System.out.println(result1);
        System.out.println(result2);

        int x1 = -10;
        int y1 = -x1;
        //   -(-10)==> +10
        System.out.println(y1); //10

        int x2 = +20;
        int y2 = -x2;
          //  - (+20) ==> -20
        System.out.println(y2);

        int x3 = +20;
        int y3 = + x3;
            // + (+20)==>+20
        System.out.println(y3);

        int z = 100;
        System.out.println(++z); // 101, increases it immediately
        System.out.println(z);  //101

        int p = 100;
        System.out.println(p++); //100 first passes the current value
        System.out.println(p);  //101 increase the value by 1
    }
}
