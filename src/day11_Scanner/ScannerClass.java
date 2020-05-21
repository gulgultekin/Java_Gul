package day11_Scanner;
import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {

          Scanner input= new Scanner(System.in);
         // int a= 999999999999; too large for int
        System.out.println("Enter a long number : ");

        long a =input.nextLong();

        System.out.println("You have entered : "+a);


        System.out.println("Enter a decimal: ");
        float b= input.nextFloat();

        //long b= (long) input.nextFloat(); long<float old icin cast yaparak calisir
      //  double b= input.nextFloat(); buda calisir cunku double>float
        System.out.println("You entered : "+ b);


        System.out.println("enter true or false ");
        boolean bool = input.nextBoolean();

        System.out.println("You entered "+bool);


        System.out.println("enter your sentence: ");
        String str =input.next();

        System.out.println("You entered "+str); //sadece ilk kelimeyi print yapiyor

    }
}
