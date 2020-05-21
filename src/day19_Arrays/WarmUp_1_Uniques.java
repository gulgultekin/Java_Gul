package day19_Arrays;

public class WarmUp_1_Uniques {
    public static void main(String[] args) {
        /*
          Warm up task:
    1. write a program that can return the unique characters from a string
        Ex:  "AABCC" ==> "B"*/
     // unique-->it only occures 1

         String str = "AABCCDEEF";

         String result = ""; //"BDF"

        for(int j =0; j <= str.length()-1; j++){

            char ch2= str.charAt(j);

            int count= 0; //bir harften kac tane old sayiyor

            for(int i= 0 ; i <= str.length()-1 ;i++){

                char ch= str.charAt(i);

                if(ch == ch2){ // --> check how many time the character occured in the string
                //If(str.charAt(i)=='A'; diyince sadece A lari sayiyor
                    count++;
                }
            }
            if(count==1){ // if unique--> eger bir harften sadece 1 tane varsa bunu resulta ekliyor
                //if the character at indx j is unique, will be concated to the result
                result+= ch2;
            }

        }
        System.out.println(result);






    }
}
