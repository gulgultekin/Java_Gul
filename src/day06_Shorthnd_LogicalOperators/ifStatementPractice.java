package day06_Shorthnd_LogicalOperators;

public class ifStatementPractice {
    public static void main(String[] args) {

        int a = 100;
        int b = 200;

        if (a > b) { //false ise print yapmayacak
            System.out.println(a + " is greater than " + b);
        }
        boolean bGrater = b > a; // boyle de yazilabilir
        if (bGrater) { // true old icin print yapar
            System.out.println(b + " is greater than " + a);
        }

        if (a == b) {
            System.out.println(a + " is equal to " + b);
        }

        System.out.println("=========================================");

        int x = 300;
        int y = 300;
        boolean xGrater = x > y;
        boolean yGrater = y > x;

        if (xGrater) {
            System.out.println(x + " is greater than " + y);
        }

        if (yGrater) {
            System.out.println(y + " is greater than " + x);
        }

     /*   if (xGrater == false && yGrater == false){
            System.out.println(x + " is equal to "+ y);
        }
      */
        /*if (!xGrater && !yGrater ){ // ikiside true old icin equal oluyor
            System.out.println(x + " is equal to "+ y);
        } */

        if (xGrater == yGrater) { // boyle de yazilabilir
            System.out.println(x + " is equal to " + y);
        }
    }
}
