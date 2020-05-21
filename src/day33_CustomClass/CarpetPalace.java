package day33_CustomClass;

public class CarpetPalace {
    public static void main(String[] args) {


    Carpet order =new Carpet();
    order.customOrder(2,5,100,true);

    order.calcCost();
        System.out.println(order);
}
}