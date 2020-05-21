package day24_Methods;

public class Custom {

    public static void main(String[] args) {

        printHelloCybertek(); // hello cybertek

    }



    public static void printHello(){

        System.out.println("Hello");
    }

    public static void printCybertek(){

        System.out.println("Cybertek");
    }

    public static void printHelloCybertek(){

        printHello(); //hello
        printCybertek();   //cybertek
    }






}
