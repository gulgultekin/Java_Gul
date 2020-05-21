package day33_CustomClass;

public class Pizza {
    /*
    1. create a custom class for pizza that should contain the following:
				instance variables:
					  	size (either small, medium, large)
					  	number of cheese topping
					  	number of pepperoni toppings
				instance method:
						customizeOrder(): allows user to set the size and toppisngs of the pizza
						calcCost(): returns the total cost as double
						toString(): a String return method that's containing the pizza' size, quantity of each topping,
						and the pizza cost as calculated by calcCost()
				Pizza cost is determined by:
						Small: $10 + $1.5 per pepperoni topping + 1 per cheese topping
						Medium: $12 + $1.5 per pepperoni topping + 1 per cheese topping
						Large: $14 + $1.5 per pepperoni topping + 1 per cheese topping
     */

    String size;
    int cheeseTopping;
    int pepTopping;
    double cost =0;
    public void customizeOrder(String pizzaSize,int pizzaCheeseTop,int pizzaPepTop){
        size = pizzaSize;
        cheeseTopping = pizzaCheeseTop;
        pepTopping = pizzaPepTop;

        System.out.println("Your order : "+size+" size pizza with "+cheeseTopping+" cheese topping and "+pepTopping+" peperoni topping");

    }
    public void calcCost(String pizzaSize,int pizzaCheeseTop,int pizzaPepTop){

        size = pizzaSize;
        cheeseTopping = pizzaCheeseTop;
        pepTopping = pizzaPepTop;

        if (size == "Small") {

            cost+=10+(1.5*pepTopping)+(1*cheeseTopping);
        }
        else if(size=="Medium"){
            cost+=12+(1.5*pepTopping)+(1*cheeseTopping);
        }
        else{
            cost+=14+(1.5*pepTopping)+(1*cheeseTopping);
        }

        System.out.println("Your total cost: $"+cost);
    }

    public String toString(){

        String result="You ordered : "+size+" size pizza with "+cheeseTopping+" cheese topping and "+pepTopping
                +" pepperoni topping.\nYour total cost is : $"+cost;

        return result;
    }


}
