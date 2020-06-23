package day51_Recap.WarmUp_task_Shapes;
/*
4. create a final class named circle that can inherit from Shape and PI
                variable: radius
                set a static block that initialize the name to "Circle"
                set a constructor that can initialize the radius
 */
public final class Circle extends Shape implements PI { //3 variable--> PI, name, radius

    public double radius;

     //sadece 1 copy need o yuzden static blockta yapiyoruz, (butun isim circle olacagi icin)


// use static block to initialize name variable because we only need one copy (same name) for all Circle objects

    public Circle(double radius){
        this.radius =radius;
        name = "circle";
    }


    @Override
    public double calculateArea() {
        return radius * radius * PI;
    }

    @Override
    public double calculatePerimeter() {
        return  2 * radius * PI;
    }
}
