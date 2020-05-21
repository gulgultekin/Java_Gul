package Z_Java_Tekrar.ArrayList_Tekrar;

import java.util.ArrayList;
import java.util.Arrays;

public class ReversedNumber {
      /*2. write a program that can print the list of integers in reversed order
        ex:
            list=> {1,2,3,4,5}
            output: 5 4 3 2 1
            */
      public static void main(String[] args) {

          ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
          ArrayList<Integer> reverse = new ArrayList<>();

          for(int i= list.size()-1; i>=0; i--){
              reverse.add(list.get(i)) ;
          }

          System.out.println(reverse);



      }
}
