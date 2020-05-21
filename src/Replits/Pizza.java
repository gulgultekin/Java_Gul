package Replits;

public class Pizza {
    /*
    Create a class named Pizza that stores information about a single pizza.
It should contain the following:
Private instance variables to store the size of the pizza (either small, medium, or large),
 the number of cheese toppings, the number of pepperoni toppings, and the number of ham toppings.
    Constructor(s) that set all of the instance variables.
Public methods to get and set the instance variables.
A public method named calcCost( ) that returns a double that is the cost of the pizza.
Pizza cost is determined by:
Small: $10 + $2 per topping
Medium: $12 + $2 per topping
Large: $14 + $2 per topping
A public method named getDescription() that returns a String containing the pizza size,
quantity of each topping, and the pizza cost as calculated by calcCost().
getDescription() example:
large Pizza with 0 Cheese toppings, 0 Pepperoni toppings, and 2 Ham toppings.
Total Price: 18.0
     */

    private String size;
    private int numCheeseTop;
    private int pepTop;
    private int hamTop;


    public Pizza(String size,int numCheeseTop,int pepTop,int hamTop){
        this.size = size;
        this.numCheeseTop =numCheeseTop;
        this.pepTop = pepTop;
        this.hamTop =hamTop;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getNumCheeseTop() {
        return numCheeseTop;
    }

    public void setNumCheeseTop(int numCheeseTop) {
        this.numCheeseTop = numCheeseTop;
    }

    public int getPepTop() {
        return pepTop;
    }

    public void setPepTop(int pepTop) {
        this.pepTop = pepTop;
    }

    public int getHamTop() {
        return hamTop;
    }

    public void setHamTop(int hamTop) {
        this.hamTop = hamTop;
    }
/*
Pizza cost is determined by:
Small: $10 + $2 per topping
Medium: $12 + $2 per topping
Large: $14 + $2 per topping
 */
    public double calcCost(){
        double calcCost=0;
        if (size.equalsIgnoreCase("small")) {

            calcCost +=10+(2*pepTop)+(2*numCheeseTop)+(2*hamTop);

        }else if(size.equalsIgnoreCase( "medium")){
            calcCost +=12+(2*pepTop)+(2*numCheeseTop)+(2*hamTop);

        }else if(size.equalsIgnoreCase( "large")){
            calcCost += 14+(2*pepTop)+(2*numCheeseTop)+(2*hamTop);
        }
        return calcCost;
    }
    /*
    A public method named getDescription() that returns a String containing the pizza size,
quantity of each topping, and the pizza cost as calculated by calcCost().
getDescription() example:
large Pizza with 0 Cheese toppings, 0 Pepperoni toppings, and 2 Ham toppings.
Total Price: 18.0
     */
    public String getDescription(){
       return size+" Pizza with "+numCheeseTop+" Cheese toppings, " +pepTop+" Pepperoni toppings, and "
               +hamTop+" Ham toppings.\n"+"Total Price: "+calcCost();
    }
}

class Order{
    public static void main(String[] args) {


    Pizza piz = new Pizza("large",1,1,1);
        System.out.println(piz.getDescription());
       // System.out.println(piz.calcCost());


    }
}
