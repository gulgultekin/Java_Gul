package day43_MethodOverriding.Task_Car;

public class CarShop {

    public static void main(String[] args) {

        Tesla tesla = new Tesla();
        tesla.start();

        System.out.println("***********Honda**********");

        Honda honda = new Honda();
        honda.start();


        System.out.println("***********Jeep**********");

        Jeep jeep = new Jeep();
        jeep.start();

        System.out.println("***********BMW**********");

        BMW bmw = new BMW();
        bmw.start();

    }

}
