package Z_Java_Tekrar.ArrayList_Tekrar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class Collection_Unique {
    public static void main(String[] args) {

        // write a program that can return the unique objects from arrayList of characters

        Character[] chars = {'A', 'A', 'B', 'C', 'D', 'D'};
        ArrayList<Character> list = new ArrayList<>(Arrays.asList(chars));
        System.out.println(list);

        ArrayList<Character> result = new ArrayList<>();

        for(Character each: list){

            int count=Collections.frequency(list,each);
            if(count==1){
                result.add(each);
            }
        }
        System.out.println(result);

        //predicate ile

        Predicate<Character> dup = p->Collections.frequency(list,p)!=1;
        list.removeIf(dup);
        System.out.println(list);


        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        int max= Collections.max(list2);
        int min= Collections.min(list2);
        System.out.println(max);
        System.out.println(min);

    }
}
