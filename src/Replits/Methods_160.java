package Replits;

public class Methods_160 {
    /*
    The danish prince most famous quote is "to be or not to be". thats a classic example of boolean logic.

the hamletQuote method only returns true if one of  or both of the boolean parameters is true.

example:

hamletQuote(true, false)
returns true

hamletQuote(false,true)
returns true

hamletQuote(true,true)
returns true

hamletQuote(false,false)
returns false
     */
    public static void main(String[] args) {
        boolean bool1 =true;
        boolean bool2 =true;
        boolean result = hamletQuote(bool1, bool2);
        System.out.println(result);
    }


    public static boolean hamletQuote(boolean toBe,boolean notToBe){

        if(toBe==true || notToBe==true ){
            return true;
        }else{
            return  false;
        }



    }






}
