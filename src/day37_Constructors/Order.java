package day37_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class Order {
    /*
  create a class called Order
          create five objects of the pizza
          create an arraylist of pizza and add those 5 objects into it
          calculate the total price of the order (use for each loop)

   */
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("large",2,2);
        Pizza pizza2 = new Pizza("small",1,1);
        Pizza pizza3 = new Pizza("medium",2,1);
        Pizza pizza4 = new Pizza("large",3,1);
        Pizza pizza5 = new Pizza("small",1,2);

        ArrayList<Pizza>list= new ArrayList<>(Arrays.asList(pizza1,pizza2,pizza3,pizza4,pizza5));

        for(Pizza each: list){
            System.out.println(each.size+" "+each.calcCost());
        }




    }
}
