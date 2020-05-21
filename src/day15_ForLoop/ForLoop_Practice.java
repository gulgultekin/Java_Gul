package day15_ForLoop;

public class ForLoop_Practice {

    public static void main(String[] args) {

        /*
        odd number between 1~100 in a single line seperated by a space
         */

        for(int i=1; i<=100; i+=2){
            System.out.print(i+" ");
        }
        System.out.println();

        //even numbers

        String resultEven="";
        for(int num=0; num<=100;num+=2){
            //System.out.print(num+" ");
            resultEven+=num+" ";
        }
        System.out.println(resultEven);
    }
}
