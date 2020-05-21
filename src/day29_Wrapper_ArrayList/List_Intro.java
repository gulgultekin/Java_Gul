package day29_Wrapper_ArrayList;
import java.util.ArrayList;

public class List_Intro {

    public static void main(String[] args) {

        //ArrayList<DataType> names = new ArrayList<DataType>();

        ArrayList<Integer> scores = new ArrayList<>();// size:0;
                                        // add 5 element size: 5
                                     // remove 2 element size: 3

        scores.add(10); //Autoboxing     size:1

        System.out.println(scores); // [10]

        scores.add(20); //Autoboxing     size:2
        scores.add(30);  // size:3

        System.out.println(scores); //[10, 20, 30]

        Integer a1 = scores.get(2); //    none boxing

        int a2 = scores.get(2);   // unboxing

        double a3 = scores.get(2);  // unboxing

        System.out.println(a2); // 30

       //System.out.println(scores.get(100)); // IndexOutOfBoundsException

        System.out.println("********************");

          /*
        1. create a list of Integers
        2. add 5 Integers to it
        3. return the maximum number from the list
         */





    }


}
