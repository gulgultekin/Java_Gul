package Replits;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Switch_Element {
    /*
    Switch the last element in an array with the first and return the array.

example:

do_switch([1,2,3,4])
returns:[[4,2,3,1]

do_switch([7,2,3,5])
returns:[5,2,3,7]

     */
    public static void main(String[] args) {
        int[]arr={1,2,3,4};
        System.out.println(Arrays.toString( do_switch(arr)));
    }
    public static int[] do_switch(int[] i)
    {

      int a=i[0];
      i[0]=i[i.length-1];
      i[i.length-1]=a;
      return i;

    }
}
