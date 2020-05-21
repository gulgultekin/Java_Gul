package day25_MethodsRecap;

import Resources.Library;

public class test {

    public static void main(String[] args) {

        String str = "ABCDABBC";

        String result = Library.removeDuplicates(str);
        System.out.println(result); // ABCD

        String str1 = "AABBCDEB";
        String str2 = "B";

        int num1 = Library.frequency(str1, str2);
        System.out.println(num1);  // 3


        String str3 = "MMMNNNDDGGGTT";
        String result3 = Library.frequencyOfChars(str3);
        System.out.println(result3); // M3N3D2G3T2


    }
}
