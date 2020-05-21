package day15_ForLoop;

import java.util.Scanner;

public class WarmUp_Initials {
    public static void main(String[] args) {
        /*
        	1. write a program that asks user's first and last name, then prints out the initials of the user
			Ex:
				input:
					cybertek
					batch12
				output:your initial is: CB
				*/

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your name");
        String fullName= scan.nextLine();

        //full name i first ve last name bolme
        String firstName= fullName.substring(0,fullName.indexOf(" "));
        String lastName= fullName.substring(fullName.indexOf(" ")+1);

        //first ve last namin ilk harfini buyuk, digerlerini kucuk yazdurma
        firstName= firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        lastName= lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

        System.out.println(firstName);
        System.out.println(lastName);

        //substring ile
        String initial=firstName.substring(0,1).toUpperCase()+lastName.substring(0,1).toUpperCase();
        System.out.println(initial.toUpperCase());

        //charAt ile
        String initials= ""+firstName.charAt(0)+lastName.charAt(0);
        System.out.println(initials.toUpperCase());




	/*2. Given :
			username: cybertek.batch17@gmail.com
			password: JavaBeauties
			write a program for the login functionality of the email.
				- username can be either in uppercase or lowercase
				- Password MUST be as it's
				- if the user name does not end with "@gmail.com":
						print "it's not a valid email"
				- if the username ends with "@gmail.com" but username or password does not match:
						print "invalid username or password"
						*/

	  String validUserName = "cybertek.batch17@gmail.com";
	  String validPassword ="JavaBeauties";

        System.out.println("enter userName");
        String inputUserName=scan.nextLine();

        System.out.println("enter password");
        String inputPassword=scan.nextLine();

        if(inputUserName.endsWith("@gmail.com")){
            if(inputUserName.equalsIgnoreCase("cybertek.batch17@gmail.com")&&inputPassword.equals("JavaBeauties")){

                System.out.println("Logged in");
            }else{
                System.out.println("invalid username or password");
            }


        }else{
            System.out.println("it's not a valid email");
        }







    }
}
