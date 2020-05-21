package day41_Inheritance;

public class Fish extends Animal {
    /*
     public String name;              // Bunlarin hepsi Animaldan inherit edildi
    public String size;
    public double weight;


    public void eat(){
        System.out.println(name+" is eating");
    }

    public void move(){
        System.out.println(name+" is moving");
    }
     */


    public void swim(){ // bu sadece Fish e ait old icin burada ayrica method olusturduk
        System.out.println(name +" is swimming");
    }


    public static void main(String[] args) {

             Fish fish1 = new Fish();
             fish1.name = "Nemo";
             fish1.size ="small";
             fish1.weight = 1;

        System.out.println(fish1.name);
        System.out.println(fish1.size);
        System.out.println(fish1.weight);

        fish1.eat();
        fish1.move();
        fish1.swim();
        //fish1.bark();




    }
}
