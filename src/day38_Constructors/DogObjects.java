package day38_Constructors;

public class DogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog();

        System.out.println(dog1.name); //unknown
        System.out.println(dog1.breed); // unknown
        System.out.println(dog1.age); // 0

        System.out.println("\n************DOG2*************\n");
        Dog dog2 = new Dog("Husky"); // execution depends on the which constructor used for object creation
        System.out.println(dog2.breed);
        System.out.println(dog2.name);
        System.out.println(dog2.age);

        System.out.println("\n************DOG3*************\n");

        Dog dog3 = new Dog("Poodle",4); // execution depends on the which constructor used
        System.out.println(dog3.breed);
        System.out.println(dog3.name);
        System.out.println(dog3.age);


        System.out.println(dog3);
        System.out.println(dog2);
        System.out.println(dog1);



    }
}
