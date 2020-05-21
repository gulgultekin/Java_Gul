package Replits;

public class Methods_String_173 {
    /*
    the method gets two strings and return the longest one

biggerS("apple","orange") ==> "orange"
     */

    public static void main(String[] args) {

        String str1= "apple";
        String str2 = "orange";
        String result = biggerS(str1,str2);
        System.out.println(result);

    }

    public static String biggerS(String a ,String b)
    {
        String result ="";

        if(a.length() > b.length()){
        result= a;
    }
   else if(b.length()> a.length()){
            result= b;
    }
   return result;
    }
}
