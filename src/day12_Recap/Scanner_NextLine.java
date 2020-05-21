package day12_Recap;

import java.util.Scanner;

public class Scanner_NextLine {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your age");
        int num = scan.nextInt();


        scan.nextLine(); // used for taking out the "Enter"

        System.out.println("Enter your name");
        String name = scan.nextLine();

        System.out.println(name +" "+num);

    }
}
