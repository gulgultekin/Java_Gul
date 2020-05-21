package Tasks;

import java.util.Scanner;

public class WarmUp_4_4_Saturday {
    public static void main(String[] args) {
        /*
        	1. write a program that can ask the user "enter a number" five times and return the maximum number
				hint: you will nedd for loop and if statement
				*/


        Scanner scan=new Scanner(System.in);

        int maxNum =0;

        for(int i=0; i<5;i++){
            System.out.println("Enter a number");
            int num=scan.nextInt();
            if(num>maxNum){
                maxNum =num;
            }
        }
        System.out.println("Maximum number is: "+maxNum);




        /*2. write a program that can ask the user "enter a number" five times and return the minimum number

         */
        int minNum=999999999;

        for(int i=0; i<5; i++){
            System.out.println("enter a number");
            int num2=scan.nextInt();
            if(num2<minNum){
                minNum=num2;
            }
        }
        System.out.println("Minimum number is :"+minNum);




	/*3. write a program that can ask the user to "enter a word" five times and returns the word that has the maximum length
         */
         scan.nextLine();

         String maxStr ="";

        for (int i=0; i < 5; i++){

            System.out.println("Enter a word:");
            String word = scan.nextLine();

            if (maxStr.length() < word.length()){
                maxStr= word;
            }
        }
        System.out.println(" The word has maximum length is: "+maxStr);



    }
}
