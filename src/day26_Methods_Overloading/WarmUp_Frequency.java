package day26_Methods_Overloading;

public class WarmUp_Frequency {
    /*
    Warmup tasks:
    1. write a return method called frequency that accepts two parameters: string str and char ch,
        the method returns the frequency of the ch from the str as an int
            Ex:
                frequency("AAA", 'A') ==>  3
                frequency("ABAB", 'B') ==> 2
            Note: MUST use Arrays_Pract and for each loop
    2. use the above method to create another called uniques that accepts a string paramter and returns
    it's unique characters as String
            Ex: uniques("ABBC");      ==> "AC"
                uniques("Cybertek");      ==> "cybrtk"

     */

    public static void main(String[] args) {

        int result = frequency("ABCAC" ,'A');
        System.out.println(result);

        String str = uniques("aabbcdeeff");
        System.out.println(str);

    }



    public static int frequency(String str, char ch){
         // str="ABCAC"   ch= 'A'
        char[] arr = str.toCharArray(); // {'A','B','C','A','C'}
        int count=0;
        for(char each: arr){
            if(each==ch ){
                count++;
            }
        }
        return count;

    }


    public static String uniques(String str){

        String result ="";
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




}
