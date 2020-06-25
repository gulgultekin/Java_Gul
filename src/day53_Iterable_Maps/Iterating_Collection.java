package day53_Iterable_Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Iterating_Collection {
    public static void main(String[] args) {

        ArrayList<Integer>list = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,6,6,5));

        for(int i=0; i<list.size(); i++){
            if(list.get(i) < 4){
                list.remove(i);
            }
        }
        System.out.println(list); //[1, 2, 3, 4, 4, 5, 6, 6, 5] sadece duplicate olanlari remove yapti, butun objeyi degil


        System.out.println("*****************************************************");


        // if we Want to remove the object from collection we have to use iterator kullanmaliyiz

        ArrayList<Integer>list2 = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,6,6,5));
        list2.removeIf( p ->p < 4);

        System.out.println(list2);//[4, 4, 5, 6, 6, 5] bununla 4den kucuk olanlarin hepsini remove yapti
                           //uses the iterator interface internally


        System.out.println("+++++++++++++++++++WHILE LOOP ILE ++++++++++++++++++++++++++++++++++++++++");

        ArrayList<Integer>list3 = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,6,6,5));

        Iterator<Integer> it  = list3.iterator();

       // System.out.println(it.hasNext()); //true    no more element olana kadar true
      // System.out.println(it.next()); //1

        while(it.hasNext()){ //when there is no-more element olunca stop yapacak
          if( it.next() < 4){
              it.remove();
          }
        }


        System.out.println(list3); //[4, 4, 5, 6, 6, 5]


        System.out.println("=================FOR LOOP ILE===============================");
            //yukardakiyle ayni

        ArrayList<Integer>list4 = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,6,6,5));

        //initialization and condition mandatory in for loop

        for(Iterator<Integer> I = list4.iterator(); I.hasNext();){

            int num = I.next();

            if(num < 4){
                I.remove();
            }

        }
        System.out.println(list4); // [4, 4, 5, 6, 6, 5]




    }
}
