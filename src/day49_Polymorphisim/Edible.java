package day49_Polymorphisim;
/*
Task01:
    1. create an interface named Edible
            abstract method: eat();
    2. create an interface named Drinkable that can inherit from Edible
            abstract method: drink();
    3. create an class named Burger that can inherit from Edible
            variables: name, size
            method: toString();
            create a constructor that can initialize instance variables
    4. create another class called IceCoffee  that can inherit from Drinkable
                variable: size
                method: toString()
            create constructor that can set the size
    fix any error might come up

 */
public interface Edible {

    public abstract void eat();
}


interface Drinkable extends Edible{

    void drink();
}

class Burger implements Edible{

    String name;
    String size;

    public Burger(String name,String size){

        this.name = name;
        this.size = size;
    }

    @Override
    public void eat() {

    }

    public String toString(){

        return "Name: "+name+", size: "+size;
    }
}
// 4. create another class called IceCoffee  that can inherit from Drinkable
//                variable: size
//                method: toString()
//            create constructor that can set the size

class IceCoffee implements Drinkable{

    String size;

    public IceCoffee(String size){
        this.size = size;
    }

    public String toString(){
        return size+" size Ice coffee";
    }

    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void drink() {
        System.out.println("I drink "+size+" ice coffee");
    }
}

class Cafe{
    public static void main(String[] args) {

        Burger obj2 = new Burger("Hamburger","Large");
        obj2.eat();
        System.out.println(obj2);

    IceCoffee obj1 = new IceCoffee("small");
    obj1.drink();
        System.out.println(obj1);
}
}