package day37_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class Item {
    /*
    Task04:
    create a class called Item
            instance variables:
                name, unitPrice, quantity
            add a constructor that can initialize the fields
            instance methods:
                calcCost(): returns the total cost as double
                            hint: quantity * unitPrice
                toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
    create a class called ShoppingList
            create 5 objects of Item and store them into List of Items
            calculate the total cost of all Items in the list

     */

    String name;
    double unitPrice;
    int quantity;

    public Item(String name,double unitPrice,int quantity){
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double calcCost(){
        return quantity * unitPrice;

    }

    public String tostring(){
        return "Name: "+name+" unit price: $"+" quantity: "+quantity+" total cost: $"+calcCost();
    }
}



//
//class ShoppingList2{
//    public static void main(String[] args) {
//
//        Item item1 = new Item("Biber",1,3);
//        Item item2 = new Item("Domates",0.5,6);
//        Item item3 = new Item("Yumurta",0.8,10);
//        Item item4 = new Item("ekmek",3,2);
//        Item item5 = new Item("Cay",6,1);
//
//        ArrayList<Item> list =new ArrayList<>(Arrays_Pract.asList(item1,item2,item3,item4,item5));
//        for(Item each: list){
//            System.out.println(each.name+" "+each.calcCost());
//        }
//
//
//    }
//}