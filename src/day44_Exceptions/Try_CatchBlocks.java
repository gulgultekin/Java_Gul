package day44_Exceptions;

import java.util.ArrayList;
import java.util.Arrays;

public class Try_CatchBlocks {
    public static void main(String[] args) {

        System.out.println("Test started");//it prints

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        try{
            System.out.println(list.get(10));// IndexOutOfBoundsException

        }catch (IndexOutOfBoundsException e){// parent yada grandparent exception name de verilebilir
            // RuntimeException(parent)
            //Exception  (grandParent)           // herhangi bir isim yada ->e is prefered name

            //her exception icin --> Exception kullanabiliriz

            System.out.println("Something went wrong");//if try block can not fix the exception
                                                        // catch block handeled the exception
        }

        System.out.println("Test completed");

    }
}
