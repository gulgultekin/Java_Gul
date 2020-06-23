package OfficeHours.Practice_06_03_2020;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ReversedArray {

   // 3) Create a method that will accept an int array and reverse the order of elements. Return the reversed array.


    public static int[]reverse(int[]arr){

        for(int i=0; i<arr.length/2; i++){   //yarisi swap yapinca diger yarisi da zaten swap olmus oluyor. o yuzden 1/2
            int temp = arr[i];   //temp in icine ilk elementi alip

            arr[i] = arr[arr.length-1-i]; //son elementi ilkin yerine koyuyoruz.
            arr[arr.length-1-i] =temp;   //temp in icindeki en sona atiyoruz
        }
        return arr;

        //2. cozum

//        int[]reverse= new int[arr.length];
//        int j=0;
//        for(int i=arr.length-1; i>=0;i--){
//            reverse[j]=arr[i];
//            j++;
//        }
//        return reverse;

    }
    /*
    4) Overload the method to accept an ArrayList of integers and reverse the order of the elements.
      Return the reversed ArrayList
    */
    public static ArrayList<Integer> reverse(ArrayList<Integer>list){

        ArrayList<Integer>rev = new ArrayList<>();

        for(int i=list.size()-1; i>=0;i--){
            rev.add(list.get(i));
        }
        return rev;
    }

    public static void main(String[] args) {
        int[]arr={1,3,5,2,80,90,15};
        System.out.println(Arrays.toString(reverse(arr)));

        ArrayList<Integer>list = new ArrayList<>(Arrays.asList(20,30,50,10));
        System.out.println(reverse(list));
    }

}
