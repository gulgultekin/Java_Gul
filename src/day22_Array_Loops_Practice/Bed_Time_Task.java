package day22_Array_Loops_Practice;

import java.util.Arrays;

public class Bed_Time_Task {
    public static void main(String[] args) {
        /*
        1.  write a program that can check if two Strings are build out of same
        Ex:
            if str1 = "aabbbc";  str2 ="cab";
            output: true
            if str1 ="abcd";  str2 ="abc";
            output: false
            Hint: you will need array and Arrays' methods*/

       String str1 = "aabbbc";
       String str2 ="cab";
       String str3="";

       for(int i =0; i<str1.length(); i++){
           if(!str3.contains(""+str1.charAt(i))){
               str3+=str1.charAt(i);

           }
       }
        System.out.println(str3); //abc

        //a1 ="abc" , b1 ="cab"

        char[] ch1= str3.toCharArray();
        System.out.println(Arrays.toString(ch1)); //[a, b, c]

        char[] ch2 = str2.toCharArray();
        System.out.println(Arrays.toString(ch2));  //[c, a, b]

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.toString(ch1)); //[a, b, c]
        System.out.println(Arrays.toString(ch2)); // [a, b, c]

        System.out.println(Arrays.equals(ch1,ch2));

        }




/*2.  Write a program that can print out the unique values from an int Array
        Ex:
            if arr -> {1,1,2,3,3}
            output: 2
            if arr -> {1,2,2,3,4,4}
            output:  1  3
            */
     int[] arr ={1,1,2,3,3};
     int count=0;

   //  for(int i=0; i< )



/*3. Write a program that can print out the unique values from  String Array
         */
    }

