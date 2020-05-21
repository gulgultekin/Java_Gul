package day37_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
    /*
    create a class called ShoppingList
            create 5 objects of Item and store them into List of Items
            calculate the total cost of all Items in the list
     */

    public static void main(String[] args) {

        Item item1 = new Item("Biber",1,3);
        Item item2 = new Item("Domates",0.5,6);
        Item item3 = new Item("Yumurta",0.8,10);
        Item item4 = new Item("ekmek",3,2);
        Item item5 = new Item("Cay",6,1);



        ArrayList<Item>list =new ArrayList<>(Arrays.asList(item1,item2,item3,item4,item5));
        double totalCost =0;
        for(Item each: list){
            totalCost+= each.calcCost();
        }
        System.out.println("Total cost: $"+ totalCost);

        //For Loop ile
//        for(int i=0; i< list.size();i++){
//         totalCost+= list.get(i).calcCost();
//        }
//
//        System.out.println("Total: $"+totalCost);
    }
}
