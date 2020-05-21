package Tasks;

import java.util.Scanner;

public class Palindrome_Number{
    public static void main(String[] args) {



    /*(Palindrome number)
 Write a program that prompts the user to enter a three-digit integer and
 determines whether it is a palindrome number. A number is palin- drome
 if it reads the same from right to left and from left to right.
     */
    Scanner scan = new Scanner(System.in);
    int number = scan.nextInt();
    String str = String.valueOf(number);

    String reverse = "";
    for( int i = str.length()-1; i >=0;i--)

    {
        reverse = reverse + str.charAt(i);
    }


    System.out.println(reverse);
    boolean bool=reverse.equalsIgnoreCase(str);
        System.out.println(bool);


}
}

