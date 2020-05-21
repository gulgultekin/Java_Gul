package Z_Java_Tekrar.ArrayList_Tekrar;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("A","B","C","D","C"));
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("A","B","C","D","C"));

        // {A,D,E,F,C} yazmak icin

       list.set(1,"D");
       list.add(2,"E");
       list.add(3,"F");
       list.remove(list.lastIndexOf("D"));
        list.remove("C");

        System.out.println(list);


        System.out.println("***********NUMBERS****************");

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(10,20,30,40,50,20,7,8));




        int a=  1;
        list2.remove(a);
        System.out.println( list2);



    }
}
