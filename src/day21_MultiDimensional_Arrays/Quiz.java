package day21_MultiDimensional_Arrays;

import java.util.Arrays;

public class Quiz {
    public static void main(String[] args) {

        int wd =0; // -1+1+2+2-1
        String[] days ={"sun","mon","wed","sat"};

        for(int i=0; i<days.length; i++){

            switch(days[i]){
                case "sat":
                case "sun":
                    wd-=1;
                    break;

                case "mon":
                    wd++;
                case "wed":
                    wd+=2;
            }
        }

        System.out.println("********************************");


        System.out.println(wd);

        int[] num1 = new int[3]; // [0,0,0];
        int[] num2 = {1,2,3,4,5}; // size=5

        num1 = num2; // num1={1,2,3,4,5};

        System.out.println(Arrays.toString(num1));
    }
}
