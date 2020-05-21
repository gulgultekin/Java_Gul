package day09_NestedIf_Ternary;

public class IfStatement_WithoutCurlyBraces {
    public static void main(String[] args) {

        //odd or even numbers
        int number = 100;

        if(number %2==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }


        // yukaridaki nin aynisi but without { }

        //BUT DON'T USE-----NEVER

        if(number %2==0)
            System.out.println("Even number");// but only contain 1 statement

        else
            System.out.println("Odd number");



        if(number %2==0){
            System.out.println("Even number");
            System.out.println("hello");
            System.out.println("Cybertek");
        }
        else{
            System.out.println("Odd number");
            System.out.println("batch 18");
        }
        if(number %2==0)
            System.out.println("Even number");
            System.out.println("hello");  // without{} we can't give more than 1 statement

            System.out.println("Cybertek");
        // ustteki hata vermiyor ama else hata verir

       // else
            System.out.println("Odd number");
            //System.out.println("batch 18");


        if(number %2==0)
            System.out.println("Even number");
            System.out.println("hello");
            System.out.println("Cybertek");



    }
}
