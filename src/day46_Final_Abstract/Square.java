package day46_Final_Abstract;

public final class Square extends Shapes {

    public double side;

    public Square(double side){
        this.side = side;
    }
   @Override
    public  void Area() { //overridden method--> less memory--> happy memory
        //1 method different implementation for each different shape
      double area = side * side;
       System.out.println("Area of the Square: "+area);
    }

    //public  void calculatePerimeter();
   //      perimeter=4*side;
   //      System.out.println("Perimeter of the Square: "+perimeter);

}
