package OfficeHours.Practice_05_20_2020;

public class House {
    public static void main(String[] args) {
     //house has a dog
        Dog dog1 = new Dog("Karabas",5,"black","large","Husky");

        System.out.println(dog1);
        dog1.bark();
        dog1.drink("water");
        System.out.println("Dog is a pet: "+dog1.isPet);

        //  dog1.setInfo("Karabas",5,"black","large","Husky");
        Dog dog2 = new Dog("Rindik", 5, "White", "Huge","Kangal");

        System.out.println(dog2);



        System.out.println("\n***********CAT*********************\n");

        Cat cat1 =new Cat("Muffin",7,"white","medium","Ragdoll");

        System.out.println(cat1);
        cat1.scratch();
        cat1.eat("fish");
        System.out.println("Cat is a pet: "+cat1.isPet);



        System.out.println("\n***********BUNNY*********************\n");

        Bunny bunny1 = new Bunny("Pamuk",1,"white","small","Holland lop");

        System.out.println(bunny1);
        bunny1.dig();
        bunny1.sleep("bed");
        System.out.println("Bunny is a pet: "+bunny1.isPet);
    }
}
