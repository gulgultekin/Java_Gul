package Replits;

import java.util.Scanner;

public class Cat_Dogs_086 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();

        for(int i= 0; i< word.length()-2; i++){

            if(word.substring(i,i+3).contains("cat")){
                countOfCats++;

            }else if(word.substring(i,i+3).contains("dog")){
                countOfDogs++;
            }
        }
        //System.out.println("countOfCats: "+countOfCats);
       // System.out.println("countOfDogs: "+ countOfDogs);

        if(countOfCats == countOfDogs){
            System.out.println("true");

        }else if(countOfCats != countOfDogs){
            System.out.println("false");

        }



    }
    }

