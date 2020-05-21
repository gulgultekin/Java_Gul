package day34_CustomClass;

public class Dog {

    String breed;
    String size;
    int age;
    String color;
    String name;

    public void eating(String food){
        System.out.println(name+" is eating "+food);
    }

    public void drinking(String drink){
        System.out.println(name+ " is drinking "+drink);
    }

    public void playing(String toy){
        System.out.println(name+" is playing "+toy);
    }

    public void studying(String subject){
        System.out.println(name+" is studying "+subject);
    }


    public void setDogInfo(String breed,String size, int age,String color,String name){

        this.breed = breed; //parameterla instance variable ayni isimde olursa this.keyworduyle initialize etmemiz gerekiyor
        this.size = size;  // cunku instance variable yerine local variable olani aliyor. (methodun icindekini)
        this.age =age;
        this.color = color;
        this.name = name;
      // this keyword is used for calling object instance variables

    }

    public String toString(){

        return "Dog Name : "+name+", breed is: "+breed+", size: "+size+", color: "+color+", age: "+age;
    }






}
