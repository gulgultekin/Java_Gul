package day29_Wrapper_ArrayList;

import Resources.Library;

import java.util.ArrayList;

public class List_Practice2_MaxNum {

     /*
        1. create a list of Integers
        2. add 5 Integers to it
        3. return the maximum number from the list
         */


        public static void main(String[] args) {

            ArrayList<Integer> num = new ArrayList<>();
                          num.add(50);
                          num.add(80);
                          num.add(90);
                          num.add(150);
                          num.add(30);
                          num.add(130);
                          num.add(300);

            System.out.println(num.size()); //7

          //  int max = Integer.MIN_VALUE;
            int max = num.get(0); // bu sekilde de yazabiliriz--> 0 index olan numberi once max kabul edip
                                 // digerleriyle karsilastiriyoruz demek

            for(int i =0; i< num.size(); i++){

                if(num.get(i) > max){
                    max = num.get(i);
                }

            }

            System.out.println(max); //300


            // for each loop ile

            int max2 = Integer.MIN_VALUE;

            for(Integer each: num){
                if(each> max2){
                    max2 = each;
                }
            }

            System.out.println(max2); //300

            ArrayList<Integer> list = new ArrayList<>();
                       list.add(5000);
                       list.add(7000);
                       list.add(8000);

                   int max3 = Library.maximum(list);
            System.out.println(max3);



    }

    public static int maximum(ArrayList<Integer> num){

            int max = Integer.MIN_VALUE;

        for(int i =0; i< num.size(); i++){

            if(num.get(i) > max){
                max = num.get(i);
            }

        }
        return max;
    }
}
