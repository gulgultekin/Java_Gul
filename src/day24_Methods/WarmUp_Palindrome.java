package day24_Methods;

public class WarmUp_Palindrome {
    /* 3. write a method that can identify if a string is palindrome
            ex: palindrom("level")  ==> true
                palindrome("Cybertek") ==> false

     */
    public static void main(String[] args) {
        Palindrome("level");
    }



    public static void Palindrome(String str){

        String reverseStr= "";

        int index= str.length()-1;

        while(index >= 0){
            reverseStr+=str.charAt(index);

            index--;
        }
        System.out.println(reverseStr);

        boolean palindrome= reverseStr.equalsIgnoreCase(str);

        System.out.println(palindrome);

    }
}
