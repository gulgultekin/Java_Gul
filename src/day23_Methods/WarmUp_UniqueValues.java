package day23_Methods;

public class WarmUp_UniqueValues {
    public static void main(String[] args) {
        /*
        mup task:
    1.  Write a program that can print out the unique values from a String Array
            Ex:
                if arr -> {"A", "A", "B", "C", "C"}
                output: B
                if arr -> {"A", "B", "B", "C"}
                output:  A
                         C
            MUST use for each loop

         */

        String[] arr = {"A", "A", "B", "C", "C","D","E"};

        for(String each2: arr){

            int count =0;
            for(String each : arr) {

                if (each.equals(each2)) {
                    count++;
                }
            }
                if(count==1){

                    System.out.println(each2);
                }

            }
        System.out.println("*********************");

        // for loop ile

        for(int j =0; j< arr.length; j++){
            int count=0;

            for(int i =0; i< arr.length; i++){

                if(arr[j].equals(arr[i])){
                    count++;
                }

            }
            if(count==1){
                System.out.println(arr[j]);
            }
        }

        System.out.println("===========================");
          //while loop ile
      int j=0;
      while(j<arr.length){
          int i=0;
          int count=0;

          while(i< arr.length){

             if(arr[i].equals(arr[j])){
                  count++;
              }

             i++;
             }if(count==1){
              System.out.println(arr[j]);
             }

         j++;
      }

        System.out.println("*********************************");

      // forloop and  for-each loop ile

        for(String each: arr){
            int count=0;
            for(int i=0; i<arr.length; i++){
                if(arr[i].equals(each)){
                    count++;
                }
            }
            if(count==1){
                System.out.println(each);
            }
        }







        }


    }

