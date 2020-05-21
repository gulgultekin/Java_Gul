package Z_Java_Tekrar.Day22_Tekrar;

public class NestedLoop_2 {
    public static void main(String[] args) {
        int[][] numbers={  {1,2},{3,4,5},{6,7,8,9}};

       // System.out.println(numbers[2][2]);
        int sum=0;
        for(int j=0; j<numbers.length;j++){
            for(int i=0;i<numbers[j].length; i++){
                sum+=numbers[j][i];
                System.out.print(numbers[j][i]+" ");// 1 2 3 4 5 6 7 8 9
            }
        }
        System.out.println();
        System.out.println("sum of : "+sum);


        // reverse
         for(int j=numbers.length-1; j>=0; j--){

             for(int i=0;i<numbers[j].length;i++){
                 System.out.print(numbers[j][i]+" "); // 6 7 8 9 3 4 5 1 2
             }
         }
        System.out.println();

      for(int j= numbers.length-1; j>=0; j--){
          for(int i= numbers[j].length-1; i>=0; i--){
              System.out.print(numbers[j][i]+" "); //9 8 7 6 5 4 3 2 1
          }
      }



    }
}
