package day37_Constructors;

public class CarsObject {

    public static void main(String[] args) {

        Car car1 =new Car("Toyota","Prius",2019,15500);
        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.price);

        //yada
        System.out.println(car1);

        Car car2 =new Car("Honda","CRV",2017,19500);
        System.out.println(car2);








    }
}
