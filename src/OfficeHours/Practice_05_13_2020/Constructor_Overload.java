package OfficeHours.Practice_05_13_2020;

public class Constructor_Overload {

    public Constructor_Overload(){
        System.out.println("Default constructor");

    }

    public Constructor_Overload(int a){
        System.out.println("Constructor with int parameter");

    }

    public Constructor_Overload(int a,double b){
        System.out.println("Constructor with int and double parameter");

    }

    public static void main(String[] args) {

        Constructor_Overload obj = new Constructor_Overload();
    }


}
