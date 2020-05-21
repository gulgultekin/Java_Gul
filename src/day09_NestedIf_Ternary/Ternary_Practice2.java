package day09_NestedIf_Ternary;

public class Ternary_Practice2 {
    public static void main(String[] args) {

        int num1 =300;
        int num2=200;
        int min =(num1<num2) ? num1 : num2;

        System.out.println("min number is " + min);


        System.out.println("*************************\n");

        int hour=10;
        String result= (hour<=12) ? "Good morning" :(hour>12 &&hour<18)? "Good Afternoon" :"Good Evening";

        System.out.println(result);

        System.out.println("\n++++++++++++++++++++++++++++++++++++++\n");

        int number = 12000;
        boolean divisibleBy1And5= (number%3==0 && number%5==0)? true : false;
                   //boolean old icin true ve false "" icinde yazmiyoruz. string olsaydi "" icinde yazacaktik
        System.out.println(divisibleBy1And5);







    }
}
