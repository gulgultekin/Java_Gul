package day30_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Methods {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
             list1.add(5);
             list1.add(7);
             list1.add(8);

             list1.add(1,6); // index 1 e 6 yi ekle demek

           //  list1.add(7,10); // IndexOutOfBounds: cunku--> index 7 yok

        System.out.println(list1); //[5, 6, 7, 8]


        //set method===> replace

        list1.set(3,9);
        System.out.println(list1); //[5, 6, 7, 9]

        System.out.println("=================");

        // array de replace
        int[] arr ={1,2,3,4};
        arr[3]=5;
        System.out.println(Arrays.toString(arr)); //[1, 2, 3, 5]

        System.out.println("**********************************");

        ArrayList<String> list2 = new ArrayList<>();

        list2.add("A");
        list2.add("B");
        list2.add(1,"C");
        list2.add(1,"D");

        System.out.println(list2); // [A, D, C, B]


        // {A,D,E,F} yazmak icin

        list2.set(3,"F");
        list2.set(2, "E");

        System.out.println(list2); //[A, D, E, F]

        System.out.println("**********************");

        ArrayList<Integer> list3 = new ArrayList<>();

               list3.add(1); // index num 0
               list3.add(2); // index num 1
               list3.add(3); // index num 2
               list3.add(4); // index num 3

        System.out.println(list3); // [1, 2, 3, 4]

         // burada int olarak index num veriyoruz

        int a = 1; // a--> index number //  list3.remove(1); diye de yazilabilir
        list3.remove(a); // a--> index number --> it will remove 1. index

        System.out.println(list3); //[1, 3, 4]

        list3.remove(2);
        System.out.println(list3); //[1, 3]

        System.out.println("**********************");

        ArrayList<Integer> list4 = new ArrayList<>();

        list4.add(10); // index num 0
        list4.add(20); // index num 1
        list4.add(30); // index num 2
        list4.add(40); // index num 3

        Integer b = 10; // buradaki 10 index num degil, object olan 10 cunku Integer yazdik yani wrapper class

        list4.remove(b);
        System.out.println(list4); //[20, 30, 40]

        // remove --> 20

       // list4.remove(20); boyle yazamiyoruz cunku onu direk int yani index num olarak algiliyor, out of bound

        // list4.remove(0);// ya 20 nin index num veriyoruz yada asagidaki gibi yapiyoruz

        Integer c = 20;
        boolean bool = list4.remove(c); // remove(object) --> returns boolean

        System.out.println(list4);
        System.out.println(bool); // true --> cunku 20 remove yapildi mi? diye soruyoruz. remove old icin -->true





    }
}
