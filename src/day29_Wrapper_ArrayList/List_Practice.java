package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_Practice {
    public static void main(String[] args) {

        //Grocery List

        ArrayList<String> shoppingList = new ArrayList<>();

        shoppingList.add("milk"); //size:1
        shoppingList.add("eggs"); //size:2
        shoppingList.add("coffee"); //size:3
        shoppingList.add("bread"); //size:4

        System.out.println(shoppingList); //[milk, eggs, coffee, bread]

//        System.out.println(shoppingList.get(0)); //milk
//        System.out.println(shoppingList.get(1)); //eggs
//        System.out.println(shoppingList.get(2)); //coffee
//        System.out.println(shoppingList.get(3)); //bread

        // yukaridaki gibi tek tek yazdirma yerine for loop ile hepsini yazdiriyoruz

        for(int i =0; i< shoppingList.size(); i++){
            // length() yerine size() kullanili

            System.out.println(shoppingList.get(i));
        }

        System.out.println("************************************");

        // for each loop ile

        for(String each: shoppingList){
            System.out.println(each);
        }


        //size():

        int size = shoppingList.size(); // 4
        System.out.println(size);

        int lastIndex = shoppingList.size() -1;
        System.out.println(lastIndex);



    }
}
