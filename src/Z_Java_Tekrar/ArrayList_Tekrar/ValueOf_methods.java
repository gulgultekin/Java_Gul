package Z_Java_Tekrar.ArrayList_Tekrar;

import java.util.ArrayList;
import java.util.Arrays;

public class ValueOf_methods {
    public static void main(String[] args) {

        String str = "123";
        int a = Integer.valueOf(str);
        System.out.println(a + 1);

        int b = Byte.valueOf(str);
        System.out.println(b);

        double d = Double.valueOf(str);
        System.out.println(d + 1);

        double db = Double.parseDouble(str);
        System.out.println(db + 1);
        System.out.println(d == db);
        System.out.println("*************************");
         /*
        "True"
        "FALse"==> to boolean
        "1000000.5" ==> to float
        "123456" ==> to int
         */

        String s = "TRuE";
        boolean z = Boolean.valueOf(s);
        System.out.println(z);
        boolean y = Boolean.parseBoolean(s);
        System.out.println(y);

        String ss = "1000000.5";
        float f = Float.valueOf(ss);
        System.out.println(f + 1);
        System.out.println(ss + 1);

        String g = "123456";
        Integer i = Integer.valueOf(str);
        int o = Integer.parseInt(str);
        System.out.println(i + 1);
        System.out.println(o + 1);
        System.out.println(i == o);

        int max = Integer.MAX_VALUE;
        System.out.println(max);
        int min= Integer.MIN_VALUE;
        System.out.println(min);


    /*2. write a program that can print the list of integers in reversed order
        ex:
            list=> {1,2,3,4,5}
            output: 5 4 3 2 1
            */

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> reversed = new ArrayList<>();

        for(int ii= list.size()-1; ii>=0; ii--){
            reversed.add(list.get(ii)) ;
        }
        System.out.println(reversed);

        System.out.println("===========================");
         /*
    3. write a program that can print out the unique elements from an int array
           HINT: store all the unqie elemenbts of array into a list of integers
           Ex: array==> {1,1,2,3,3,4,5}
               output: {2,4,5}
               */


         int[] arr= {1,1,2,3,3,4,5};
         ArrayList<Integer> uniq = new ArrayList<>();
         for(int each2: arr){

             int count=0;

         for(int  each: arr){
             if(each==each2){
                 count++;
             }
         }
         if(count==1){
             uniq.add(each2);
         }

    }
        System.out.println(uniq);

         /*4.  write a program that can find the unique elements from an ArrayList of integers and stores
           into another list called uniques
            ex: list==> {1,1,2,3,3,4,5}
                uniques ==> {2,4,5}
                */
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1,1,2,3,3,4,5));
        ArrayList<Integer> uni = new ArrayList<>();

        for(int x =0; x< list3.size(); x++){
            int count=0;

            for(int h=0; h<list3.size();h++){
                if(list3.get(x)==list3.get(h)){
                    count++;
                }
            }
            if(count==1){
                uni.add(list3.get(x));
            }
        }

        System.out.println("uni"+uni);

    }
}
