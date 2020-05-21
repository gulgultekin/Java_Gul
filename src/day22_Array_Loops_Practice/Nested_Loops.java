package day22_Array_Loops_Practice;

public class Nested_Loops {
    public static void main(String[] args) {
               //  i --->  0   1    0    1   2     0  1    2    3
        char[][] arr2D ={{'A','B'},{'C','D','E'},{'F','J','H','I'}};
        //          J-->    0            1             2
        // each index in arr2D Must be single dimensional array


       // arr2D[0]==>{'A','B'}

        for(int i=0; i< arr2D[0].length; i++){
            System.out.println(arr2D[0][i]);//A  B
        }


        // arr2D[1]==>{'C','D','E'}

        for(int i=0; i< arr2D[1].length; i++){
            System.out.println(arr2D[1][i]);// C   D  E
        }


        // arr2D[2]==>{'F,'J','H','I'}

        for(int i=0; i< arr2D[2].length; i++){
            System.out.println(arr2D[2][i]);// F  J   H   I
        }

        System.out.println("++++++++++++++++++++++++++++++++++++++");


        // Nested Loop i                        //       j   i
        // j-->index number of  1 D array          arr2D[0][0]
        // i--> index number of element            arr2D[0][1]

        for(int j=0; j<arr2D.length; j++){

            for(int i=0; i< arr2D[j].length; i++){
                System.out.println(arr2D[j][i]);//A  B  C   D   E   F  J  H  I
            }

        }




    }
}
