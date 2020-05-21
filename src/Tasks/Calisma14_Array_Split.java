package Tasks;

import java.util.Arrays;

public class Calisma14_Array_Split {
    public static void main(String[] args) {

        String str= " Java I love Java and Java is fun Java ";
        String[] arr = str.split("Java");

        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length-1);// Jvanin kac kere yazildigini verir-- ama basta ve sonda olursa degisir
        // basta ve sonda varsa bosluk birakip java sayisini bulabilirsin yada if ile


        String emailAddress= "Cybertek_school_batch18@Gmail.com";
        String fullName = emailAddress.substring(0,emailAddress.indexOf("@"));
        System.out.println(fullName); //Cybertek_school_batch18

        String[] Allnames =fullName.split("_");
        System.out.println(Arrays.toString(Allnames)); //[Cybertek, school, batch18]

        String word= "ABCDE";
        String[]arr2=word.split(""); //[A, B, C, D, E]
        System.out.println(Arrays.toString(arr2));// Splits the string character by character

    }
}
