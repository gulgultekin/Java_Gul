package day17_WhileLoops;

public class PalindromeTest {
    public static void main(String[] args) {

        String str= "level";

        String reverseStr= ""; // store the reverse version of str

        int index= str.length()-1; // last index number

        while(index>=0){
            reverseStr+=str.charAt(index);

            index--;
        }
        System.out.println(reverseStr);

        boolean palindrome= reverseStr.equalsIgnoreCase(str);

        System.out.println(palindrome);
    }
}
