package Replits;

public class Methods_154 {
    /*
    Complete a method isPalindrome() that will check if number is a palindrome.
    Print your result as a boolean (true or false).
Example:
input: 1001
output: true

Example:
input: 1234
output: false
     */
    public static void main(String[] args) {

        int num= 12345432;




        isPalindrome(num);
    }
    public static void isPalindrome(int num) {
        //WRITE YOUR CODE HERE

        String result ="";
        String original = ""+num;

        for(int i=original.length()-1; i>=0; i--){
            result+= original.charAt(i);

        }

        System.out.println(result.equals(original));


    }
}
