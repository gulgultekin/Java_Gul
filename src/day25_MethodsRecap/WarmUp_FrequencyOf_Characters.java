package day25_MethodsRecap;

import Resources.Library;

public class WarmUp_FrequencyOf_Characters {
   /* 3. (This one I will do it too tomorrow in class) Combine above two methods to write a return method that
    can return the frequencyt of characters as a stringfrom any given string
    Ex:
    FrequencyOfChars("ABABCB"); ==> "A2B3C1";
    FrequencyOfChars("AAABCCCDD") ==> "A3B1C3D2"
    */

    public static void main(String[] args) {
        String str = "AABBCCC"; // ABC   -->A2B2C3

        String NonDup = Library.removeDuplicates(str);

        String result ="";

        for (int i = 0; i < NonDup.length(); i++) {

            String ch = "" + NonDup.charAt(i); //A B C
            int num = Library.frequency(str, ch);// 2 2 3
           // System.out.print(ch + num); //A2B2C3
            result+= ch + num;
        }

        System.out.println(result); // A2B2C3





    }


    public static String frequencyOfChars(String str){

        String NonDup = Library.removeDuplicates(str);

        String result =""; //A2B2C3  contains the frequency of chars

        for (int i = 0; i < NonDup.length(); i++) {

            String ch = "" + NonDup.charAt(i); //A B C
            int num = Library.frequency(str, ch);// 2 2 3
            // System.out.print(ch + num); //A2B2C3
            result+= ch + num;
        }

        return result;
    }

}
