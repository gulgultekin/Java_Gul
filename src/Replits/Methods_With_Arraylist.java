package Replits;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Methods_With_Arraylist {
    /*
    In this assignment you will swap a position in an array list with another.

swap gets 3 arguments, an arraylist, a position, and another position to swap with.

for example:

swap(["one","two","three"],0,2)
returns:["three","two","one"]


swap(["a","c","b","d","e"],0,3)
returns:["d","c","b","a","e"]
     */

    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println(list);

       Collections.swap(list,1,3);


        System.out.println(list);
    }


//    public static ArrayList<String> swap(ArrayList<String> list, int pos1, int pos2)
//    {
//
//        list.add("a");
//        list.add("b");
//        list.add("c");
//        list.add("d");
//        list.add("e");
//
//
//       Collections.swap(list,1,3);
//
//
//
//    }
}
