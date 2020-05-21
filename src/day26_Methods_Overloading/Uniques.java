package day26_Methods_Overloading;

public class Uniques {


    public static void main(String[] args) {
        String str ="ABBCDEFF";

        String result =""; //ACDE

        for(int i =0; i< str.length(); i++){

            int num = frequency(str,str.charAt(i));
            if(num == 1){
                result += str.charAt(i);
            }
        }
        System.out.println(result); // ACDE


        String str2 ="Cybertek";
        String result2 = uniques(str2);
        System.out.println(result2);  //Cybrtk

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
}
