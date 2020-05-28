package day44_Exceptions;

public class ExceptionHandling {
    public static void main(String[] args) {

        String str = "Cybertek";

        try{
            System.out.println(str.charAt(100)); //unchecked exception


        }catch(RuntimeException e){

            String discription = e.getMessage();
            System.out.println(discription);//String index out of range: 100

        }

        System.out.println("***********************************");

        String result="";
        try{
            System.out.println(100/0);//unchecked Arithmetic exception
            System.out.println("Try block");

        }catch(Exception e){
             //ArithmeticException
            System.out.println("Catch block");

            result = e.getMessage();
            System.out.println(result); //   / by zero




        }

       // System.out.println(description); //local variable old icin block disinda cagirilamiyor(visible degil)
        System.out.println(result); // block disinda tanimladigimiz icin cagirabiliyoruz
        System.out.println("completed");








    }
}
