package Tasks;

import java.util.Scanner;

public class GallonsToLitters {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" Please enter a number : ");
        double myGallonValue = scan.nextDouble();

        // 1 gallon = 3.78lt

        double myLiterValue = 3.78 * myGallonValue;
        System.out.println( myGallonValue + " gallon = "+ myLiterValue+ " liter.");


    }
}
