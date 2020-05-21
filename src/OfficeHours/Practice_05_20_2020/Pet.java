package OfficeHours.Practice_05_20_2020;
/*
 custom class: Cat, Dog, Bunny
    Dog:
        variables:  name, age, color, size, breed, isPet, numberOfeyes
        methods: eat, sleep, drink, toString, bark
    Cat:
        variables:  name, age, color, size, breed, isPet, numberOfeyes
        methods: eat, sleep, drink, toString, scratch
    Bunny:
        variables:  name, age, color, size, breed, isPet, numberOfeyes
        methods: eat, sleep, drink, toString, Dig
    custom class: pet
            variables:  name, age, color, size, breed, isPet, numberOfeyes
            methods:    eat, sleep, drink, toString

 */
public class Pet {

    protected String name;
    protected int age;
    protected String color;
    protected String size;
    protected String breed;

    protected static boolean isPet = true;
    protected static int numberOfEyes=2;


    public  void eat(String food){
        System.out.println(name+" is eating "+food);
    }

    public void sleep(String place){
        System.out.println(name+" is sleeping at "+place);
    }

    public void drink(String drink){
        System.out.println(name+" is drinking "+drink);
    }

    public void setInfo(String name,int age,String color,String size,String breed){
        this.name = name;
        this.age = age;
        this.color = color;
        this.size = size;
        this.breed = breed;
        // constructor inherit edilmediginden setInfo methodu ya
    }

    public String toString(){
        return "Name: "+name+", age: "+age+", color: "+color+", size: "+size+", breed: "+breed;
    }

}
