package Z_Java_Tekrar.ArrayList_Tekrar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

public class uniques {
    public static void main(String[] args) {
          /*4.  write a program that can find the unique elements from an ArrayList of integers and stores
           into another list called uniques
            ex: list==> {1,1,2,3,3,4,5}
                uniques ==> {2,4,5}
                */
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1,1,2,3,3,4,5));
        ArrayList<Integer> uni = new ArrayList<>();

        for(int x =0; x< list3.size(); x++){
            int count=0;

            for(int h=0; h<list3.size();h++){
                if(list3.get(x)==list3.get(h)){
                    count++;
                }
            }
            if(count==1){
                uni.add(list3.get(x));
            }
        }

        System.out.println("uni"+uni);

        System.out.println("******************************");

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,3,3,4,5,8,9));

        Predicate<Integer> nonunique = p->Collections.frequency(list,p)!=1;


        list.removeIf(nonunique);
        System.out.println(list);

    }
    }

