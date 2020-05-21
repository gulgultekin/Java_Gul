package OfficeHours.Practice_04_29_2020;
import java.util.ArrayList;

public class ArrayList_Methods4 {
    public static void main(String[] args) {

        // indexOf(object)==> returns the index num

        ArrayList<Character> list = new ArrayList<>();
              list.add('A');
              list.add('B');
              list.add('C');
              list.add('D');
              list.add('C');

              int indexNum = list.indexOf('C');//2

              System.out.println(indexNum);

              int lastindexNum= list.lastIndexOf('C'); //4

              System.out.println(lastindexNum);

              Character ch1='C';
             // list.remove(ch1); remove the first 'C'

              list.remove(list.lastIndexOf('C'));

              System.out.println(list);//[A, B, C, D]



    }
}
