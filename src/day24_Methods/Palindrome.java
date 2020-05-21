package day24_Methods;

public class Palindrome {

    public static void Palindrome(String str){

      //  str= str.toLowerCase(); boylede olur yada ignorecase method kullanilabilir

        String reversed ="";

        for(int i= str.length()-1; i>=0; i--){
            reversed+=str.charAt(i);

        }
        System.out.println(str.equalsIgnoreCase(reversed));
    }

    public static void main(String[] args) {

        Palindrome("Level");

    }



}
