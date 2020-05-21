package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collections_Uniques_ {
    public static void main(String[] args) {

        // write a program that can return the unique objects from arrayList of characters

        Character[] chars = {'A', 'A', 'B', 'C', 'D', 'D'};

        ArrayList<Character> charList = new ArrayList<>(Arrays.asList(chars));
        System.out.println(charList);

        ArrayList<Character> result = new ArrayList<>(); // [B,C]

//        for(int i=0; i< charList.size(); i++){
//
//            int count = Collections.frequency(charList,charList.get(i)); // once count yapiyoruz
//            if(count==1){                           // sadece 1 tane olanlari resulta ekliyoruz
//                result.add(charList.get(i));
//            }
//
//        }

        //for-each loop ile

        for (Character each : charList) {
            int count = Collections.frequency(charList, each);
            if (count == 1) {

                result.add(each);
            }

        }
        System.out.println(result); // [B, C]
    }
}
