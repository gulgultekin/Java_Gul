package day23_Methods;

public class BedTime_Task {
    /*
    warm up tasks:
    1. write a method called KmToMiles that can convert km to miles
                    1 km = 0.612 miles
    2. write a method called GalonsToLitters, that can convert gallons to litters
                   1 G = 3.75 L
                   */

    public static void main(String[] args) {

      KmToMiles(10);

      GalonsToLitters(5);

    }



    public static void KmToMiles(double km){

        System.out.println(km+" km: "+km*0.612+" miles");

    }

    public static void GalonsToLitters(double gal){

        System.out.println(gal+" gallon: "+gal*3.75+" litters");
    }
















}
