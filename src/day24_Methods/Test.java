package day24_Methods;

import java.util.Arrays;

import Resources.Library; // import yaptik

public class Test {
    public static void main(String[] args) {

        String str = "Cybertek";

        String RevStr = Library.Reverse(str); // Library classindaki methodu buraya cagirdik ve reverse calisti

        System.out.println(RevStr);

        System.out.println(str.equalsIgnoreCase(RevStr)); // false -->it is not a palindrome

        int[] arr = { 100, 200, 500, 230, 540};

        arr = Library.sortDesending(arr);

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));



    }
}
