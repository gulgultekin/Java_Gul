package day46_Final_Abstract;

public  class Triangle extends Shapes {

    double height;
    double base;

    public Triangle(double height, double base){
        this.height = height;
        this.base =base;
    }
   public void Area(){
        double area = height*base*0.5;

       System.out.println("Area of the Triangle: "+area);

   }


}
