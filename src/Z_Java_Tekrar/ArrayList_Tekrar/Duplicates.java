package Z_Java_Tekrar.ArrayList_Tekrar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class Duplicates {
     /* write a program that can return the duplicated values from an ArrayList of String
        Ex:
            list: {"A", "B", "A", "C", "D"};
            output: ["A"]
            list: {"A", "B", "B", "C", "D", "D"};
            output: ["B", "D"]
     */
     public static void main(String[] args) {

         ArrayList<String> list = new ArrayList<>(Arrays.asList("A", "B", "A", "C", "D"));

        ArrayList<String>result = new ArrayList<>();

        for(int i=0; i< list.size(); i++){
            int count= Collections.frequency(list,list.get(i));
            if(count>1 && !result.contains(list.get(i))){
                result.add(list.get(i));
            }
        }
         System.out.println(result);





//         Predicate<String> dup = p-> Collections.frequency(list,p)==1;
//         list.removeIf(dup);
//         System.out.println(list);



     }
}
