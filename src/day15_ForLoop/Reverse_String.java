package day15_ForLoop;

public class Reverse_String {
    public static void main(String[] args) {

        String str="Java is fun";

        String reversed="";

        int lastIndexnum =str.length()-1;

        for(int i=lastIndexnum; i>=0; i--){

            reversed=reversed+str.charAt(i);
            // System.out.print(str.charAt(i));
        }
        System.out.println(reversed);



    }
}
