package day46_Final_Abstract.WarmUp_1_Pet;

public class Zoo {
    public static void main(String[] args) {

        Cat obj1 = new Cat("Cinnamon",6,"Brown-White","Calico",'F');

        System.out.println(obj1);
        obj1.eat();
        obj1.sleep();
        obj1.speak();

        Dog obj2 = new Dog("Karabas",3,"Black","Husky",'M');
        System.out.println(obj2);
        obj2.eat();

        Tiger obj3 = new Tiger("Stripe",1,"Brown","Tiger",'F');
        System.out.println(obj3);
    }
}
