package day06_Shorthnd_LogicalOperators;

public class ShortHandOperators {
    public static void main(String[] args) {

        int x =20;
        x += 10; // x= x+10 = 30
        System.out.println(x);

        x+= 60; // x= x+ 60
        System.out.println(x); //90

        String schoolname= "CyberTek";
        schoolname += 12345; // schoolname = schoolname + 12345
        System.out.println(schoolname); // CyberTek12345


        System.out.println('a' + 'b'); // string olmadigi icin edition yapiyor
                         // 97 +  98 ==>195

        char ch1 = 'a';// char old icin character olarak a+b nin toplaminin gosterdigi characteri verecek
          ch1 += 'b';
         // char ch1 = 97+98 = 195
        System.out.println(ch1); // character


        int num = 'z'; //num = 122
           num += 'x'; //num = 120 ==> 122+120 = 242
        System.out.println(num); // int old icin x ve z nin corr. numberlarini topluyor


        int a = 100;
        a -= 90;
        System.out.println(a); //10

        int b =200;
        b -= a; // b=b-a
        System.out.println(b); //190
        System.out.println("\n**************************");

        int A = 2;
        A *= 3; // 2*3=
        System.out.println(A); //6

        int B = A *= 10;
        // B = A = A * 10
        //  B= A= 6*10
          //  A  = 60 oldu yukarda

        System.out.println(B); //60
        System.out.println(A); //60

        System.out.println("**********************");

        int a1 = 100;
        int b1 = (a1 *= 2) +  ++a1;
           // b1 = (100*2) + ++a1
           //b1 = 200 + 201 ==> 401

        System.out.println(b1); //401


        int x1 = 10;
        int y = x1 += 10*2; // x1 = x1+ 20
            // x1 += 20;  x1 = 10+20 ==> 30
        System.out.println(y); //30

        int q = 20;
        int p = q*=20*3;
           // q*= 60;
           //q=20* 60 ==>1200
        System.out.println(p);

        int num1 = 300;
        num1 /=2; // num1 = 300/2 ==> 150
        System.out.println(num1);


        int num2 = 400;
        num2/=20 +10 ; // num2 = num2 /30
                      // num2 = 400 / 30
                        //num2 = 13.333
        System.out.println(num2);



        int num3 = 300;
        num3 %= 10+20; // num3 %= 30;
               // num3 = 300 % 30 ==>0
        System.out.println(num3);


        int n1 = 400;
        n1 %= 3*5; // n1 = n1 % 15;
                   // n1 = 400 % 15
                   // n1 = 10
         // 400/15 = 26.666
        //  remainder : 400- (15* 26) = 10
        System.out.println(n1);




    }
}
