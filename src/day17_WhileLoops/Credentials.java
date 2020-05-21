package day17_WhileLoops;

import java.util.Scanner;

public class Credentials {

    public static void main(String[] args) {


        /*Write a program that asks user to enter his/her username and password until user enters correctly.
        user: cybertek
        pass: cybertek123
         */

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter user name");
        String userName = scan.next();

        System.out.println("Enter pass word");
        String password = scan.next();

    /*   while(!(userName.equals("cybertek") && password.equals("cybertek123"))){ //it should be one group

            System.out.println("Please re enter your credential");

            System.out.println("Enter user name");
             userName = scan.next();

            System.out.println("Enter pass word");
             password = scan.next();


        }
        System.out.println("Logged in");
*/
         // boolean ile


        boolean valid=(userName.equals("cybertek") && password.equals("cybertek123"));
               //validating first username and password

        int count=1;

        while(!valid){

            System.out.println("Please re enter your credential");

            System.out.println("Enter user name");
            userName = scan.next();

            System.out.println("Enter pass word");
            password = scan.next();

            valid=((userName.equals("cybertek") && password.equals("cybertek123")));
            //ustteki boolean dan farkli -->validating new username and password

            count++;

            if(count==3 && !valid){ //already have three attempts and credentials are still incorrect

                System.out.println("Your account is locked");
                break;
            }
            //if(valid){
            //            System.out.println("Logged in");
            // buraya yazarsak ilk attempte dogru yazilirsa "logged in" print  yapmiyor

            }
        if(valid){
            System.out.println("Logged in"); //loop disinda olmasi gerekiyor


        }



        }








    }


