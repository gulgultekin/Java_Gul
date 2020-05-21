package Replits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Methods_WithString_12 {
    /*
    extractNum

description:
a method that cleans any non number string from a string it gets
and returns the clean string
input:
-s (string)- a string the method gets
return: string: a string of numbers only
example use:
extractNum("aa2aa3") ==> 23
extractNum("aa2") ==> 2
extractNum("aa10aa") ==> 10
extractNum("aa!!%$#.10aa") ==> 10

hint:
you can use:
 Character.isDigit(ch)
 or Conditions (on ascii table, the characters between #48 ~ #57 are digits)

     */
    public static void main(String[] args) {
         String str="aa2aa3";
         String result= extractNum(str);
        System.out.println(result);


    }
        public static String extractNum(String s) {
            char[]ch = s.toCharArray();
         String res="";

            for(char each: ch){
                if(Character.isDigit(each)){
                    res+=(""+each);
                }
            }
            return res;

        }






    }

