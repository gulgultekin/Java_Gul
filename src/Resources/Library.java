package Resources;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {

    public static int[] sortDesending(int[] arr){
        Arrays.sort(arr);  // {1,2,3,4};  ==> {4,3,2,1};
        int[] RevArr = new int[arr.length] ;
        /*
                      i        j
               RevArr[0] = arr[3]
               RevArr[1] = arr[2]
               RevArr[2] = arr[1];
               RevArr[3] = arr[0];
         */

        int j = arr.length-1;
        for(int i =0; i < arr.length; i++ ){
            RevArr[i] = arr[j];
            j--;
        }

        return RevArr;

    }

    public static String Reverse(String str){ // can reverse a string and return string
        String Reverse = "";

        for(int i = str.length()-1; i >= 0; i-- ){
            Reverse  += str.charAt(i);
        }

        return  Reverse;
    }


    public static String removesDup(String str){ // removes dup "abbcc"-->abc

        String result ="";

        for(int i=0; i< str.length(); i++){

            if(! result.contains(str.substring(i,i+1))){
                result+=str.substring(i,i+1);
            }
        }
        return result;
    }



    public static String removeDuplicates(String str){

        String result =""; //AB

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if(!result.contains(""+ch)){
                result+=ch;
            }
        }

        return result;
    }



    public static int frequency(String str1, String str2){
        int count =0;

        while (str1.contains(str2)){ // if statement gibi yazip if yerine while yazinca loop oldu
            count++;
            str1 = str1.replaceFirst(str2,""); // we need to make sure that we are not counting the same index over again
        }

        return count;


    }



    public static String uniqueValue(String str){  // to found unique character from string

        String result=""; // to store unique characters



        for(int j= 0; j < str.length(); j++) {
            int count=0; // to count number of appearances

            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }

            }
            if (count == 1) {
                result += "" + str.charAt(j);
            }
        }
        return result;
    }



    public static String frequencyOfChars(String str){

        String NonDup = Library.removeDuplicates(str);

        String result =""; //A2B2C3  contains the frequency of chars

        for (int i = 0; i < NonDup.length(); i++) {

            String ch = "" + NonDup.charAt(i); //A B C
            int num = Library.frequency(str, ch);// 2 2 3
            // System.out.print(ch + num); //A2B2C3
            result+= ch + num;
        }

        return result;
    }


    public static int frequency(String str, char ch){ // count ch frequency
        char[] arr = str.toCharArray(); //[ A, A, A]
        int count =0;
        for(char each: arr){
            if(each == ch){
                count++;
            }

        }
        return count;

    }


    public static String uniques(String str){

        String result ="";
        for(int i =0; i< str.length(); i++){

            int num = frequency(str,str.charAt(i));
            if(num == 1){
                result += str.charAt(i);
            }
        }

        return result;

    }

    public static int maximum(ArrayList<Integer> num){ // returns the max number from ArrayList

        int max = Integer.MIN_VALUE;

        for(int i =0; i< num.size(); i++){

            if(num.get(i) > max){
                max = num.get(i);
            }

        }
        return max;
    }






}