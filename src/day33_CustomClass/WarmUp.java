package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class WarmUp {
    public static void main(String[] args) {


    /*
    1. write a program that can return the unique objects from a anArray List of Integers
            Ex:
                list: {1,1,2,3,4,5,5}
                sout(list); ==> {2,3,4};
        Note: 1. DO NOT use any extra arrayList
              2. DO NOT use any loops
              3. do not use any sort method
              4. use predicate only and collections methods only
        Hint:   Collections.frequency() // will return the frequency
                removeIf( frequency >1)  can keep the unique objects in arrayList
                */

        ArrayList<Integer> list =new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,3,4,5,5));

        Predicate<Integer> uniq = p-> Collections.frequency(list,p)!=1;// if the frequency of object is greater than 1 , we remove them
        list.removeIf(uniq);

        System.out.println(list);



/*2. write a program that can return the duplicated objects from a an ArrayList of Integers
            Ex:
                list: {1,1,2,3,4,5,5}
                sout(list); ==> {1,1,5,5};
        Note: 1. DO NOT use any extra arrayList
              2. DO NOT use any loops
              3. DO NOT use any sort method
              4. Use predicate and collections methods only*/

        ArrayList<Integer> list2 =new ArrayList<>(Arrays.asList(1,1,2,3,4,5,5));
        Predicate<Integer> dup = x->Collections.frequency(list2,x)==1;
        list2.removeIf(dup);
        System.out.println(list2);



/*3. write a program that can extract the special characters, digits and alphebets from a string and stores
them into seperate ArrayLists of Character:
            ex:
                str = "ABCD123$%#@&456EFG!";
                list1: {$, %, #, @, &, !}
                list2: {A, B, C, D, E, F, G}
                list3: {1, 2, 3, 4, 5, 6}
        DO NOT USE LAMBDA*/

        String str= "ABCD123$%#@&456EFG!";
        char[] arr = str.toCharArray();

        ArrayList<Character> num =new ArrayList<>();
        ArrayList<Character> alphabet =new ArrayList<>();
        ArrayList<Character> speCharacter =new ArrayList<>();

        for(char each: arr){
            if(Character.isDigit(each)){
                num.add(each);
            }else if(Character.isAlphabetic(each)){
                alphabet.add(each);
            }else{
                speCharacter.add(each);
            }
        }
        System.out.println(num);
        System.out.println(alphabet);
        System.out.println(speCharacter);




/*4. write a program that can extract the sepecial characters, digits and alphebets from a string
and stores them into seperate ArrayLists of Character:

        DO NOT USE LOOPS

     */
}
}