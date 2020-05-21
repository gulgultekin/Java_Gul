package Tasks;

import java.util.Scanner;

public class Calisma12_Stringmanipulation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter your first name and last name");
        String fullName=scan.nextLine();

        String firstName=fullName.substring(0,(fullName.indexOf(" ")+1));
        String lastname=fullName.substring(fullName.indexOf(" ")+1);

        firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        lastname=lastname.substring(0,1).toUpperCase()+lastname.substring(1).toLowerCase();
        System.out.println(firstName);
        System.out.println(lastname);
        String initials=firstName.substring(0,1).toUpperCase()+"."+lastname.substring(0,1).toUpperCase();

        System.out.println(initials);
    }
}
