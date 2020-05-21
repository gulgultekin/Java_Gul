package Tasks;

import java.util.Scanner;

public class Calisma11_String_Replace {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter your first name");
        String firstName= scan.nextLine();

        firstName= firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();

        System.out.println("Please enter your last name");
        String lastName= scan.nextLine();

        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
        System.out.println(firstName+" "+lastName);

        //char ile

        firstName=(""+firstName.charAt(0)).toUpperCase()+firstName.substring(1).toLowerCase();
        lastName=(""+lastName.charAt(0)).toUpperCase()+lastName.substring(1).toLowerCase();

        System.out.println(firstName+" "+lastName);
    }
}
