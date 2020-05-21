package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Method2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
           list.add("A"); //0
           list.add("B"); //1
           list.add("C"); //2

       // list.remove(1); // index no su 1 olan "B" yi remove yap


        boolean bool1 = list.remove("F");
        System.out.println(bool1);// false cunku F yok listemizde

        String str = "B";
        boolean bool = list.remove(str);// "B" remove yapildi mi? --> true b

        System.out.println(list); //[A, C]
        System.out.println(bool); //true

        list.clear();// butun herseyi siliyor ve arrayListte hic birsey kalmiyor size=0

        System.out.println(list); //[] hicbirsey kalmadi
        System.out.println(list.size()); // 0

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1); //0
        list2.add(1); //1
        list2.add(2); //2
        list2.add(33); //3

        int num1 = list2.indexOf(1); // 0 --> index num 0
            // Integer = int  Autoboxing

        System.out.println(num1); // 1 in index num veriyor. (ilk buldugu 1)

        int num2 = list2.indexOf(100); // index num--> -1 veriyor yani boyle bir object yok demek
        System.out.println(num2);

        int num3 = list2.indexOf(33);
        System.out.println(num3); // 3--> 3 un index numberi olan 3 u veriyor








    }
}
