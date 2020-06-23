package day50_Polymorphism.Task_3_Animal;
/*
2. create subclass of Animal named Cat
            variable: catName
            methods: scratch
 */
public final class Cat extends Animal{ // 3 variables--> name,age,gender
    //cat class final olunca methodu override tapilamaz ve dgistirileme
             // 3 instance method--> eat,sleep,scratch

    public String catName;

    public Cat(String catName,String gender,int age){
        this.catName = catName;
        this.gender =gender;
        this.age = age;
    }

    public void scratch(){
        System.out.println(catName+" is scratching");
    }

    @Override
    public void eat() {
        System.out.println(catName+" is eating");
    }

    @Override
    public void sleep() {
        System.out.println(catName+" is sleeping");
    }

    public String toString(){
        return catName+" "+age+" "+gender;
    }
}
