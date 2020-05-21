package Z_Java_Tekrar.Methods_Practice;

public class String_Removes_Duplicates {

    public static void main(String[] args) {
        String str = removesDup("abbccddddefgh");
        System.out.println(str);

       String str1=  UniqueValue("abbccddddef");

        System.out.println(str1);



    }



    public static String removesDup(String str){

        String result ="";

        for(int i=0; i< str.length(); i++){

            if(! result.contains(str.substring(i,i+1))){
                result+=str.substring(i,i+1);
            }
        }
        return result;
    }

    public static String UniqueValue(String str){

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




}
