package day26_Methods_Overloading;

public class Method_Overloading_practice {
    /*
first method: can find the sum of two int numbers
second method: can find the sum of two double numbers
 */

    public static void main(String[] args) {

        sum(5,8);
        sum(10.5, 5.5);

        //10, 15.5
        double num1 = sum(10,7.5);
        System.out.println(num1);

        // 25L, 30L
        double num2 = sum(25L, 30L);

        // 5, 4
        //double num3 =  sum(5,4);   // vpoid method does not return any value

        //40L, 50L
        sum((int)40L, (int)50L);


        //25L, 30L
       // double num2 =sum(25L,30L);// void method does not return any value thats why compile error
    }


    public static void sum(int a, int b){
        System.out.println(a+b);
    }


    public static double sum(double a, double b){
        System.out.println(a+b);
        return a+b;
    }

}
