package day51_Recap.WarmUp_task_Shapes;

import java.util.ArrayList;
import java.util.Arrays;

/*
 6. create a class named ShapeObjects
                1. create two circle and two Cylinder' objects
                2. create an ArrayList that can contain  all those objects
 */
public class ShapeObject {

    public static void main(String[] args) {

        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(5);


        Cylinder cylinder1 = new Cylinder(3,5);
        Cylinder cylinder2 = new Cylinder(4,6);


        ArrayList<Shape>list = new ArrayList<>();
        list.addAll(Arrays.asList(circle1,circle2,cylinder1,cylinder2));

       /*  casting example
        Shape shape1 =(Shape) circle1; // upcasting
        Shape shape2 = new Cylinder(2,3);
        //shape.calculateVolume();  // calculateVolume methodu shape clasinda yok, cylinderde var, bu yuzden cast
        ((Cylinder) shape2).calculateVolume(); // yaparak cagirabiliriz

     */


       for(Shape eachShape: list){
           System.out.println(eachShape.name+" : "+eachShape.calculateArea());
       }


        System.out.println("******************************");
       // list.get(2).calculateVolume();  // reference type is Shape, shape does not have the calculateVolume method
       double d =  ((Cylinder) list.get(2)).calculateVolume();
        double e =  ((Cylinder) list.get(3)).calculateVolume();

        System.out.println(d); //first cylinder volume
        System.out.println(e);// second cylinder volume

         /*
        //list.get(1).calculateVolume(); // cicle ve cylinder arasinda IS A Relation yok
        ((Cylinder)list.get(1)).calculateVolume(); //ClassCastException veriyor --> o yuzden casting de ise yaramiyor

        */

         Shape s1 = new Circle(6);
          System.out.println( ((Circle) s1).radius ); //downcasting

    }


}
