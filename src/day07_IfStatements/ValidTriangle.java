package day07_IfStatements;

public class ValidTriangle {
    public static void main(String[] args) {

        /*
        Warmup task:
    1. A triangle is valid if the sum of all the three angles is equal to 180 degrees.
    Write a program that declares three integers as angles and check whether a triangle is valid or not.
    */
        double angle1 = 100, angle2=30, angle3= 50;
        boolean valid = (angle1 +angle2 + angle3)==180;
        boolean nonvalid = (angle1 +angle2 + angle3)!=180;

        if (valid){
            System.out.println("it's a valid triangle");
        }
        if (nonvalid){
            System.out.println("invalid triangle");
        }

        //bu sekilde de yazilabilir

        short sumofAngles=(short)(angle1 + angle2 +angle3);
        if(sumofAngles==180){
        System.out.println ( "The shape is a triangle");
        }
        if(sumofAngles!=180){
        System.out.print ( "the shape is not a valid triangle");
        }


    }
}
