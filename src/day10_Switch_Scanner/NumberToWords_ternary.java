package day10_Switch_Scanner;

public class NumberToWords_ternary {
    public static void main(String[] args) {
 /*
    3. write a java program that can convert numbers between 0 ~ 9 to words,
       if the number is greater than 9 or less than zero, out put should be "Invalid".
                DO NOT USE IF STATEMENTS
                */
        int num1=5;
        String numName="";
        if(num1>=0 && num1<10){
            numName=(num1==0)? "Zero" : (num1==1)? "One" :(num1==2)? "Two" : (num1==3)? "Three"
                    : (num1==4)? "Four" : (num1==5)? "Five" : (num1==6)? "Six"
                    : (num1==7)? "Seven" : (num1==8)? "Eight" : "Nine";

        }else{
            numName="Invalid";
        }

        System.out.println(num1 + ":" + numName);



        //0~9
        // pre cond ternary icinde yazarak
        int num = -9;

        String word = (num ==0)?"Zero" :(num ==1)?"One" :(num ==2)?"Two":(num ==3)?"Three" :(num ==4)?"Four"
                :(num ==5)?"Five":(num ==6)?"Six":(num ==7)?"Seven":(num ==8)?"eight":(num ==9)?"Nine":"Invalid";

        System.out.println(word);
    }
}
