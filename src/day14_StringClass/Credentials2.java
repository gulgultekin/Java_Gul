package day14_StringClass;

import java.util.Scanner;

public class Credentials2 {
    public static void main(String[] args) {
        /*
        valid credentials are:
        userName: cybertek
        password: cybertekschool

        precondition: username and password cannot be empty
                     if they are empty==> please enter the credentials

        if user entered both valid username and password==>log in
        if valid password, invalid username==>username is incorrect
        if valid username, invalid password==>password is incorrect
        if both invalid==> invalid username and password
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your username");

        String inputUsername = scan.next();

        System.out.println("Enter your password");

        String inputPassword=scan.next();

        boolean logedIn=inputUsername.equals("cybertek") && inputPassword.equals("cybertekschool");
              // user entered both valid username and password

        boolean invalidUserName=! inputUsername.equals("cybertek") && inputPassword.equals("cybertekschool");
              // user entered invalid username and valid password
        boolean invalidPassword =inputUsername.equals("cybertek") && !inputPassword.equals("cybertekschool");
              // username is valid, but password is invalid

        if( ! inputUsername.isEmpty() && !inputPassword.isEmpty()){ //username and password are not empty

            if(logedIn){
                System.out.println("Logged in");
            }else if(invalidUserName){
                System.out.println("Password is correct, username is incorrect");
            }else if(invalidPassword){
                System.out.println("username is correct, password is incorrect");

            }else{
                System.out.println("both username and password incorrect");
            }


        }else{ //username and password are  empty

            System.out.println("Please enter the credentials");

        }












    }
}
