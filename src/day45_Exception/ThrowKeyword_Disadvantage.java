package day45_Exception;

import java.io.IOException;

public class ThrowKeyword_Disadvantage {

    public static void method1()throws IOException,  Exception{ //order-->child than parent exception,
                             // birden fazla exception yazilabiliyor
        Thread.sleep(2000);
    }

    public static void main(String[] args)throws Exception {
        method1();
        //throws Exception hem methodda hem de cagirildigi yerde yazmamiz gerekiyor
        //method bir yerde cagirilmayacaksa throw yazilabilir.
        // ama call yapilinca exception call yapilan yere gidiyor ve orada handled edilmeli
    }
}
