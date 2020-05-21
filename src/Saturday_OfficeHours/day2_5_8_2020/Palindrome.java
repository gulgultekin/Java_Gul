package Saturday_OfficeHours.day2_5_8_2020;

public class Palindrome {
 //method ile
   public static boolean isPalindrome(String str){

       for(int i=0; i<str.length();i++){

          if(str.charAt(i)!=str.charAt(str.length()-1-i)){
            return false;
        }
     }
    return true;
}


//main method icinde

    public static void main(String[] args) {

        System.out.println(isPalindrome("asdfghj"));
        System.out.println(isPalindrome("racecar"));

    String str ="racecar";
        str = str.toLowerCase();

        boolean result = true;

        for(int i=0; i< str.length();i++){

            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                result=false;
            }else{
                result=true;
            }

        }
        System.out.println(result);
    }


}
