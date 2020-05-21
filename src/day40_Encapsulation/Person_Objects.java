package day40_Encapsulation;

public class Person_Objects {

    public static void main(String[] args) {

        Person obj = new Person("Gul");

        System.out.println(obj.name);
        obj.setSSN(12345678);
        obj.setID(10987);

        System.out.println(obj.name+"'s SSN: "+obj.getSSN());
        System.out.println(obj.name+"'s ID: "+obj.getID());

        obj.setSSNAndID(543,1234);
        System.out.println(obj.getSSN());
        System.out.println(obj.getID());


    }
}
