package Z_Java_Tekrar.ArrayList_Tekrar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Move_Zeros {
  /*  warmup tasks:
    Write a program that can move all the zeros to  last indexes of ArrayList
    Ex:
    list:  {1, 0, 2, 0, 3, 0, 4, 0};
    output: [1, 2, 3, 4, 0, 0, 0, 0]
    DO NOT USE SORT method, DO NOT declare any extra arrayList*/
  public static void main(String[] args) {

      ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));
      System.out.println(list);
//      int count=0;
//      for(Integer each: list){
//          if(each==0){
//             count++;
//          }
//      }
//      list.removeAll(Arrays_Pract.asList(0));
//      System.out.println(list);
//      for(int i=0; i<count; i++){
//          list.add(0);
//      }
//
//      System.out.println(list);



    for(int i=0; i< list.size(); i++){
        if(list.get(i).equals(0)){
            list.remove(list.get(i));
            list.add(0);
        }
    }
      System.out.println(list);
  }
}
