package day21_MultiDimensional_Arrays;

public class Longest_Shortest_String_KOlayYOL {
    public static void main(String[] args) {

         /*2. write a program that can return the logest string of text from an array
        3. write a program that can return the shortest string of text from an array
         */

            String[] words= {"Florida","Cybertek","School","PersonalInfo","Muhtar","Best","Gul","Abcdefghijkl"};

            String longestword="";
            String shortestword="";

            int maxLenght=0;
            int minLenght=9999999;//Integer.MAX_VALUE;

            for(int i =0; i<words.length; i++){

                if(words[i].length() > maxLenght){
                    maxLenght = words[i].length();
                    longestword =words[i];
                }
                if(words[i].length() < minLenght){
                    minLenght = words[i].length();
                    shortestword =words[i];
                }

            }

            System.out.println(longestword);
            System.out.println(shortestword);

        }
    }

