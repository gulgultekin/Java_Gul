package day19_Arrays;

public class Frequency {
    public static void main(String[] args) {

         /* 2. write a program that can return the frequency of the characters ina string
        Ex: "AABCBCA" ==> "A3B2C2"

         */

        String str ="AABCC";

        String result =""; //"A2B1C2"

        String nonDup =""; //ABC

        for(int i=0; i<str.length(); i++){
            if(!nonDup.contains(""+str.charAt(i))){
                nonDup+=str.charAt(i);
            }
        }
        System.out.println(nonDup);

        for(int i=0; i<nonDup.length(); i++){
             int count =0;

             for(int j =0; j<str.length(); j++){

                 if(nonDup.charAt(i)==str.charAt(j)) {

                     count++;
                 }
                 result=""+nonDup.charAt(i)+count;
             }

            System.out.print(result);
        }




    }
}
