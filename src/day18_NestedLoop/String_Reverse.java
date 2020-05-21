package day18_NestedLoop;

public class String_Reverse {
    public static void main(String[] args) {

        String str = "Java";
        String reverse="";

        int lastIndex= str.length()-1;

        do{
            reverse += str.charAt(lastIndex);

            lastIndex--;

        }while(lastIndex>=0);


        System.out.println(reverse);

    }
}
