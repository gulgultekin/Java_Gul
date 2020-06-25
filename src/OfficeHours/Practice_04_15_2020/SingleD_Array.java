package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class SingleD_Array {
    public static void main(String[] args) {

        int a= 100;

        int[] arr ={100,200,300};
              //     0   1   2

        System.out.println(arr[1]); //200

        for(int i=0; i<arr.length; i++){ // index number of element
         //  System.out.println(i);//  0 1 2 yani index numberlari veriyor

            int num= arr[i];
            System.out.println(num); // 100  200   300

        }
        System.out.println("*******************************");
          //  while loop ile cozumu

        int j =0;
        while(j<arr.length){
            System.out.println(arr[j]); // 100   200 300

            j++;
        }
        System.out.println("*******************************");

        String[] names= {"John","Aaron","Lisa"};
        String[] reverse = new String[names.length];

      /*  //      i          k
        reverse[0] = names[2];
        reverse[1] = names[1];
        reverse[2] = names[0];


        System.out.println(Arrays_Pract.toString(reverse)); // [Lisa, Aaron, John]
      */
      /*
        int k = names.length-1;
        for(int i=0; i< reverse.length; i++){

           // reverse[names.length-1-i]= names[i]; // bu da baska bir yol  //[Lisa, Aaron, John]

            reverse[i]=names[k];
            k--;
        }

        */
        // while loop ile baska bir cozum

        int i=0;
        int k = names.length-1;

        while(i<names.length-1){
            reverse[i] =names[k];

            i++;
            k--;
        }



        System.out.println(Arrays.toString(reverse));  //[Lisa, Aaron, John]



    }
}
