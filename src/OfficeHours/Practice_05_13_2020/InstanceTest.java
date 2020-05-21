package OfficeHours.Practice_05_13_2020;

import sun.security.jca.GetInstance;

public class InstanceTest {

    public static void main(String[] args) {

        Instances obj1 = new Instances();
        obj1.name="Muhtar";

        Instances obj2 = new Instances();
        obj2.name ="kuzzat";

        System.out.println(obj1.name); //muhtar
        System.out.println(obj2.name); //kuzzat

        obj1.printname(); // name is: Muhtar
        obj2.printname(); // name is: kuzzat



    }


}
class InstancesBlock{
    public static void main(String[] args) {
        Instances obj = new Instances();
        System.out.println(obj.name);

    }
}
