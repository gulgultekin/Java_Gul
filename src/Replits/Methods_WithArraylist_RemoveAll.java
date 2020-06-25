package Replits;

import java.util.ArrayList;
import java.util.Arrays;

public class Methods_WithArraylist_RemoveAll {
    /*
    Create a static method that:
is called removeAll
returns nothing
takes two parameters: an ArrayList of Strings called wordList, and a String called targetWord

This method should go through every element of wordList and remove every instance of targetWord from the ArrayList.

Example:

ArrayList<String> wordList = new ArrayList<String>(Arrays_Pract.asList("hi","hey","hi","yo"));

removeAll(wordList,"hi");

now wordList is ["hey","yo"]

     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("hi","hey","hi","yo"));
        String str = "hi";
        removeAll(list,str);


    }

    public static void removeAll(ArrayList<String> wordList, String targetWord){


        wordList.removeAll(Arrays.asList(targetWord));
        System.out.println(wordList);

    }
}
