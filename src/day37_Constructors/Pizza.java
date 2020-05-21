package day37_Constructors;

public class Pizza {
    /*
    1. create a custom class for pizza that should contain the following:
                instance variables:
                        size (either small, medium, large)
                        number of cheese topping
                        number of pepperoni toppings
                Add a constructor that can allow user to set the size and toppisngs of the pizza
                instance method:
                        calcCost(): returns the total cost as double
                        toString(): a String return method that's containing the pizza' size, quantity of each topping,
                        and the pizza cost as calculated by calcCost()
                Pizza cost is determined by:
                        Small: $10 + $1.5 per pepperoni topping + 1 per cheese topping
                        Medium: $12 + $1.5 per pepperoni topping + 1 per cheese topping
                        Large: $14 + $1.5 per pepperoni topping + 1 per cheese topping
    create a class called Order
            create five objects of the pizza
            create an arraylist of pizza and add those 5 objects into it
            calculate the total price of the order (use for each loop)

     */

    String size;
    int cheeseTopping;
    int pepTopping;
    double calcCost=0;

    public Pizza(String size,int cheeseTopping,int pepTopping){
        this.size =size;
        this.cheeseTopping =cheeseTopping;
        this.pepTopping = pepTopping;
    }
     public double calcCost(){
         if (size.equalsIgnoreCase("small")) {

             calcCost +=10+(1.5*pepTopping)+cheeseTopping;

         }else if(size.equalsIgnoreCase( "medium")){
             calcCost +=12+(1.5*pepTopping)+cheeseTopping;

         }else if(size.equalsIgnoreCase( "large")){
             calcCost += 14+(1.5*pepTopping)+cheeseTopping;
         }
        return calcCost;
     }

     public String toString(){
        return size+" size pizza with "+pepTopping+" pepperoni topping and "+cheeseTopping+" cheese topping"+" Total cost: "+calcCost();
     }
}
