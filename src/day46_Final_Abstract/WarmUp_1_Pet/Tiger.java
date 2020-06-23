package day46_Final_Abstract.WarmUp_1_Pet;

public class Tiger extends Pets {

    public Tiger(String name,int age,String color,String breed,char gender){
        this.name = name;
        this.age = age;
        this.color =color;
        this.breed = breed;
        this.gender =gender;
    }

    public void sleep(){
        System.out.println(name+" sleeping");
    }
    public void eat(){
        System.out.println(name+" eating");
    }
    public void speak(){
        System.out.println(name+" speaking");
    }
}
