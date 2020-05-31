package day45_Exception;

import java.io.IOException;
import java.util.NoSuchElementException;

public class Summary {

    public static void main(String[] args) {

       // Thread.sleep(3000);


        try {
            throw new IOException(); // checked exception


        } catch (IOException e) {
            System.out.println("catch block");
        }
        System.out.println("Hello");


        try {
            throw new ArrayIndexOutOfBoundsException();
        }catch(RuntimeException e){ //unchecked exception

        }
        System.out.println("Completed");


        try{
            throw new ClassNotFoundException();
        }catch(Exception e){

        }

        try{
            throw new NullPointerException();
        }catch(ArithmeticException a){
            System.out.println("Arithmetic exception");

        }catch(ClassCastException a){
            System.out.println("Class cast exception");

        }catch(NullPointerException a){
            System.out.println("Null pointer exception");// only this exection execute, handled olunca dudur
                   //parent exception CAN NOT COME before child exception

        }catch (RuntimeException a){
            System.out.println("Runtime");

        }catch(Exception a){
            System.out.println("Exception");

        }finally {
            System.out.println("Finally");//exception handled or not it will get executed
        }

    }
}
