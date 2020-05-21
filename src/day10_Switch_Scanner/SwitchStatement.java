package day10_Switch_Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        byte a1=4;
        float a2 =2.3f; // bunu kullanamiyoruz
        double a3= 4.44d;//bunu kullanamiyoruz
        boolean a4= true;//bunu kullanamiyoruz
        long a5= 444l;// bunu kullanamiyoruz


        switch(a1){
            case 1:
                System.out.println("One");
                break;

            case 2:
                System.out.println("Two");
                break;

            default:
                System.out.println("Invalid case");
                break;

            case 3:
                System.out.println("Three");
                break;

            case 4:
                System.out.println("Four");
                break;




        }



    }
}
