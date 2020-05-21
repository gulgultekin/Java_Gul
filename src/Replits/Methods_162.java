package Replits;

public class Methods_162 {
    /*
    This one is about truth table logic, threeLocks gets 3 booleans and returns a boolean.

It returns true only if both a and b are true or c is true.

https://en.wikipedia.org/wiki/Truth_table

     */
    public static void main(String[]arg){
        boolean a = true;
        boolean b = true;
        boolean c = false;
        boolean result = threeLocks(a,b,c);
        System.out.println(result);
    }

    public static boolean threeLocks(boolean a, boolean b, boolean c) {
        boolean res = false;

        if (a == true && b == true) {
            res = true;
        }

        if (c == true) {
            res = true;
        }
        return res;

    }
}
