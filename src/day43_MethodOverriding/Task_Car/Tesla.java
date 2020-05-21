package day43_MethodOverriding.Task_Car;

import day43_MethodOverriding.Task_Car.Car;

public class Tesla extends Car {

    protected void start (){ // Access modifier-> default,protected,public olabilir, cunku original default

        System.out.println("Push start button");

    }

}
