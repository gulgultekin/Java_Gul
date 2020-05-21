package Z_Java_Tekrar.ArrayList_Tekrar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class Collections_Methods {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,1,2,3,4,5,5));
        Collections.swap(numbers,0,2);
        System.out.println(numbers);

        Collections.replaceAll(numbers,1,9);
        System.out.println(numbers);


        // write a program that can return the unique objects from arrayList of characters

        Character[] chars = {'A', 'A', 'B', 'C', 'D', 'D'};

        ArrayList<Character> list = new ArrayList<>(Arrays.asList(chars));

        ArrayList<Character>result= new ArrayList<>();

        for(int i=0; i<list.size(); i++){
            int count=0;
            for(int j=0; j<list.size(); j++){
                if(list.get(i).equals(list.get(j))){
                    count++;
                }
            }
            if(count==1){
               result.add(list.get(i));
            }
        }
        System.out.println(result);



//        Predicate<Character>dup =p->Collections.frequency(list,p)!=1;
//        list.removeIf(dup);
//        System.out.println(list);


    }
}
