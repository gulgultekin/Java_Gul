package day43_MethodOverriding.Task_Car;

public class BMW extends Car {

    void start(){// Access modifier-> default,protected,public olabilir, cunku original default

        System.out.println("Call some friends\nTell them to push\nRemove clutch peddle suddenly");
    }

}
