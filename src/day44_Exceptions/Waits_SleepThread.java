package day44_Exceptions;

public class Waits_SleepThread {

    //thread.sleep--> executioni bekletiyor

    public static void main(String[] args) {

        System.out.println("Hello");
        waits(5);
        System.out.println("Cybertek");
        waits(2);
        System.out.println("Finished");



    }
    public static void waits(int second){

        try {
            Thread.sleep((long)second*1000);//secondi miliseconda ceviriyor
            System.out.println("try block");//try block printed
        }catch(Exception e){
            System.out.println("catch block");
        }
    }
    }

