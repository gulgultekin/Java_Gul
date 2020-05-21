package day07_IfStatements;

public class MINNumber {
    public static void main(String[] args) {
        //3. write a java program that accepts three numbers and return the minimum number

        double number1 = 20;
        double number2 =88.5;
        double number3 = 655;
        double min = 0;
        if (number1 <number2 && number1<number3){
            min = number1;
        }
        if (number2 <number1 && number2<number3){
            min = number2;
        }
        if (number3 <number2 && number3<number1){
            min = number3;
        }
        System.out.println("Minimum number is : "+ min);

        // bu sekilde de yazilabilir

        boolean min1 = number1<number2 && number1<number3;
        boolean min2 = number2<number1 && number2<number3;
        boolean min3 = number3<number2 && number3<number1;

        if(min1){
            System.out.println(number1 + " is the minimum number");
        }

        if(min2){
            System.out.println(number2 + " is the minimum number");
        }
        if(min3){
            System.out.println(number3 + " is the minimum number");
        }

    }
}
