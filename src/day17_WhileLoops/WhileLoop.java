package day17_WhileLoops;

public class WhileLoop {
    public static void main(String[] args) {

        while(10>9){
            System.out.println("Hello World");
            break; // bunu koymazsak infinite kez print yapar
        }

        for(int i= 0; i<=5; i++){
    // initialization ; condition ;iterator
            System.out.println(i);
        }

        //for loopun while ile yazilisi

        int i=0;
        while(i<=5){
            //i++; buraya yazarsak 6 yi da print yapar cunku once arttiriyor
            System.out.println(i);
            i++;
        }






    }
}
