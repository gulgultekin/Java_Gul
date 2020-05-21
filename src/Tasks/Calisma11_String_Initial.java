package Tasks;

import java.util.Scanner;

public class Calisma11_String_Initial {
    public static void main(String[] args) {
        /*
        ask user first and last name then prints out initials
        Cybertek
        batch18
        output: CB
         */
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter first and Last Name");
        String firstName= scan.nextLine();
        String lastName = scan.nextLine();

      //  String initial= firstName.substring(0,1).concat(".")+lastName.substring(0,1); bu yontemlede olabilir
        String initial =""+firstName.charAt(0)+"."+lastName.charAt(0);
                 //chari stringe cast yapmak icin bos"" ekliyoruz
       initial=initial.toUpperCase();
       System.out.println("Initial is :"+ initial);
       // System.out.println(firstName.charAt(0)+""+lastName.charAt(0)); sadece bu da yeterli


        // last letter for the first name and last letter for the lastName

       int firstNameIndex=firstName.length()-1;
        int lastNameIndex =lastName.length()-1;
        /*String lastLetter =""+firstName.charAt(firstNameIndex)+"."+lastName.charAt(lastNameIndex);
        */ //bu sekilde de yazilabilir
        String lastLetter=""+firstName.charAt(firstName.length()-1)+"."+lastName.charAt(lastName.length()-1);
            lastLetter=lastLetter.toLowerCase();
        System.out.println(lastLetter);

        //bu da substring yontemiyle yapilisi.son index numb verilmedi cunku zaten en son letteri istiyoruz
        //bu yontem daha cok kullaniliyor

        String lastLetter2= firstName.substring(firstNameIndex)+lastName.substring(lastNameIndex);
        System.out.println("Last letters are: "+lastLetter2);
    }
}
