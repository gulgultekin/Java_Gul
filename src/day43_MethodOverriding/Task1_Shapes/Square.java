package day43_MethodOverriding.Task1_Shapes;

public class Square extends Shape {
/*
Area  &  Perimeter--> inherited

    calculateArea() & calculatePerimeter() --> inherited
 */
    public double side;

    public Square(double side){
        this.side =side;
    }

    public void calculateArea(){
        area=side*side;
       System.out.println("Area of the Square: "+area);
    }

    public void calculatePerimeter(){
        perimeter=4*side;
       System.out.println("Perimeter of the Square: "+perimeter);
    }
}
