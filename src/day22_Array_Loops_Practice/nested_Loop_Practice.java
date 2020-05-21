package day22_Array_Loops_Practice;

public class nested_Loop_Practice {
    public static void main(String[] args) {

        int[][] numbers = { {1,2,3},
                            {4,5,6,7,8,9},
                            {10,11,12,13,14},
                            {15,16,17,18,19,20}
                          };
        // 1. print all even numbers in a same line
        // 2. count odd numbers==> return the total odd number


        int oddCount =0;

        for(int j = 0; j<numbers.length; j++){


            for(int i = 0; i< numbers[j].length; i++){
               int num =  numbers[j][i];
               if(num%2 ==0){
                   System.out.print( num +" ");
               }else{
                   oddCount++;
               }
            }

        }
        System.out.println();

        System.out.println("All odd numbers: "+ oddCount);









    }
}
