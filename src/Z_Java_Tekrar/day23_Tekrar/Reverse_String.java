package Z_Java_Tekrar.day23_Tekrar;

public class Reverse_String {

    public static void main(String[] args) {


        String name = "Gul Gultekin";
        reverseString(name);

        System.out.println(); // line bolmek icin

        String name2="Cybertek";
        reverseString(name2);

    }



    public static void reverseString (String name){

        for(int i = name.length()-1; i>=0; i-- ){
            System.out.print(name.charAt(i));

        }



    }


}
