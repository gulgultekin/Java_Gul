package OfficeHours.Practice_06_17_2020;

public class Anagram {

    public static void main(String[] args) {
        System.out.println(isAnagram( "abcf","baff"));
    }

    public static boolean isAnagram(String one, String two){

        //abc
        //d
        if(one.length() !=   two.length()) return false;

        for(int i=0; i< one.length(); i++){

            two = two.replaceFirst(""+one.charAt(i),"");
        }

        return two.isEmpty();

    }
}
