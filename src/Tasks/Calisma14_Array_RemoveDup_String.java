package Tasks;

import java.util.Arrays;
import java.util.TreeSet;

public class Calisma14_Array_RemoveDup_String {
    public static void main(String[] args) {
   /*
   check if two strings are build out of same letters
   ex:   if str1 ="aabbbc";  str2 ="cab";
         output: true

         if str1 ="abcd";  str2 ="abc";
         output: false
    */

   String a ="aabbbc",  b="cababcabcbbbb";

   String a1 ="";  // store all the non dup

        for(int j= 0; j<a.length(); j++){    //bu sekilde nested de olur yada b ile olan gibi sdece 1 loopta olur
            for(int i =0; i<a.length(); i++){

                if(!a1.contains(a.substring(j,j+1))){
                    a1+=a.substring(j,j+1);
                }
            }
        }
        System.out.println(a1);

        //b="cabaa";
        String b1 = "";

        for(int i=0; i<b.length(); i++){
            if(! b1.contains(b.substring(i,i+1))){ //(! b1.contains(""+b.charAt(i))){ boyle de olur
                b1+=b.substring(i,i+1);           //b1+=""+b.charAt(i);
            }
        }
        System.out.println(b1);

        //a1 ="abc" , b1 ="cab"
       char[]ch1= a1.toCharArray();
        System.out.println(Arrays.toString(ch1)); //[a, b, c]

       char[] ch2= b1.toCharArray();
        System.out.println(Arrays.toString(ch2)); //[c, a, b]


        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println("==============");

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        String str1=Arrays.toString(ch1);
        String str2=Arrays.toString(ch2);

        if(str1.equals(str2)){
            System.out.println("True, they are build out of same letters");
        }else{
            System.out.println("False, different letters");
        }


        //SOLUTION 2___SHORT WAY

        String Str1 = "cccbbbaaaaaa", Str2="cccaabbaaaac";

        Str1=new TreeSet<String>(Arrays.asList(Str1.split(""))).toString();
        Str2=new TreeSet<String>(Arrays.asList(Str2.split(""))).toString();

        System.out.println(Str1.equals(Str2));









    }
}
