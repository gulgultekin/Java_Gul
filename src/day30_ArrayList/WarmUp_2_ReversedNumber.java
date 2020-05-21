package day30_ArrayList;

import java.util.ArrayList;

public class WarmUp_2_ReversedNumber {
    public static void main(String[] args) {
         /*2. write a program that can print the list of integers in reversed order
        ex:
            list=> {1,2,3,4,5}
            output: 5 4 3 2 1
            */


        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<6; i++){
            list.add(i);
        }

        System.out.println(list); // [1, 2, 3, 4, 5]

        ArrayList<Integer> reversedList = new ArrayList<>();

        for (int i = list.size()-1; i >= 0; i--) {
          // int eachNum = list.get(i); //unboxing

            reversedList.add(list.get(i)); // alttakiyle ayni sey demek
            //reversedList.add(eachNum);
            //System.out.print(eachNum+" ");//5 4 3 2 1 int olarak

        }
        System.out.println(reversedList); // [5, 4, 3, 2, 1] ArrayList olarak

    }
}
