package day43_MethodOverriding.Task1_Shapes;

public class Circle extends Shape{
/*
Area  &  Perimeter--> inherited

    calculateArea() & calculatePerimeter() --> inherited
 */
    public double radius;
    public static double PI =3.14;

    public Circle(double radius){
        this.radius = radius;
    }



    public void calculateArea(){
        area = radius * radius * PI;
        System.out.println("Area of the Circle: "+area);
    }

    public void calculatePerimeter(){
        perimeter = radius * 2 * PI ;
        System.out.println("Perimeter of the Circle: "+perimeter);
    }
}
