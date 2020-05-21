package day10_Switch_Scanner;

public class SwitchStatementPractice_2 {
    public static void main(String[] args) {

        int num= 0;
        switch(1){
            case 1:
                num+=3;
                break;
            case 2:
                num+=2;
                break;
            case 3:
                num +=10;
                break;
            default:
                num-=5;


        }
        System.out.println(num);

    }
}
