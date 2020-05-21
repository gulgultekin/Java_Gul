package day11_Scanner;

import java.util.Scanner;

public class Nextline_Practice {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("How old are you?");
        int age = scan.nextInt();

        System.out.println("You are "+age+ "years old");

        scan.nextLine();// bu bir onceki enter i aliyor
        System.out.println("enter your full name");
        String name = scan.nextLine();

        System.out.println("Full name: "+name);
    }
}
