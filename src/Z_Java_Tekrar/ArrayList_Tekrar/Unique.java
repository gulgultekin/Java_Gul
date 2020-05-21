package Z_Java_Tekrar.ArrayList_Tekrar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class Unique {
         /*
    3. write a program that can print out the unique elements from an int array
           HINT: store all the unqie elemenbts of array into a list of integers
           Ex: array==> {1,1,2,3,3,4,5}
               output: {2,4,5}
               */
         public static void main(String[] args) {

             int[] arr = {1,1,2,3,3,4,5};
             ArrayList<Integer> list = new ArrayList<>();
             ArrayList<Integer> result = new ArrayList<>();

             for(int each: arr){
                 list.add(each);
             }

             System.out.println(list);

             for(int j=0; j< list.size(); j++){

                 int count =0;
                 for(int i=0; i< list.size(); i++){

                     if(list.get(j)==list.get(i)){
                         count++;
                     }
                 }
                 if(count==1){
                     result.add(list.get(j));
                 }
             }
             System.out.println(result);

//             for(int each2 : arr) {
//                 int count = 0;
//                 for (int each : arr) {
//                     list.add(each);
//                     if (each ==each2){
//                         count++;
//                     }
//                 }
//                 if(count==1){
//                     result.add(each2);
//                 }
//             }
          //   System.out.println(result);
//             Predicate<Integer> dup = p-> Collections.frequency(list,p)!=1;
//             list.removeIf(dup);
//             System.out.println(list);







         }
}
