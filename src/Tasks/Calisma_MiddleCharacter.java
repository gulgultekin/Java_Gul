package Tasks;

import java.util.Scanner;

public class Calisma_MiddleCharacter {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("enter your word");

        String word= scan.next();
        String middleCharacter="";
        int wordLenght=word.length();
        int middleNumber=wordLenght/2;

        if(wordLenght%2!=0){
            middleCharacter=middleCharacter+word.charAt(middleNumber);
        }else{
          //  middleCharacter=middleCharacter+word.charAt(middleNumber-1)+word.charAt(middleNumber);
          middleCharacter=middleCharacter+word.charAt(middleNumber-1)+word.charAt(middleNumber);
        }
        System.out.println(middleCharacter);


    }
}
