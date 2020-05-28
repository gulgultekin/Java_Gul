package day44_Exceptions;

public class Practice2 {
     /*
    1. Write a method called "wait" that causes the current executing thread to sleep for the specific number of seconds
parameters: double seconds
     */

     public static void waits(double second){

         try {
             Thread.sleep((long)second*1000);//secondi miliseconda ceviriyor
         }catch(Exception e){ }
     }


     public static void main(String[] args) {

         System.out.println("Java");
         waits(3.5);
         System.out.println("Cybertek");


     }
}
