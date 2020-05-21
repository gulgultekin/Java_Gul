package Replits;

import java.util.Scanner;

public class MiddleOne_String {
    /*
    You have a word, do the following:

1. When word has odd number of characters and:
            - 3 or more characters, print middle letter
      oak ==> a
      javav ==> v
             - Single character, print that character 3 times
      # ==> ###
      q ==> qqq

2. When word has even number of characters and:
           - 4 or more characters, print middle 2
     java ==> av
     apples ==> pl
     #$%^&* ==> %^
           - 2 characters, print those 2 characters twice
      @@ ==>@@@@
      $$ ==>$$$$
      hi ==> hihi
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //YOUR CODE HERE

        int length=word.length();
        String result="";

        if(length%2!=0){

            if(length>=3){
                result+= word.charAt(length/2);

            }else{
                result = word+word+word ;
            }

        }else{

            if(length>=4){
                result+=""+word.charAt(length/2-1)+word.charAt(length/2);

            }else{
                result=word+word;
            }
        }

        System.out.println(result);

    }



}
