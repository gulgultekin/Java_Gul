package OfficeHours.Practice_05_20_2020;
/*
Bunny:
        variables:  name, age, color, size, breed, isPet, numberOfeyes
        methods: eat, sleep, drink, toString, Dig

     age; (inherited)
     color;(inherited)
     size; (inherited)
     breed; (inherited)

     static int numberOfEyes=2; (inherited)
     static boolean isPet = true; (inherited)

        Dig-->not inherited
 */
public class Bunny extends Pet{

    public Bunny(String name,int age,String color,String size,String breed){
        setInfo(name,age,color,size,breed);
    }

    public void dig(){
        System.out.println(name+" is digging");
    }

}
