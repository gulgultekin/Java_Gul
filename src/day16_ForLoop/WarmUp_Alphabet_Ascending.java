package day16_ForLoop;

public class WarmUp_Alphabet_Ascending {
    public static void main(String[] args) {
        /*
        5. Write a program that will print out all letters in English alphabet in ascending order
	6. Write a program that will print out all letters in English alphabet in descedning order
         */
        //ascending order --ascii table ile yapiliyor

        for(char ch='A'; ch<='Z'; ch++){
            System.out.print(ch+" ");
        }
        System.out.println();

        //backword--descending
        for (char ch='Z'; ch>='A'; ch--){
            System.out.print(ch+" ");
        }
        System.out.println();

        //lower case
        for(char ch ='a'; ch<='z'; ch++){
            System.out.print(ch+ " ");
        }



    }
}
