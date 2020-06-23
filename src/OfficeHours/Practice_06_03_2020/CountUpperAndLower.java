package OfficeHours.Practice_06_03_2020;

import java.util.Arrays;

public class CountUpperAndLower {
    /*
    7) Create a method that will accept a String of multiple words separated by a space
    and return a 2D array. Each array in the multidimensional array will have two elements:
    the number of uppercase letters and the number of lowercase letters

     */

    public static void main(String[] args) {
        String str ="The House is BiG how Many words";
        System.out.println(Arrays.deepToString(countAll(str)));

    }

//    public static int[][]countAll(String str){
//
//        String[]words = str.split(" ");
//
//        int[][]count = new int[words.length][2]; //2--> sadece uppercase ve lowercase count yapacagimiz icin
//        int index =0;
//
//        for(String each: words){
//
//            int upper =0;
//            int lower =0;
//
//            for(int i=0; i<each.length();i++){
//                if(Character.isUpperCase(each.charAt(i))){
//                    upper++;
//                }else if(Character.isLowerCase(each.charAt(i))){
//                    lower++;
//                }
//            }
//
//            count[index++]=new int[]{upper,lower};
//        }
//              return count;
//
//    }
public static int[][]countAll(String str){

    String[]words = str.split(" ");

    int[][]count = new int[words.length][2]; //2--> sadece uppercase ve lowercase count yapacagimiz icin
    int index =0;

    for(String each: words){

        count[index++]=countUpperAndLower(each);
    }
    return count;
}

      private static int[]countUpperAndLower(String word){
          int upper =0;
          int lower =0;

          for(int i=0; i<word.length();i++){
              if(Character.isUpperCase(word.charAt(i))){
                  upper++;
              }else if(Character.isLowerCase(word.charAt(i))){
                  lower++;
              }
          }
          int []each ={upper,lower};
          return each;
          //return new int[]{upper,lower};
      }
}
