package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CatObjects {

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.setCatInfo("Calico","brown-white",6,"Cinnamon");

        Cat cat2 = new Cat();
        cat2.setCatInfo("Ragdoll","white",7,"Muffin");

        Cat cat3 = new Cat();
        cat3.setCatInfo("Ragdoll","white-brown",8,"Brownie");

        ArrayList<Cat> catList = new ArrayList<>();
        catList.addAll(Arrays.asList(cat1,cat2,cat3));

        for(int i=0; i<catList.size(); i++){
            System.out.println(catList.get(i));
        }

        System.out.println("\n**********functions-sleep****************\n");

        cat1.sleep();
        cat2.sleep();
        cat3.sleep();

        System.out.println("\n**********functions-eat******************\n");

        cat1.eat("cat treats");
        cat2.eat("fish");
        cat3.eat("liver");

        System.out.println("\n**********functions-drink******************\n");

        cat1.drink("water");
        cat2.drink("milk");
        cat3.drink("coffee");

        System.out.println("\n*****for each loop ile*******************\n");

        for(Cat each: catList){
            System.out.println(each);
        }


      /*
      create a custom class for bank account
      attributes--> accountholder,accountnumber,balance
      actions--> checkingBalance(), withDraw(int  amount ),deposit(int amount)

     */



    }


}
