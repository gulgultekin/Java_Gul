package Z_Java_Tekrar.Day22_Tekrar;

public class NestedLoop_Practice_2 {
    public static void main(String[] args) {
        int[][] numbers = { {1,2,3},
                {4,5,6,7,8,9},
                {10,11,12,13,14},
                {15,16,17,18,19,20,21,22,23}
        };
        // 1. print all even numbers in a same line
        // 2. count odd numbers==> return the total odd number
         int countOdd=0;
         int countEven=0;

        for(int j=0; j<numbers.length; j++){
            for(int i=0; i<numbers[j].length; i++){

                if(numbers[j][i]%2==0){
                    countEven++;
                    System.out.print( numbers[j][i]+" ");
                }else{
                    countOdd++;
                  //  System.out.print("Odd numbers :"+ numbers[j][i]+" ");
                }
            }
        }
        System.out.println();
        System.out.println("even num : "+countEven);
        System.out.println("odd num : "+countOdd);





    }
}
