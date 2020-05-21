package OfficeHours.Practice_05_20_2020;

public class Dog extends Pet {
/*
 Dog:
        variables:  name, age, color, size, breed, isPet, numberOfeyes
        methods: eat, sleep, drink, toString, bark

     name; (inherited)
     age; (inherited)
     color; (inherited)
     size; (inherited)
     breed; (inherited)

     static int numberOfEyes=2; (inherited)
     static boolean isPet = true; (inherited)

    bark --> not inherited

 */

public Dog(String name,int age,String color,String size,String breed){
    setInfo(name,age,color,size,breed);
}
    public void bark(){
        System.out.println(name+ " is barking");
    }
}
