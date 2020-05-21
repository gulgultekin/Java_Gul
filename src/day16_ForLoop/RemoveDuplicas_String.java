package day16_ForLoop;

public class RemoveDuplicas_String {
    public static void main(String[] args) {
        /*
          write a program that can remove duplicated characters from a string
          abcdabcd ==> abcd
         */

        String str="ababccdddeeee";

        String result=""; //abcde

        for(int i=0; i<=str.length()-1 ; i++) {

             /* bu 1. cozum yolu
            if (!result.contains("" + str.charAt(i))) {
                result += str.charAt(i);
            }
*/
           //2. cozum
                                               // i is the index number
            if (result.contains("" + str.charAt(i))) {// if the string result does not contains str.charAt(i),
                continue;      //then we concate it to the result, if it does we will not concate it to the result we will skip
            }
            result+=str.charAt(i); // only gets executed if str.charAt(i) is not contained in the result

        }
        System.out.println(result);
    }
}
