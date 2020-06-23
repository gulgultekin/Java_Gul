package day50_Polymorphism;




public class Inheritance {

    public int publicInt = 100;   // same package or not can be inherited
    protected int protectedInt = 200; // same package or not can be inherited
    int defaultInt = 300;     // in same package  can be inherited
    private int privateInt = 400; // private is NOT inherited

}


class Data extends Inheritance{

    public static void main(String[] args) {

        Data obj = new Data();
        System.out.println(obj.publicInt);
        System.out.println(obj.protectedInt);
        System.out.println(obj.defaultInt);
        //System.out.println(obj.privateInt);  //hic bir classa inherit edilemez


    }

}