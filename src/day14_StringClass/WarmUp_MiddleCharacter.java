package day14_StringClass;

import java.util.Scanner;

public class WarmUp_MiddleCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
    3. Write a Java method to display the middle character of a string

        a) If the length of the string is even there will be two middle characters.
        b) If the length of the string is odd there will be one middle character.
                Input :
                    elephant
                Output:
                    The middle character in the string: ph
         */

        System.out.println("Please enter a word");
        String word = scan.nextLine();  // Bananas     //elephant
                                        // 0123456     //01234567
        String middleCharacter = "";
        int wordLenght = word.length();  // 7         //8
        int middleNumber =wordLenght/2; // 7/2 = 3    //8/2=4

        if(wordLenght%2!=0){ //odd numbers
            //middleCharacter+=word.charAt(middleNumber);
            middleCharacter = middleCharacter+word.charAt(middleNumber);
        }else{  // even number
            middleCharacter=middleCharacter+word.charAt(middleNumber-1)+word.charAt(middleNumber);

           // middleCharacter +=""+ word.charAt(middleNumber-1) + word.charAt(middleNumber);
            // ikiside char old icin number return yapar bu yuzden "" ekleyerek string yapiyoruz
        }
        System.out.println("Middle character is: "+middleCharacter);



    }
}
