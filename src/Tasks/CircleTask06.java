package Tasks;

public class CircleTask06 {
    public static void main(String[] args) {
        /* write a program that can calculate the areas and perimeters of the circle based on the value of the radius, and print the result

		 assume that pi is equal to 3.14, and you only need to radius in order to calculate the area and perimeter, and print the result

        */

        double myRadius = 13;
        double myArea = myRadius*myRadius*3.14;
        System.out.println("The area of the circle is : "+ myArea +" cm.");

        double myPerimeter = 2*3.14*myRadius;
        System.out.println("The perimeter of the circle is : "+ myPerimeter + " cm.");



    }
}
