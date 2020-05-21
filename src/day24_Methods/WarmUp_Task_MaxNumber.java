package day24_Methods;

public class WarmUp_Task_MaxNumber {
    /*
      1. write a methods that can return the maximum number between two numbers
            Ex: Max(10, 20) ==> 20
            */
    public static void main(String[] args) {

        int a =10;
        int b= 2;
        MaxNumber(a,b);
    }




    public static void MaxNumber(int num1, int num2){
        if(num1 > num2){
            System.out.println("Max number is: "+num1);
        }
        else if(num2 > num1){
            System.out.println("Max number is: "+num2);
        }
        else{
            System.out.println(num1+" and "+num2+ " they are equal numbers");
        }

    }











   /* 2. write a method called Calculation, that passes 3 parameters: 2 numbers and one operator, and prints out the calculation
        if operator is not between [-, +, *, /, %] output should be Invalid Operator
        Ex: calculate(10, 2, '*') ==> 20;
            calculate(10, 2, '&') ==> Invalid operator
            NOTE: The method MUST take three arguments when it's called
            */

}
