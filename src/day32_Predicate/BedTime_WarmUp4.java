package day32_Predicate;

import java.util.ArrayList;

public class BedTime_WarmUp4 {
    /*
    4. write a program that can extract the sepecial characters, digits and alphebets
    from a string and stores them into seperate ArrayLists of Character:
			ex:
				str = "ABCD123$%#@&456EFG!";
				list1: {$, %, #, @, &, !}
				list2: {A, B, C, D, E, F, G}
				list3: {1, 2, 3, 4, 5, 6}
     */
    public static void main(String[] args) {

        String str ="ABCD123$%#@&456EFG!";
        char[] arr = str.toCharArray();

        ArrayList<Character> characters = new ArrayList<>();
        ArrayList<Character> numbers = new ArrayList<>();
        ArrayList<Character> letters = new ArrayList<>();

        for(char each: arr){
            if(Character.isDigit(each)){
                numbers.add(each);
            }else if(Character.isAlphabetic(each)){
                letters.add(each);
            }else{
                characters.add(each);
            }
        }


        System.out.println(characters);
        System.out.println(letters);
        System.out.println(numbers);

    }
}
