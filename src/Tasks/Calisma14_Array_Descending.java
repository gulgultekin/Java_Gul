package Tasks;

import java.util.Arrays;

public class Calisma14_Array_Descending {
    public static void main(String[] args) {
        // print arrays in descending order

        int[] num={1,4,7,9,2,14};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        String result="[";
        for(int i=num.length-1; i>=0; i--){
            result+=(num[i]+", ");
        }
        System.out.println();
        System.out.println(result.substring(0,result.length()-2)+"]");

        System.out.println("*********************************");

        int[] num2={1,4,7,9,2,14};
        Arrays.sort(num2);
        int[] reverse =new int[num2.length];


       for(int i= 0; i<num2.length; i++){
           reverse[num2.length-1-i]=num[i];

       }
        System.out.println(Arrays.toString(reverse));

    }
}
