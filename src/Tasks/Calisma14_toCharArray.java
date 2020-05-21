package Tasks;

import java.util.Arrays;

public class Calisma14_toCharArray {
    public static void main(String[] args) {

        String str= "Java";

        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr));
        char[] ch= str.toCharArray();
        System.out.println(Arrays.toString(ch));




    }

}
