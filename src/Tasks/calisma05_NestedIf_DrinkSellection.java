package Tasks;

public class calisma05_NestedIf_DrinkSellection {
    public static void main(String[] args) {
     /*
     drink sellection
     drink type --1-hot or 2-cold
     hot--1-tea $2   2-coffe--$4
     cold--icedtea $3.2   lemonade  $3.5
      */

        int typeSellection = 2;
        int drinkSellection =2;

        String drink=" ";
        double price=0;

        if(typeSellection==1) {
            System.out.println("Hot Drinks: 1-Tea, 2-Coffee");
            if (drinkSellection == 1) {
                drink = "tea";
                price = 2.0;

            } else if (drinkSellection == 2) {
                drink = "coffee";
                price = 4.0;

            } else {
                System.out.println("Invalid hot drink sellection");
            }
        }
        else if(typeSellection==2){
                System.out.println("Cold Drinks: 1- IcedTea, 2-Lemonade");
                if(drinkSellection==1) {
                    drink = "Iced tea";
                    price = 3.2;
                }
                else if(drinkSellection==2){
                    drink="Lemonade";
                    price=3.5;
                }
                else{
                    System.out.println("Invalid cold drink sellection");
                }
            }
        else{
            System.out.println("Invalid drink sellection");
        }
        System.out.println("Your total for  "+ drink + " is: $"+price);

    }
}
