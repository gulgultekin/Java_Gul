package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ExtractChars3 {
    public static void main(String[] args) {
        /*4. write a program that can extract the sepecial characters, digits and alphebets from a string
and stores them into seperate ArrayLists of Character:

        DO NOT USE LOOPS

     */
        String str= "ABCD123$%#@&456EFG!";
          char[] arr = str.toCharArray();
       // ArrayList<Character> letters =new ArrayList<>(Arrays_Pract.asList(arr)); hata veriyor -->Character[] ch ye cevirmemiz lazim

        Character[] ch = new Character[arr.length];

        for(int i=0; i< arr.length; i++){
            ch[i] = arr[i]; // arr daki karakterleri ch a atiyotuz
        }
       // System.out.println(Arrays_Pract.asList(ch));

        ArrayList<Character> letters =new ArrayList<>(Arrays.asList(ch));
        letters.removeIf(p->!Character.isLetter(p));       // letter olmayanlari remove yap
        System.out.println(letters);


        ArrayList<Character> digits =new ArrayList<>(Arrays.asList(ch));
        digits.removeIf(p->!Character.isDigit(p));       // digit olmayanlari remove yap
        System.out.println(digits);




        ArrayList<Character> specialChars =new ArrayList<>(Arrays.asList(ch));
         specialChars.removeAll(letters);             // letter arraylisti remove yap
         specialChars.removeAll(digits);               // digit arraylisti remove yap

       // specialChars.removeIf(p->Character.isDigit(p) || Character.isLetter(p));    // predicate ile

        System.out.println(specialChars);   // letter ve digit olmayanlari remove yap









    }
}
