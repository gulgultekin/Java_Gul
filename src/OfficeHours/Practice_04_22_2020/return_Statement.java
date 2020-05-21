package OfficeHours.Practice_04_22_2020;

public class return_Statement {

    public static void main(String[] args) {
        method1();
        System.out.println("hello batch 18");// bu print eder.
        // cunku return statement only exit current method, it will not effect the main method
    }


    public static void method1(){
        if(10>9){
           return; // it exit the current method1
        }
           // System.exit(0);// butun sistemi kapatiyor. main method da print yapmiyor

        System.out.println("Hello"); //It will not printed
    }







}
