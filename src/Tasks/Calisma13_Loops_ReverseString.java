package Tasks;

import java.util.Scanner;

public class Calisma13_Loops_ReverseString {
    public static void main(String[] args) {

      /*  String str= "Java";
             //      0123

        for(int i=3; i>=0 ; i--){
            System.out.print(str.charAt(i));
        }
*/
        Scanner scan=new Scanner(System.in);

        String word=scan.nextLine();
        String reversed="";
        for(int i=word.length()-1;i>=0 ;i--){

            reversed=reversed+word.charAt(i);
            //System.out.print(word.charAt(i)); sadece bu da yazilarak bulunabilir.String reversed=""; vermeden
        }

        System.out.print(reversed);

    }
}
