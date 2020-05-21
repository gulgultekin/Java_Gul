package day07_IfStatements;

public class MAXNumber {
    public static void main(String[] args) {

        //2. write a java program that accepts three numbers and return the maximum number

        double num1 = 150.7;
        double num2 =80;
        double num3 = 40;
        double max =0;
      if(num1 > num2 && num1 > num3){
            max= num1;
        }
        if (num2 > num1 && num2 > num3){
            max = num2;
        }
        if(num3 > num2 && num3 > num1){
            max = num3;
        }
        System.out.println("Maximum number is : "+ max);



         //bu sekilde de yazilabilir

        boolean num1Greater = num1>num2 && num1>num3; // if num1 is greater than both num2 and num3, then a num1 is a max
        boolean num2Greater = num2>num1 && num2>num3; // if num2 is greater than both num1 and num3, then a num2 is a max
        boolean num3Greater = num3>num1 &&num3>num2;   //if num3 is greater than both num1 and num2, then a num3 is a max

        if(num1Greater){
        System.out.println (num1 + " is max number");
        }
        if(num2Greater){
        System.out.println (num2 + " is max number");
        }
        if(num3Greater){
        System.out.println (num3 + " is max number");
        }

    }
}
