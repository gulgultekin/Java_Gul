package day50_Polymorphism;

import day50_Polymorphism.Task_3_Animal.Animal;
import day50_Polymorphism.Task_3_Animal.Cat;
import day50_Polymorphism.Task_3_Animal.Dog;

public class ReferenceTypeCasting {

    public static void main(String[] args) {

        int a= 100;
        double b= a;//implicit casting
        //double b = (double)a; demek aslinda ama boyle yazmaya gerek yok


        Dog dog = new Dog("A",1,"f");

        Animal animal1 = dog;  //upcasting --> implicitly done
          //  Animal animal1 = (Animal)dog;   yukardakiyle ayni ama boyle yazmaya gerek yok, automaticly done

        Cat cat = new Cat("R","f",7);
       // Dog dog2 = cat; there is no IS A  relation

        Animal animal2 =(Animal)cat; // upcasting, done by compiler implicitly

        System.out.println("****************************************************");

        double c = 10;
        int d = (int) c;  // explicit casting-->manually


        Animal animal3 = new Dog("D",2,"M");

        Dog dog3 = (Dog) animal3;  // downcasting--> MUST BE done manually



        Animal animal4 = new Cat("G","M",4);

        Cat cat2 = (Cat) animal4;


        System.out.println("=====================================================");


        Animal animal5 = new Dog("Lucy",5,"m");
        //animal5.bark();

        //bu sekilde de olur ama daha uzun bir yol
//        Dog dog2 = (Dog) animal5;
//        dog2.bark();

        //second way

        ((Dog)animal5).bark(); // downcasting





    }
}
