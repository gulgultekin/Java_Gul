package day50_Polymorphism.Task_3_Animal;
/*
3. create subclass of Animal named Dog
            variable: dogName
            methods: bark
 */
public final class Dog extends Animal { // 3 variables--> name,age,gender
                     // 3 instance method--> eat,sleep,barking
   public String dogName;

   public Dog(String dogName,int age,String gender){

       this.dogName = dogName;
       this.gender =gender;
       this.age = age;
   }

   public void bark(){
       System.out.println("Dog "+dogName+ " is barking");
   }

    @Override
    public void eat() {
        System.out.println("Dog "+dogName+" is eating");
    }

    @Override
    public void sleep() {

        System.out.println(dogName+" is sleeping");
    }

    public static void methodA(int a){ // overloaded methodA
        System.out.println("Dog class A");
    }



}
