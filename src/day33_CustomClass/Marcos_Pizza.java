package day33_CustomClass;

public class Marcos_Pizza {
    public static void main(String[] args) {


        Pizza order1 = new Pizza();

        order1.customizeOrder("Large",1,1);


        order1.calcCost("Large",2,1);

        System.out.println(order1);



    }
}
