package Replits;

public class Methods_167_unique {
    /*
    uniqueChars is a method that you will code now, should be able to accept any string in the world
    and return unique characters from the parameter.

Examples:

uniqueChars("java") ==> "jav"

uniqueChars("mama") ==> "ma"

uniqueChars("spoon") ==> "spon"

     */
    public static void main(String[] args) {

        System.out.println(uniqueChars("BugBusters"));
    }


    public static String uniqueChars(String str) {

        String result ="";

        for(int i=0; i< str.length(); i++){

            if(!result.contains(""+str.charAt(i))){
                result+=str.charAt(i);
            }

        }
        return result;



    }
}


