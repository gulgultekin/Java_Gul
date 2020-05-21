package Z_Java_Tekrar.Day22_Tekrar;

public class Nested_Loop {
    public static void main(String[] args) {
        char[][] arr2D ={{'A','B'},{'C','D','E'},{'F','J','H','I'}};

        for(int j =0; j<arr2D.length; j++){
            for(int i=0; i<arr2D[j].length; i++){

                System.out.print( arr2D[j][i]+" ");

            }
            System.out.println();
        }




    }
}
