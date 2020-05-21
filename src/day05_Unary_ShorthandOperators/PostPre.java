package day05_Unary_ShorthandOperators;

public class PostPre {
    public static void main(String[] args) {

        // pre: changes the value of the variable immediately
         int a= 100;
        System.out.println(++a); // a= 101
        System.out.println(a); //101

        int b = 100;
        System.out.println(--b); //b= 99
        System.out.println(b); //99


        //Post: first passes the current value, then eventually change the variable value
         int A = 100;
        System.out.println(A++); // still A= 100 first passes the current value
        System.out.println(A);  //  101

        int B = 100;
        System.out.println(B--); //B=100 b value is still 100
        System.out.println(B); // 99 ikinci stepte value degisiyor


        // post & pre examples:
        int z = 10;
        int x = ++z;
        System.out.println(x); // x is increased by 1 immedialitly
        System.out.println(z); // 11

        int s = 10;
        int f = s++; // 10  after line 33, the value of s will be increased by 1 next step(line 35)
        System.out.println(f);// 10
        System.out.println(s);// 11

        double t1 = 3.5;
        double t2 = t1 --; // 3.5, after line 38 t1 will be decreased by 1

        System.out.println(t2); // 3.5
        System.out.println(t1); //2.5

        int num = 35;
        System.out.println(num ++); //35, after line 44 the value of num will be 36
        System.out.println(num--);// 36 cunku buradaki num 36 oldu , current value pass yapack num=36,
        System.out.println(num); // 35 burada tekrar 35 oldu cunku decrease oldu







    }
}
