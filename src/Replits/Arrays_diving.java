package Replits;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_diving {
    /*
    In the sport of diving, seven judges award a score between 0 and 10, where each score may be a floating-point value.
The highest and lowest scores are thrown out, and the remaining scores are added together.
The sum is then multiplied by the degree of difficulty for that dive.
The degree of difficulty ranges from 1.2 to 3.8 points. The total is then multiplied by 0.6 to determine the divers score.
Use System.out.printf("Total: %.2f",total); in order to get rid of extra floating points.
output: Enter score for judge 1:
input: 1
output: Enter score for judge 2:
input: 5
output: Enter score for judge 3:
input: 5
output: Enter score for judge 4:
input: 5
output: Enter score for judge 5:
input: 5
output: Enter score for judge 6:
input: 8
output: Enter score for judge 7:
input: 9
output: Enter difficulty:
input: 2.1
output: Total: 35.28
     */
    public static void main(String[] args) {
        //WRITE YOUR CODES HERE
        Scanner scan = new Scanner(System.in);


        float[]score = new float[7];

        for(int i=0; i<8;i++){
            System.out.println("Enter score");
            score[i]=scan.nextFloat();
        }

        System.out.println("Enter difficulty level");
        float difficulty = scan.nextFloat();

        Arrays.sort(score);
        float min= score[0];
        float max= score[score.length-1];
        float result= 0.0f;

        for(int i=1; i< score.length-1; i++){
            result+=score[i];
        }

        result*=difficulty;
        result*=0.6;

        System.out.printf("Total: %.2f", result);


        // FINAL OUTPUT
      //  System.out.printf("Total: %.2f", total);
    }
}
