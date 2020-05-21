package day20_ArraysContinue;

import java.util.Arrays;

public class Reverse_Sort_Arrays_KolayYol {
    public static void main(String[] args) {

        int[] num={3,5,7,-2,9,33};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        int[] reverse =new int[num.length];

        for(int i=0; i<num.length; i++){

            reverse[num.length-1-i] = num[i];
        }
        System.out.println(Arrays.toString(reverse));


    }
}
