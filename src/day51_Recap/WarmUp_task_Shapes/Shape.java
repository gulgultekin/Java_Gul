package day51_Recap.WarmUp_task_Shapes;
/*
warmup tasks:
    1. create an abstract class named Shape
            variables: name(static)
            abstract methods: calculateArea(), calculatePerimeter();
                    both methods return double
    2. create an interface named Volume
            variable: boolean hasVolume
            abstract method: calculateVolume() ==> returns double
    3. create an interface named PI
            variable: PI
            (created Volume & PI within same Java file)
    4. create a final class named circle that can inherit from Shape and PI
                variable: radius
                set a static block that initialize the name to "Circle"
                set a constructor that can initialize the radius
    5. create a final class named Cylinder that can inherit from Shape, Volume, and PI
                variables: radius, Height
                set a static block that initialize the name to "Circle"
                set a constructor that can initialize the radius and height
    6. create a class named ShapeObjects
                1. create two circle and two Cylinder' objects
                2. create an ArrayList that can contain  all those objects
    Note:   Volume of Cylinder = PI * radius * radius * height
            Area of Cylinder = (PI * 2* radius * radius) + (height * PI * 2* radius);
            Perimeter of Cylinder = 2 * (PI *2* radius + height)
            Area of Circle = PI * radius * radius
            Perimeter of Circle = 2 * radius * PI
 */

public abstract class Shape {

    public  String name;

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

}



interface Volume{

    boolean hasVolume = true;
    public abstract double calculateVolume();

}


interface PI{

    double PI = 3.14;

}









