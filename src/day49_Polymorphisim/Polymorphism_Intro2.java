package day49_Polymorphisim;

//muhtarin yaptigi

class Animal1 extends Robot1{

}

class Dog1 extends Animal1{

}

class Cat1 extends Animal1{

}

class Robot1{

}

public class Polymorphism_Intro2 {

    public static void main(String[] args) {

        // Animal1 obj = new Animal1();
        Animal1 obj2 = new Dog1();
        Animal1 obj3 = new Cat1();

        // Dog obj4 = new Cat();
        Dog1 obj5 = new Dog1();
        Cat1 obj6 = new Cat1();

        Robot1 obj7 = new Robot1();

        Animal1[] animalShow ={ obj5, obj6};


        Robot1 obj8 = new Animal1();
        Robot1 obj9 = new Dog1();
        Robot1 obj10 = new Cat1();

    }


}
