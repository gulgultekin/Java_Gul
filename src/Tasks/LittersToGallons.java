package Tasks;

import java.util.Scanner;
//create a class called LittersToGalons, and write a program that can convert litters to galons and print out the result

public class LittersToGallons {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a number : ");

        double myLiter= scan.nextDouble();

        // 1 gallon = 3.78 lt

        double gallon = myLiter / 3.78;
        System.out.println( myLiter +" lt = "+ gallon + " gallon.");



    }
}
