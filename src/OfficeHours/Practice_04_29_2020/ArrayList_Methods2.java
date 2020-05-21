package OfficeHours.Practice_04_29_2020;

import java.util.ArrayList;

public class ArrayList_Methods2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add(2,"E"); //[A, B, E, C, D]

        System.out.println(list);

       //for loop ile

        for(int i=0; i< list.size();i++){
            //System.out.print(list.get(i)+" "); yada
            String str = list.get(i);
            System.out.print(str+" ");
        }

        System.out.println("***************************");

        //for each loop ile

        for(String each: list){
            System.out.println(each);
        }


        // [A, B, E, C, D] replace C with F

        list.set(3,"F");
        System.out.println(list);


    }
}
