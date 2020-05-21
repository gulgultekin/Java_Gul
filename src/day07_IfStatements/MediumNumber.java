package day07_IfStatements;

public class MediumNumber {
    public static void main(String[] args) {
        //4. write a java program that accepts three numbers and return the medium number
        // (assume that none of them are equal)


        double a = 14400;
        double b = 2500;
        double c = 3300.55;
        /*
        a: if (a <b && a>c)  or (a>b && a<c)
        b: if (b<a && b>c)  or (b>a && b<c)
        c; if (c<a && c>b)  or (c>a && c<b)
         */
        boolean aMedium = (a < b && a > c)  || (a > b && a < c);
                             //  b <a <c     or   c <a <b
        boolean bMedium = (b < a && b > c)  || (b > a && b < c);
                             // a <b <c    or  c <b <a
        boolean cMedium = (c < a && c > b)  || (c > a && c < b);
                           // a <c < b     or    b <c <a

        if(aMedium){
            System.out.println(a + " is the medium number");
        }
        if(bMedium){
            System.out.println(b + " is the medium number");
        }
        if(cMedium){
            System.out.println(c + " is the medium number");
        }
    }
}
