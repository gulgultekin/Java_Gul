package day44_Exceptions;

import java.util.NoSuchElementException;

public class Multi_CatchBlock {
    public static void main(String[] args) {

        try {
            System.out.println(100 / 0);

        }catch(ClassCastException e){
            System.out.println("Class Cast");

        }catch(NoSuchElementException e){
            System.out.println("No Such Element Exception");

        }catch(IndexOutOfBoundsException e){
            System.out.println("Index Out Of Bounds Exception");

        }catch(ArithmeticException e){
            System.out.println("Arithmetic exception");
     // compiler stop after this catch block. alttaki catch block never get executed
        }catch(RuntimeException e){ // bu da yakalar ama bir oncekinde problem yakalandi zaten
            System.out.println("Run time exception");


            // parent catch block must come after  child catch block, once gelirse compiler error verir

        }catch(Exception e){
            System.out.println("Exception");
        }


    }
}
