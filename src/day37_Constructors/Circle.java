package day37_Constructors;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Circle {
    /*
    Task02:
    Create a class called Circle
            instance variables:
                    radius, pi, diameter
            add a constructor that can initialize the radius of the circle
            instance methods:
                    area(): can return the area of the circle as double
                    perimeter(): can return the perimeter of the circle as double
                    toString(): returns the info of the circle
            Note: global value of PI is 3.14
                  diameter of circle = 2 * radius
                  area of circle = PI * r * r
                  perimeter = diameter*PI

     */

   // static double PI= 3.14; // burada da initialize yapilabilir yada
   static double PI;
    double radius;
    double diameter;

    static{
        PI =3.14;
    }
    public Circle(double radius){
        this.radius = radius;
        diameter = radius*2;
    }

    public double area(){

        return radius*radius*PI;
    }

    public double perimeter(){
        //diameter = 2*radius;
        double perimeter = diameter*PI;
        return perimeter;
    }

    public String toString(){
        DecimalFormat df =new DecimalFormat("0.00");
        return "radius: "+radius+" diameter: "+diameter+" area: "+area()+" perimeter: "+df.format(perimeter());
    }


}
class CircleObje{


    public static void main(String[] args) {
        DecimalFormat df =new DecimalFormat("0.00");
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double r = scan.nextDouble();

        Circle obje = new Circle(r);
        System.out.println(obje);
        System.out.println("Diameter: "+obje.diameter);
        System.out.println("Area: "+ obje.area());
        System.out.println("Perimeter: "+df.format(obje.perimeter()));

    }
}
