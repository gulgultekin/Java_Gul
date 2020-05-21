package day31_BulkOperations;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class Bulk_ContainsAll {
    public static void main(String[] args) {

        ArrayList<Integer> list1= new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        //if 10,20,60 if all exts in arralist ==> true
        //otherwise==>false

//        boolean r1 = list1.contains(10);
//        boolean r2 = list1.contains(20);
//        boolean r3 = list1.contains(60);
//        boolean result = r1 ==true && r2 ==true && r3 ==true; //false
//        System.out.println(result);


        //yukaridakinin yerine containsAll ile hepsini sorgulayabilirsin list1.containsAll( Arrays.asList(10,20,..)
        boolean result2 = list1.containsAll( Arrays.asList(10,20,40)); // buraya butun hepsini girebilirsin
        System.out.println(result2);

        //10,20,30   Integer not int

        Integer[]data={10,20,30};
        list1.containsAll(Arrays.asList(data));

        boolean result3 = list1.containsAll(Arrays.asList(data));

        System.out.println(result3);





    }
}
