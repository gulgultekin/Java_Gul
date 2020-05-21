package Z_Java_Tekrar.Methods_Practice;

public class Longest_String_Array {

    public static void main(String[] args) {
        String[] names = {"ayse", "gul","aaaaaaaaa"};

      String longname = longestWord(names);
        System.out.println(longname);
    }



    public static String longestWord ( String[] arr){

        String longWord ="";
        int max=0;
        for(int i=0; i < arr.length; i++){

            if(arr[i].length() > max){
                max=arr[i].length();
                longWord = arr[i];
            }
        }
          return longWord;

    }
}
