package OfficeHours.Practice_04_29_2020;

import java.util.ArrayList;

public class ArrayList_Methods {
    /*
    ArrayList: does not support primitive
               size is dynamic,size is auto-adjusted
    add(), get(), size(), remove(), clear(), indexOf(), lastIndexOf()
     */

    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(1,30);// adds the element at the given index

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(2));// return Integer
        //boyle de yazilabilir
        Integer num=list.get(2); //yada
        int num1 = list.get(2);//3 u de ayni sey















    }


}
