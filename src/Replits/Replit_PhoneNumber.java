package Replits;
import java.util.Scanner;
public class Replit_PhoneNumber {


    public static class Main {

        //YOUR CODE HERE
        public static void main(String[] args){
            Scanner input=new Scanner(System.in);

            System.out.println("please enter area code : ");
            int areaCode= input.nextInt();

            System.out.println("please enter local number: ");
            int localNumber =input.nextInt();
            String phoneNumber=("("+areaCode+")"+"-"+localNumber);
            System.out.println("Calling number " +phoneNumber);

        }


    }
}
