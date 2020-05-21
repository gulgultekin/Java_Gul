package day41_Inheritance;

public class AudioBook extends Book {
    /*
 public String title;                      inherited
    public String author;
    public double price;
     public String toString(){
       return "Title: "+title+" Author: "+author+" Price: $"+price;
   }
 */

    public String length;
    String narrator;

    public void listen(){
        System.out.println("I'm listening "+title);
    }

//    public static void main(String[] args) {
//
//        AudioBook abook1 = new AudioBook();
//        abook1.title = "Becoming";
//        abook1.author = "Michelle Obama";
//        abook1.price = 30;
//
//        abook1.length="19 hours and 3 minutes";
//        abook1.narrator ="Gul";
//
//        System.out.println(abook1.title+" is "+abook1.length+" hour length and narrated by: "+abook1.narrator);
//        System.out.println(abook1);
//
//    }
}
