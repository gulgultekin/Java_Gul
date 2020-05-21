package day11_Scanner;

import java.util.Scanner;

public class NextLine {
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);

            System.out.println("Enter the full name: ");
            String fullname = scan.nextLine();

            System.out.println(fullname);

            System.out.println("Enter your sentence");
            String sentence = scan.nextLine();

            System.out.println("You entered: "+sentence);

        }
}
