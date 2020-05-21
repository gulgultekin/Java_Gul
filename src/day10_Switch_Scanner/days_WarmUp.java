package day10_Switch_Scanner;

public class days_WarmUp {
    public static void main(String[] args) {

    /*
         write a program that can display the days based on the numbers 1 ~ 7
            MUST USE NESTED IF
            */
        int num = 4;
        String day = " ";
        if (num > 0 && num < 8) {
            if (num == 1) {
                day = "Monday";
            } else if (num == 2) {
                day = "Tuesday";
            } else if (num == 3) {
                day = "Wednesday";
            } else if (num == 4) {
                day = "Thursday";
            } else if (num == 5) {
                day = "Friday";
            } else if (num == 6) {
                day = "Saturday";
            } else {
                day = "Sunday";
            }

        } else {
            day = "Invalid entry";
        }
        System.out.println(num + ".day is : " + day);


        //Ternary ile
     /*   int num1=3;
        String result="";
         if(num1>0 && num1<8){
             result=(num1 == 1)? "Monday" : (num1 == 2)? "Tuesday" : (num1 == 3)? "Wednesday" :
                     (num1 == 4)? "Thursday" : (num1 == 5)? "Friday" : (num1 == 6)? "Saturday" : "Sunday" ;
         }else {
             result = "Invalid entry";
         }
        System.out.println(num1 +".day is : "+result);}

      */
        // ternary ile ama pre-conditioni yazmadan.

        int num1 = 3;
        String result = "";

        result = (num1 == 1) ? "Monday" : (num1 == 2) ? "Tuesday" : (num1 == 3) ? "Wednesday" :
                (num1 == 4) ? "Thursday" : (num1 == 5) ? "Friday" : (num1 == 6) ? "Saturday" :
                        (num1 == 7) ? "Sunday" : "Invalid entry";
        // per-condition vermeden yazdik. ternary nin icinde invalid
        System.out.println(num1 + ".day is : " + result);
    }
}


