package OfficeHours.Practice_05_20_2020;
/*
 Cat:
        variables:  name, age, color, size, breed, isPet, numberOfeyes
        methods: eat, sleep, drink, toString, scratch
        name;
     age; (inherited)
     color;(inherited)
     size; (inherited)
     breed; (inherited)

     static int numberOfEyes=2; (inherited)
     static boolean isPet = true; (inherited)

    scratch-->not inherited

 */
public class Cat extends Pet {

    public Cat(String name,int age,String color,String size,String breed){
        setInfo(name,age,color,size,breed);
    }

    public void scratch(){
        System.out.println(name+" is scratching");
    }

}
