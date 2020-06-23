package day46_Final_Abstract.WarmUp_1_Pet;

public class Dog extends Pets{
    /*Task01:
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

    public Dog(String name,int age,String color,String breed,char gender){
        this.name = name;
        this.age = age;
        this.color =color;
        this.breed = breed;
        this.gender =gender;
    }
   @Override
    public void sleep(){
        System.out.println(name+" sleeping");
    }
    @Override
    public void eat(){
        System.out.println(name+" eating");
    }
    @Override
    public void speak(){
        System.out.println(name+" speaking");
    }
}
