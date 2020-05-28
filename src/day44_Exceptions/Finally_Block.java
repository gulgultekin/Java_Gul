package day44_Exceptions;

import java.util.NoSuchElementException;

public class Finally_Block {
    public static void main(String[] args) {

        try{
            System.out.println(9/0);
            System.out.println("Try block");

        }catch(Exception e){
            System.out.println("Catch block"); //

        }finally{
            System.out.println("finally"); //catch block and finally get executed
        }                       // problem catch olsa da olmasa da finally get executed



    }
}
