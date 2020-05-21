package day30_ArrayList;

import java.util.ArrayList;

public class WarmUp_4_Unique {
    public static void main(String[] args) {
         /*4.  write a program that can find the unique elements from an ArrayList of integers and stores
           into another list called uniques
            ex: list==> {1,1,2,3,3,4,5}
                uniques ==> {2,4,5}
                */

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        ArrayList<Integer>uniques = new ArrayList<>();

        for (Integer each2 : list) {
            int count = 0;
            for (Integer each : list) {
                if (each == each2) {
                    count++;
                }

            }
            if (count == 1) {
                uniques.add(each2);
            }

        }
        System.out.println(uniques);


          //for loop ile

        ArrayList<Integer>uniques2 = new ArrayList<>();

        for(int i=0; i<list.size(); i++){

            int count = 0;
            for (Integer each : list) {
                if (each == list.get(i)) {
                    count++;
                }

            }
            if (count == 1) {
                uniques2.add(list.get(i));
            }
        }

        System.out.println(uniques2);





    }
}
