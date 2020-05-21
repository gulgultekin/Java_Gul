package Tasks;

import java.util.Scanner;

public class Calisma09Strings_Concat_Lenght_LastCharac {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Please enter first and last names ");
        String firstName=scan.nextLine();
        String lastName=scan.nextLine();

        String fullName= firstName.concat(" "+lastName);// concat metoduyla sadece stringle string  eklenir

        int num= fullName.length();                    // + ile stringe another string or number or char eklenir
        System.out.println(fullName+ " contains "+ num+" characters");

        // last characteri print yapmak icin
        int lastIndexNum= fullName.length()-1;
        System.out.println("last character is: "+ fullName.charAt(lastIndexNum));


    }

}
