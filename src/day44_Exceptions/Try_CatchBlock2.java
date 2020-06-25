package day44_Exceptions;

public class Try_CatchBlock2 {

    public static void main(String[] args) {

        System.out.println("Hello");

        try{
            Thread.sleep(2000); //checked exception
           //try block handeled the exception
            System.out.println("Try block");

            // check exception catch blockta duzeliyor

        }catch(Exception e){
            //InterruptedException bu da yazilabilir

            System.out.println("Catch block");
        }finally{

        }

        System.out.println("World");
    }
}
