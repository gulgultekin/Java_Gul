package day52_Collection;

import java.util.*;

public class Lists {
    public static void main(String[] args) {

      //  List<String> list0 = new List<>(); //list interface old icin obje olusturulamaz

        List<Integer> list1 = new ArrayList<>(); //arraylist Listin childi old icin obje olusturulur
        list1.add(1);          //ArrayList class implementing List so obje can be created

        List<Integer> list2 = new LinkedList<>(); //LinkedList Listin childi old icin obje olusturulur
        list2.add(10);
        list2.remove(0);

        System.out.println("*********************************");

        ArrayList<Integer> arraylist = new ArrayList<>();

        arraylist.add(10);



        Vector<Integer> vector = new Vector<>();  //synchronized
        vector.add(10);

        Stack<Integer> stack = new Stack<>();//stack inherit from--> vector, stack subclass of vector
        stack.add(10);   //synchronized


        System.out.println("*****************************");

        //if last in first out---> stack

        Stack<String> names = new Stack<>();

        names.add("Sha");
        names.add("Gul");
        names.add("Yusuf");
        names.add("Beyza");
        names.add("Sener");

        System.out.println(names);//[Sha, Gul, Yusuf, Beyza, Sener]

       String s1 =  names.pop(); //sener   son ekleneni  remove yapar
        System.out.println(s1); //sener

        System.out.println(names); // son ekleneni cikarip print yapiyor //[Sha, Gul, Yusuf, Beyza]

       String s2 = names.pop(); // beyza

        System.out.println(s2); //Beyza
        System.out.println(names); //[Sha, Gul, Yusuf]

        names.push("cinnamon"); //ekledi
        System.out.println(names);//[Sha, Gul, Yusuf, cinnamon]






    }


    public synchronized void method1(){

    }


}
