package OfficeHours.Practice_04_29_2020;

import java.util.ArrayList;

public class ArrayList_Methods3 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println(list);// [A, B, C, D, E]

        list.remove(3); //[A, B, C, E] remove 3. index
        System.out.println(list);

        list.remove("A");  // [B, C, E] remove "A"
        System.out.println(list);

        boolean r1 = list.remove("B"); //true
        System.out.println(r1);

        boolean r2 = list.remove("Z"); //false cunku oyle bir element yok
        System.out.println(r2);


        list.clear();
        System.out.println(list.size());//0 cunku clear hepsini sildi






    }
}
