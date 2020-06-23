package Z_Java_Tekrar.Polymorphism;



class Animal{

    public void eat(){
        System.out.println("animal eating");
    }
    public  void drink(){
        System.out.println("animal drinking");
    }
    public static void methodA(){
        System.out.println("Animal");
    }

}

class Dog extends Animal{

    String name;
    public Dog(String name){
        this.name= name;
    }
    @Override
    public  void eat(){
        System.out.println("dog eating");
    }

    public  void eat(String food){
        System.out.println("Dog eating " + food);


    }

    public static void methodA(int a){
        System.out.println("Dog");
    }


//    public void drink(){
//        System.out.println("Dog drinking");
//    }
}






public class Polymorphism_intro {


    public static void main(String[] args) {
        Dog dog = new Dog("A");
       dog.eat();
       dog.eat("meat");
       dog.drink();
       dog.methodA();
        System.out.println(dog.name);

        System.out.println("*****************");

        Animal dog2 = new Dog("C");
         dog2.drink();
        dog2.eat();
        ((Dog)dog2).eat("banana");
        dog2.methodA();

        System.out.println(((Dog) dog2).name);
        if(dog2 instanceof Dog){
            System.out.println("it is a dog");
        }else {
            System.out.println("it is NOT a dog");
        }

        Animal animal = new Dog("F");
        boolean bool = animal instanceof Animal;
        boolean bool2 = animal instanceof Dog;
        System.out.println(bool);
        System.out.println(bool2);


    }
}
