package Replits;

import java.util.Scanner;

public class Replit_QuizQuestions {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("what is the farthest planet in the solar system:" );
        System.out.println("a)venus" );
        System.out.println("b)pluto" );
        System.out.println("c)neptune" );

        //your code here

        String answer = s.nextLine();


        if(answer.equals("a")){
            System.out.println(answer+" is wrong");
        }else if(answer.equals("b")){
            System.out.println(answer+" is correct");
        }else if(answer.equals("c")){
            System.out.println(answer+" is wrong");
        }else{
            System.out.println(answer+" is not a valid answer");
        }




    }
}
