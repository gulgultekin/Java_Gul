package day51_Recap.WarmUp_task_Shapes;

/*
 5. create a final class named Cylinder that can inherit from Shape, Volume, and PI
                variables: radius, Height
                set a static block that initialize the name to "Circle"
                set a constructor that can initialize the radius and height
 */
public final class Cylinder extends Shape implements PI,Volume { // variable -->pi,name,hasVolume,radius,height

    double radius;
    // must be created as instance variables so that different Cylinder objects can have different copies of these two variables
    double height;




    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
         name = "Cylinder";
    }

    @Override
    public double calculateArea() {
        return (PI * 2* radius * radius) + (height * PI * 2* radius);
        //return (pi * 2 * radius * radius) + (height * pi * 2 * radius);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (PI *2* radius + height);
    }

    @Override
    public double calculateVolume() {
        return PI * radius * radius * height;
    }
}
