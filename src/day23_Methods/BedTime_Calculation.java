package day23_Methods;

public class BedTime_Calculation {
    /* 3. write a method called Calculation, that can accepts 3 parameters: 2 numbers and one operator, and prints out the calculation
       if operator is not between [-, +, *, /, %] output should be Invalid Operator
       Ex: calculate(10, 2, "*") ==> 20;
       */


    public static void main(String[] args) {
        Calculation(10,5,"/");
    }




    public static void Calculation(int num1, int num2 , String arr){

        if(arr=="+"){
            System.out.println(num1+ " + "+num2+ " = "+(num1 + num2));
        }
        else if(arr=="-"){
            System.out.println(num1+ " - "+num2+ " = "+(num1 - num2));
        }
        else if(arr=="*"){
            System.out.println(num1+ " * "+num2+ " = "+(num1 * num2));
        }
        else  if(arr=="/"){
            System.out.println(num1+ " / "+num2+ " = "+(num1 / num2));
        }
        else if(arr=="%"){
            System.out.println(num1+ " % "+num2+ " = "+(num1 % num2));
        }else{
            System.out.println("Invalid operator");
        }




    }


}
