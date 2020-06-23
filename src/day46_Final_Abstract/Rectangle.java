package day46_Final_Abstract;

public  class Rectangle extends Shapes {

    double length;
    double width;

    public Rectangle(double length,double width){
        this.length =length;
        this.width = width;
    }

    @Override
    public void Area(){

        double area = length*width;

        System.out.println("Area of the Rectangle: "+area);
    }
}
