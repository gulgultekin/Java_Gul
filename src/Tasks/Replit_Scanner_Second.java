package Tasks;

import java.util.Scanner;

public class Replit_Scanner_Second {
    public static void main(String[] args) {
        //YOUR CODE HERE:
        Scanner input=new Scanner(System.in);

        System.out.println("Enter seconds:");

        int inputSecond = input.nextInt();

        // 1 min==60 second
        // 1 hour== minute*60
        int resultMinute=(inputSecond/60);
        int resultHour=(resultMinute/60);
        int remainderMinutes = resultMinute % 60;
        int resultSecond=(inputSecond%60);
        System.out.println(resultHour+" hour, "+remainderMinutes+" minute, "+resultSecond +" second ");



    }
}

