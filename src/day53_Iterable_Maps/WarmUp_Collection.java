package day53_Iterator_Maps;

import java.util.*;

public class WarmUp_Collection {
    /*
    1. write a program that remove the duplicates from an array of String
	2. write a program that can remove the duplicates from an arrayList of String

	3. what are the differences between List and Set
			List: Accepts duplicates, has index
			     Stack(C)-> LIFO(last in first out)
			Set: does not accepts duplicates, does NOT hove index
			Queue: Accepts duplicates, does NOT hove index, FIFO(first in first out)
	4. how to achieve thread safety
     */
    /*
    access-modifier   specifier   return-type   methodName(Parameter)
           specifiers--> static,final,abstract,syncronized
     */

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        list = Collections.synchronizedList(list); //thread-safe

        Set<Integer> set = new HashSet<>();
        set = Collections.synchronizedSet(set); // thread-safe

        System.out.println("********************");

        //1. write a program that remove the duplicates from an array of String

        String[] arr = {"E","B","A","D","D","C","A"};//EBADC
        LinkedHashSet<String>st = new LinkedHashSet<>(Arrays.asList(arr));

        // TreeSet<String>st = new TreeSet<>(Arrays.asList(arr));//[A, B, C, D, E]
       //treeset ile yapsaydik sort da yapacakti

       /* bu sekilde de array icindekiler eklenebilir
        for(String each:arr){
           st.add(each);
       }       */

        System.out.println(st);

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("E","B","A","D","D","C","A"));
        LinkedHashSet<String>st2 = new LinkedHashSet<>(arrayList);

        System.out.println(st2);



    }


    public synchronized void append(){

    }
}
