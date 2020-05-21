package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmUp_MoveZeros {
  /*  warmup tasks:
    Write a program that can move all the zeros to  last indexes of ArrayList
    Ex:
    list:  {1, 0, 2, 0, 3, 0, 4, 0};
    output: [1, 2, 3, 4, 0, 0, 0, 0]
    DO NOT USE SORT method, DO NOT declare any extra arrayList*/

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

                    list.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0, 0, 0, 0));

        System.out.println(list);


        int count=0;
        for(Integer each: list){
            if(each==0){
                count++;
            }
        }
        System.out.println(count);//7 tane 0 var

        //once 0 lari remove yapip sonra ekleyecegiz
        list.removeAll(Arrays.asList(0));
        System.out.println(list); //[1, 2, 3, 4]  simdi 0 lari sona ekleyecegiz

        for(int i=0; i<count; i++){
            list.add(0);
        }

        System.out.println(list); //[1, 2, 3, 4, 0, 0, 0, 0, 0, 0, 0]



    }
    }
