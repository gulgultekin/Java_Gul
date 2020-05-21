package Tasks;

import java.util.Arrays;

public class Calisma14_Multi_DimensionalArray {
    public static void main(String[] args) {

        // n dimensional array contains multiple (n-1) dimensional arrays
                    //   0 1 2     0 1 2
        int[][] arr2D ={{1,2,3} , {4,5,6}};
                  //       0         1
        System.out.println(arr2D[0][1]); //2
        System.out.println(arr2D[0][2]); //3
        System.out.println(arr2D[1][0]); //4
        System.out.println(arr2D[1][2]); //6
        System.out.println(Arrays.toString(arr2D[0])); //[1, 2, 3]
        System.out.println(Arrays.toString(arr2D[1])); //[4, 5, 6]


        int[][] numbers2D = {{1,2},{3,4},{5,6}};
        System.out.println(Arrays.deepToString(numbers2D)); //[[1, 2], [3, 4], [5, 6]]



    }
}
