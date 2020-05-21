package day43_MethodOverriding.Task_Car;

import day43_MethodOverriding.Task_Car.Car;

public class Jeep extends Car {

    public void start(){ // Access modifier-> default,protected,public olabilir, cunku original default

        System.out.println("Call mechanic");
        System.out.println("Oil change");
        System.out.println("Jump start");
    }
}
