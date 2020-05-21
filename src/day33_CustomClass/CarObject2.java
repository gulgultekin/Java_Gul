package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObject2 {
    /*
       create 5 car object
       put them in an array of cars
       use for loop to get each car info
       use for each loop to get each car info
        */
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setCarInfo("BMW","X5",2020,"Black");
    // tek tek herbiri icin yapilacak islemi car clasinda yeni bir method olusturup buradan cagiriyoruz.
        // setcarInfo ya ozellileri verip,ve her bir arabanin ozellikleri yaziliyor
      //  car1.getCarInfo();

        Car car2 = new Car();
        car2.setCarInfo("Nissan","Pathfinder",2020,"Gray");


        Car car3 = new Car();
        car3.setCarInfo("Honda","CRV",2020,"Brown");


        Car car4 = new Car();
        car4.setCarInfo("Toyota","Prius",2020,"Blue");


        Car car5 = new Car();
        car5.setCarInfo("Tesla","XL",2020,"Black");



        Car[] cars = {car1,car2,car3,car4,car5};

        for(int i=0; i<cars.length; i++){
            cars[i].getCarInfo();
        }


        System.out.println("***********for each loop ile********************");


        for(Car eachCar:cars){
            eachCar.getCarInfo();
        }

        System.out.println("===========================");
        System.out.println(car1);  //  bunu print yapmak icin toString  methodu olusturduk ve onu cagirdik
                                 // toString methodu yazmasaydik hashcode cikiyor


    }
}
