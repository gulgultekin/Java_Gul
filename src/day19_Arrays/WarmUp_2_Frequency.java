package day19_Arrays;

public class WarmUp_2_Frequency {
    public static void main(String[] args) {

  /* 2. write a program that can return the frequency of the characters ina string
        Ex: "AABCBCA" ==> "A3B2C2"

         */

        String str ="AABCBCAABC";//A4B3C3

        String removeDup =""; //ABC

        for(int i=0; i< str.length(); i++){

            if(!removeDup.contains(str.substring(i,i+1))){

                removeDup+=(str.substring(i,i+1));
            }
        }
        System.out.println(removeDup);

        String result=""; //ABC



        for(int j=0; j<removeDup.length(); j++){

            int count=0;

            for(int i=0; i < str.length() ; i++){

                if(str.substring(i,i+1).equals(removeDup.substring(j,j+1))){
                    count++;
                }
            }
            result+=removeDup.substring(j,j+1)+count;
        }

        System.out.println(result); //A4B3C3





    }
}
