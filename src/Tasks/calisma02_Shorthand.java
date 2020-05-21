package Tasks;

public class calisma02_Shorthand {
    public static void main(String[] args) {

        int a = 9;
        a= a+=3; // a=12
        //a= a+3
        System.out.println(a);

        int b= a+=5;
        // a=a+5  12+5=17  a=17
        System.out.println(b); //b=17

        int c = a+=b;
        // 17+17= 34  a=34 b=17 c=34
        System.out.println(c);

        int d = a+=c;
        // a= 34+34== a = 68  b= 17 c=34 d= 68

        System.out.println(d);

        int e = (d+=b)*2;
          // d=d+b=68+17  d=85  a= 68  b= 17 c= 34 e=170
          // e = 85*2= 170

        System.out.println(e);

        int f= b+=d*2;
        // b= 17+= 85*2
        // b= 17+= 170 b= 187 f = 187
        System.out.println(f);
        System.out.println(b);
        System.out.println(e);

        int g = 101;
        int h= g-=1; // g=100 h= 100
        System.out.println(h);

        int i = g+=h+5;
        // g= 100+100+5= g= 205 h= 100 i = 205
        System.out.println(i); //205
        System.out.println(g); //205

        int j = h+=g%i;
          // 100+ = 205% 205= 0
           // 100+0=        h= 100
        System.out.println(j); //j= 100
        System.out.println("*****************");

        int k = j-=h* 2%5;
          // j-= 100* 2 %5
          // j-=200 % 5
          // 100 - 0= 100
        // k= 100 j= 100 h= 100
        System.out.println(k);
        System.out.println(j);
        System.out.println(h);

        int A = 100;
        A *= 200; // A= A*200= 100*200= 20000
        System.out.println(A);

        int B = 500;
        B*= 100/10;// B*= 100/10
                   // B*= 10
                  // B= 500*10=5000
        System.out.println(B); //B=5000


        B *= B-=2000;
        //B*= 3000
        //B= 5000*3000=15.000.000

        System.out.println(B);
        System.out.println("\n ************************ ");

        int C = 1000;
        C/=5;
        // 1000/5= 200
        System.out.println(C); //C=200

        int D = 10;
        C/=D+40;//10+40
        //200/50=4
        System.out.println(C);//4
        System.out.println(D);//10


        int z = 10%3; //3.3...

        int E = 10;
          E %= 2; // 10%2==0
        System.out.println(E);


        int F = 100;
        F %= 2; // F= F%2==>0
        System.out.println(F); // if it is 0 it means it is even number

        System.out.println(-100%3);


        int J = 300;
        int K = 10;
        J+= J %=K;
        // J+=300%10==0
        // 300+0
        // J=300
        System.out.println(J);




    }
}
