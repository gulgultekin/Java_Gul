package day50_Polymorphism.Task_3_Animal;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog obj1 = new Dog("Lucy",5,"Female");

        System.out.println(obj1.dogName);
        obj1.bark();



       Animal obj2 = new Dog("Kito",6,"Female");

       // System.out.println(obj2.dogName); // direk boyle yazinca hata veriyor
        //obj2.bark(); //hata
        //reference type decides what is accessible

        obj2.eat();  // hata vermiyor cunku animal classinin methodu, referanci animal
        obj2.sleep();  // dog classinda bu eat ve sleep override olmasaydi sonuc-->Animal is eating, seklinde cikardi

        obj2.methodA();

        Animal animal1 = new Cat("A","F",1);

        boolean isDog = animal1 instanceof Dog;
        boolean isCat = animal1 instanceof Cat;

        System.out.println(isDog); //False
        System.out.println(isCat); //true


       // Dog d1 = new Dog("B",1,"f");
        // boolean r1 = d1 instanceof Cat;// d1 --> dog, reference -->cat
        //there is no relation with cat and dog


        Animal d2 = new Dog("B",1,"f");

        boolean r1 = d2 instanceof Cat; // Cat is a relation with animal


        Animal animal2 = new Cat("Q","f",2);

        boolean r2 = animal2 instanceof  Animal; // true--> animal is animal old icin true veriyor

        System.out.println(r2);



        Cat animal3 = new Cat("y","m",9);

        boolean  r3 = animal3 instanceof Animal;

        System.out.println(r3); //true


        Animal animal4 = new Cat("P","f",2);

        boolean r4 = animal4 instanceof  Dog; // false--> dog ile cat arasinda relation yok

        System.out.println(r4);










    }
}
