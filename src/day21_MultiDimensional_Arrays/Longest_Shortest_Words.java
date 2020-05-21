package day21_MultiDimensional_Arrays;

public class Longest_Shortest_Words {
    public static void main(String[] args) {
        /*2. write a program that can return the logest string of text from an array
        3. write a program that can return the shortest string of text from an array
         */

        String[] words= {"Florida","Cybertek","School","PersonalInfo","Muhtar","Best","Gul","Abcdefghijkl"};

        int maxLengthString =words[0].length();
        int minLengthString =words[0].length();

        String longestword=words[0];
        String shortestWord =words[0];

        for(int i =0; i<words.length; i++){

            if(words[i].length() > maxLengthString){

                maxLengthString = words[i].length();
                longestword = words[i];
            }

            if(words[i].length()< minLengthString){
                minLengthString = words[i].length();
                shortestWord = words[i];
            }

        }
        System.out.println(longestword);
        System.out.println(shortestWord);




    }
}
