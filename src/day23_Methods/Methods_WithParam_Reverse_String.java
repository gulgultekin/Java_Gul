package day23_Methods;

public class Methods_WithParam_Reverse_String {

// create a function that can reverse any string

    public static void main(String[] args) {

        String name1 ="Gul Gultekin";
        ReverseString(name1);

        System.out.println();// line bolmek icin

        String name2 ="Sener Yusuf Beyza";
        ReverseString(name2);
    }


    public static void ReverseString(String str){

        for(int i= str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }


    }
}
