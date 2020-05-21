package day43_MethodOverriding.Task1_Shapes;

public class Rectangle extends Shape {
    /*
    Area  &  Perimeter--> inherited

    calculateArea() & calculatePerimeter() --> inherited
     */
    public double length;
    public double width;

    public Rectangle(double length,double width){
        this.length =length;
        this.width = width;
    }

    public void calculateArea(){
        area = width * length;
        System.out.println("Area of the Rectangle: "+area);
    }
   @Override
    public void calculatePerimeter(){
        perimeter = (length+width) * 2;
        System.out.println("Perimeter of the Rectangle: "+perimeter);
    }

}
