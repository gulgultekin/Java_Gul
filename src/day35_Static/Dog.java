package day35_Static;

public class Dog {

    String breed;
   static boolean isPet;


    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.breed = "husky";
        dog1.isPet =true;


        Dog dog2 = new Dog();
        dog2.breed ="poddle";


        System.out.println(dog1.breed); // husky
        System.out.println(dog2.breed); // poddle

        // static String breed; yazinca ikiside poddle oldu

        System.out.println(dog1.isPet);
        System.out.println(dog2.isPet); // initialize etmedigimiz halde static old icin  dog2.isPet de true oldu
    }
}
