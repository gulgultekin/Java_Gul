package day46_Final_Abstract;

public final class Circle extends Shapes {//final keywordu ile circle baska bir classa inherit edilemez

    // abstract methodun regular classde olmasi icin methodun override olmasi gerekli


    public double radius;
    public final static double PI =3.14;

    public Circle(double radius){//abstract method regular classta olamaz
        this.radius =radius;      //sadece abstract methodu override yapabilirsin
    }

    @Override
    public  void Area(){//public,protected yada default access modifier olabilir
      //abstract classin sub clasi implementationdan sorumlu

       double area = radius * radius * PI;
        System.out.println("Area of the Circle: "+area);
  }



}
