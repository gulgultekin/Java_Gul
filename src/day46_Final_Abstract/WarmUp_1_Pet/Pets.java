package day46_Final_Abstract.WarmUp_1_Pet;

public abstract class Pets {
    /*
    Task01:
		1. creaet an abstract class called Pets
				attributes: name, age, color, breed, gender
				methods:
					abstract methods: sleep, eat, speak
					instance method: toString
		2. create three sub classes (non-abstract) of pet:
								1. Dog
								2. Cat
								3. Tiger
				each class MUST have constructors to initialize the attributes

     */


    String name;
    int age;
    String color;
    String breed;
    char gender;

    public abstract void sleep();
    public abstract void eat();
    public abstract void speak();

    public String toString(){
        return "Name: "+name+", age: "+age+", color: "+color+", breed: "+breed+", gender: "+gender;
    }




}
