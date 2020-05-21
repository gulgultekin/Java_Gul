package day43_MethodOverriding.Task1_Shapes;

public class ShapeObject {

    public static void main(String[] args) {

        Circle circle1 = new Circle(3);

        System.out.println(circle1.radius);

        circle1.calculateArea();
        circle1.calculatePerimeter();
       // ((Shape)circle1).calculateArea();


        System.out.println("\n**********RECTANGLE**************\n");

        Rectangle rec1 = new Rectangle(3,2);
        System.out.println(rec1.length);
        System.out.println(rec1.width);

        rec1.calculateArea();
        rec1.calculatePerimeter();


        System.out.println("\n**********Square**************\n");

        Square sq1 = new Square(4);
        System.out.println(sq1.side);

        sq1.calculateArea();
        sq1.calculatePerimeter();
    }

}
