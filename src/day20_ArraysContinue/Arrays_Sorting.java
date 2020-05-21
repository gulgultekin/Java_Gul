package day20_ArraysContinue;

import java.util.Arrays;

public class Arrays_Sorting {
    public static void main(String[] args) {

        int[] arr1 = {9,3,7,1,5};
        Arrays.sort(arr1); // kucukten buyuge siraliyor ascending order

        System.out.println(Arrays.toString(arr1));

        System.out.println("First min number is: "+arr1[0]); // 1
        System.out.println("Second min number is: "+arr1[1]); //3

        System.out.println("First max number is: "+arr1[arr1.length-1]); //9
        System.out.println("Second max number is: "+arr1[arr1.length-2]);// 7


        char[] ch = {'Z','$','1','a', 'D', 'Y', 'A','R'};
                             //symbol < number < uppercase < lowercase
        Arrays.sort(ch);

        System.out.println(Arrays.toString(ch));


        String[] names = {"Deniz","Osman","Rustem","Ali","Anna"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        System.out.println("===========================================");

        //Descending Order--Buyukten kucuge

        int[] arr = {3,4,1,-100,59,150};

        Arrays.sort(arr); //[-100, 1, 3, 4, 59, 150]

        int[] arrDes = new int[arr.length];// simdilik [0,0,0,0,0,0,0,0]

        System.out.println(Arrays.toString(arr)); //[-100, 1, 3, 4, 59, 150]

       int j =0;// represent arrDes

        for(int i= arr.length-1; i>=0; i--){
           // System.out.print(arr[i]+" "); //sadece bunu yazarakta olur
           arrDes[j] = arr[i];
            j++;

        }
        System.out.println(Arrays.toString(arrDes)); //[150, 59, 4, 3, 1, -100]

        ///////
        for (int i = 0; i < arr.length-1; i++) {
            arrDes[arr.length-1-i] = arr[i];

        }
        System.out.println("With new method : "+ Arrays.toString(arrDes));



    }
}
