package day46_Final_Abstract;

import java.io.IOException;

public class Quiz {

    public static void main(String[] args)throws RuntimeException {
        //method(); //RuntimeException ile cozemeyiz, cunku checked exception
     //throws Exception ile cozulur
    }

    public static void method() throws IOException{
        throw new IOException();
    }


}
