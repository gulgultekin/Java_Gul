package day40_Encapsulation;

public class Quiz {

    //question 11

    public Quiz(){
        System.out.print("A");
    }

    public Quiz(int a){ //ACB
        this(2.5); //AC
        System.out.print("B");//B
    }

    public Quiz(double a){ //AC
        this(); //A
        System.out.print("C"); //C
    }

    public static void main(String[] args) {
        Quiz obj = new Quiz(100); //ACB

    }
}
