package Replits;

import java.util.ArrayList;

public class Methods_ArrayList_187 {
    /*
    Create a static method that:
is called combineAL
returns an ArrayList
takes two parameters: an ArrayList of Strings called wordList1, and an ArrayList of Strings called wordList2

This method should create a new ArrayList of Strings, add all the words (in order) from wordList1,
 then add all the words (in order) from wordList2.
 In other words, it is combining all the elements from the two parameters.
     */

    public static void main(String[] args) {

        ArrayList<String>wordList1=new ArrayList<>();
        wordList1.add("a");
        wordList1.add("b");
        wordList1.add("c");

        ArrayList<String>wordList2=new ArrayList<>();
        wordList1.add("d");
        wordList1.add("e");
        wordList1.add("f");
        wordList1.add("g");
        ArrayList<String>list = combineAL(wordList1,wordList2);
        System.out.println(list);


    }

    public static ArrayList<String>combineAL(ArrayList<String>wordList1,ArrayList<String>wordList2) {
        ArrayList<String>result=new ArrayList<>();

        for(String each: wordList1){
            result.add(each);
        }
        for(String each: wordList2){
            result.add(each);
        }

        return result;
    }
}
