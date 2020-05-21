package Tasks;

public class KgToPoundLitterToGallon {
    public static void main(String[] args) {

        //create a class called KgTopounds, and write a program that can convert Kg to pound and print the result

        double kg = 15;
        double pounds = kg*0.45;
        System.out.println(kg +" kg is equal to "+ pounds + " pound.");

        System.out.println("\n*************************");

        //create a class called LittersToGalons, and write a program that can convert litters to galons and print out the result

        double litter = 10;
        double gallon = litter/3.78;
        System.out.println(litter + " lt is equal to "+ gallon+ " gallon.");

        System.out.println("\n*************************");

        // create a class called PoundsToKg , and write a program that can convert pounds to kg

        double myPounds = 50;
        double myKg = myPounds/2.20;
        System.out.println(myPounds + " pounds is equal to "+ myKg + " kg.");

        System.out.println("\n*************************");

       // create a class called GalonsToLitters, and write a program that can convert the gallons to litters

        double myGalons = 44;
        double myLiter = myGalons * 3.78;

        System.out.println(myGalons + " gallons is equal to "+ myLiter + " lt.");


    }
}
