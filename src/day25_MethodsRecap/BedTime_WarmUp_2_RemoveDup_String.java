package day25_MethodsRecap;

public class BedTime_WarmUp_2_RemoveDup_String {
      /*
   warmup task:
    1.  write a return method that accepts a String and removes duplicate values from the String
        Ex:
                RemoveDuplicate("aaabbbccc");  ==> "abc"
    2. write a return method that accepts two strings str1 & str2, and returns the frequency of str2 in str1 as an int
        Ex:
            Frequency("AAABB", "A");  ==> 3
            Frequency("ABAB", "B"); ==> 2
            Frequency("ABABAxcAB", "AB"); ==> 3
    3. (This one I will do it too tomorrow in class) Combine above two methods to write a return method that
    can return the frequencyt of characters as a stringfrom any given string
        Ex:
            FrequencyOfChars("ABABCB"); ==> "A2B3C1";
            FrequencyOfChars("AAABCCCDD") ==> "A3B1C3D2"

     */

    public static void main(String[] args) {
        String str = "ABAB";
        System.out.println(removeDup(str));

        String str2 = "ABCABCCAB";
        String result2 = removeDup(str2);
        System.out.println(result2);



    }

    public static String removeDup(String str){

        String result =""; //AB

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if(!result.contains(""+ch)){
                result+=ch;
            }
        }

        return result;
    }



}
