package OfficeHours.Practice_04_15_2020;

public class ForEach_Loop {
    public static void main(String[] args) {
        /*
        for each loop:
         */
        int[] arr ={1,2,3,4};
        for(int each: arr){
            if(each==3){
               // continue; 1 2  4
                break; // 1  2  3 ten sonra looptan cikiyor o yuzden sadece 1 ve 2
            }
            System.out.println(each);
        }
        System.out.println("***********************");

        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};

        for(int each: arr2){
            if(each % 2 ==0){
                System.out.println(each);

            }
        }




    }
}
