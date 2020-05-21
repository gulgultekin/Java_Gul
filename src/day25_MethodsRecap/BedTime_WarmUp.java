package day25_MethodsRecap;

public class BedTime_WarmUp {
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
        String str =RemoveDup("abbcdde");

        System.out.println(str);
        String a = "abbcab  asedrabab";
        String b = "ab";

        int count = frequency(a,b);
        System.out.println(count);
        String res = frequencyOfChars("AAABCCCDD");
        System.out.println("frequencyOfChars : "+res);
    }


    public static String frequencyOfChars(String str) {
        // str -> AAAAbbCCD
        // nonDup -> ABCD
        // result -> A4B2C2D1
        String result = "";
        String nonDup = RemoveDup(str);
        int count = 0;

        for (int i = 0; i < nonDup.length(); i++) {

            result += ""+nonDup.charAt(i) + frequencyOfChar(str, nonDup.charAt(i));

        }
        return result;
    }


        public static String RemoveDup (String str){

            String result = "";

            for (int i = 0; i < str.length(); i++) {
                if (!result.contains(str.substring(i, i + 1))) {
                    result += str.substring(i, i + 1);
                }
            }
            return result;
        }


        public static int frequency (String str1, String str2){
            //  aabb             ab
            int countStr2 = 0;
            for (int j = 0; j < str1.length() - str2.length() + 1; j++) {
                if (str1.substring(j, j + str2.length()).equals(str2)) {
                    countStr2++;
                }

            }
            return countStr2;
        }



        public static int frequencyOfChar (String str,char myChar){
            int counter = 0;
            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == myChar) {
                    counter++;
                }
            }
            return counter;
        }

    }