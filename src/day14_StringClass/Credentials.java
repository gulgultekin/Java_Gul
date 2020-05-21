package day14_StringClass;

import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {
         /*
        userName: cybertek
        passWord:cybertekschool
         */

        String validUserName = "cybertek";
        String validPassWord ="cybertekschool";

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your username");

        String inputUsername = scan.next();

        System.out.println("Enter your password");

        String inputPassword=scan.next();

        boolean validCredentials =inputUsername.equals(validUserName)&& inputPassword.equals(validPassWord);
        if(validCredentials){
            System.out.println("Log in succesfully");
        }else{
            System.out.println("Invalid credentials");
        }


    }
}
