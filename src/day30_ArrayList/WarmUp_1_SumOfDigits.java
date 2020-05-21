package day30_ArrayList;

import java.util.Arrays;

public class WarmUp_1_SumOfDigits {
     /*
    WARMUP TASKS:
    1. write a program that can return the sum of all the digits from a string
            ex:
                input: "a1b2c3"
                output: 6
                    (1+2+3= 6)
                input: "Today's date is 04/27/2020"
                output: 17
                    (0+4+2+7+2+0+2+0=17)
            HINT: on ascii table, the characters between #48 ~ #57 are digits*/

     public static void main(String[] args) {

         String str = "a1b2c3";
         char[]arr = str.toCharArray();// once charArray e ceviriyoruz

         System.out.println(Arrays.toString(arr)); // [a, 1, b, 2, c, 3]

         int sum =0; // will contain sum of all digits
        String s ="";

         for(char each: arr ){

//            boolean isDigit =each>=48 && each<=57;
//
//             if(isDigit){ //if(each>=48 && each<=57) seklinde de yazilabilir==ayni sey
//                sum+= Integer.parseInt(""+each);//each char old icin stringe ceviriyoruz.cunku parse method coverts string
//             }
//

            //baska yontemle

            if(Character.isDigit(each)){ // isDigit()--> identifies if the given character is digit
                sum+= Integer.parseInt(""+each); // chari string yapip sonra int cevirdik
            }
             if(Character.isAlphabetic(each)){
               s+=""+each;
             }

         }
         System.out.println(s);
         System.out.println(sum);

         boolean a = Character.isAlphabetic('A');// isAlphabetic()--> identifies if the given character is alphabetic






     }
}
