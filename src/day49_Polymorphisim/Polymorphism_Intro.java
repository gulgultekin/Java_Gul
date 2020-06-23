package day49_Polymorphisim;


// benim yazdigim

//abstract class Animal{ //super class abstract olsa obje olusturulamaz ama dog classa reference olabilir
//
//}

interface Animal{

}
 class Dog implements Animal{ //abstract olsaydi obje olusturulamazdi

}

class Cat implements Animal{

}

class Robot{

}

public class Polymorphism_Intro {

    public static void main(String[] args) {

       // Animal obj = new Animal(); //Animal class abstract veya interface olsa  obje olusturulamaz

        Animal obj2 = new Dog(); //parent class referens to child class

        Animal obj3 = new Cat();

        //Dog obj4 = new Cat();

        Dog obj5 = new Dog();

        Cat obj6 = new Cat();

        Robot obj7 = new Robot();

       // String[] animalShow = {obj2,obj3,obj5,obj6}; String kabul eder sadece obje degil

        //Dog[] animalShow = {obj2,obj3,obj5,obj6}; //obj5 sadece bunu kabul etti--> dog

        Animal[] animalShow = {obj2,obj3,obj5,obj6}; //hepsini kabul ediyor

        //Animal[] animalShow2 = {obj7}; // no relation

    }
}
