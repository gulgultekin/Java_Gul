package Z_Java_Tekrar.ArrayList_Tekrar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class Duplicate {
    /* write a program that can return the duplicated values from an ArrayList of String
        Ex:
            list: {"A", "B", "A", "C", "D"};
            output: ["A"]
            list: {"A", "B", "B", "C", "D", "D"};
            output: ["B", "D"]
     */
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("A", "B", "A", "C", "D","D","E","P"));

        ArrayList<String> result = new ArrayList<>();

        for(int i=0; i< list.size(); i++){
            int count=0;
            for(int j=0; j< list.size(); j++){
                if(list.get(j).equals(list.get(i))){
                    count++;
                }
            }
            if(count==1){
                result.add(list.get(i));
            }
        }
        System.out.println(result);


//        Predicate<String> nonDup = p-> Collections.frequency(list,p)!=1;
//        list.removeIf(nonDup);
//        System.out.println(list);

 /*2. write a program that can return the duplicated objects from a an ArrayList of Integers
			Ex:
				list: {1,1,2,3,4,5,5}
				sout(list); ==> {1,1,5,5};
		Note: 1. DO NOT use any extra arrayList
			  2. DO NOT use any loops
			  3. DO NOT use any sort method
			  4. Use predicate and collections methods only
		Hint:   Collections.frequency() // will return the frequency
				removeIf( frequency > 1)  can keep the duplicated objects in arrayList
     */


       ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,1,2,3,4,5,5));

       Predicate<Integer> dup = x->Collections.frequency(numbers,x)==1;

       numbers.removeIf(dup);
        System.out.println(numbers);


    }
}
