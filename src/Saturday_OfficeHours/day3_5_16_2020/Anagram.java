package Saturday_OfficeHours.day3_5_16_2020;

import java.util.Arrays;

public class Anagram {

    //listen
    //silent
    public static void main(String[] args) {
        System.out.println(isAnagram("listen","silent"));
    }

    public static boolean isAnagram(String one, String two){
        if(one.length() != two.length()) return false;

        int[]count = new int[26];
        for(int i=0; i< one.length();i++){

           // count[0] = count[0]+1;
            char c = one.charAt(i); //l
            char d = two.charAt(i);
            //a ->97 , b ->98
            count[c-97] = count[c-97]+1;
            count[d-97] = count[d-97]-1;

        }
        return Arrays.equals(count,new int[26]);
    }




}
