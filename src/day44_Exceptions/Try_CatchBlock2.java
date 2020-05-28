package day44_Exceptions;

public class Try_CatchBlock2 {

    public static void main(String[] args) {

        int[]arr ={1,2,3};

        try{
            System.out.println(arr[10]);
            System.out.println("try block");

        }catch(Exception e){
            System.out.println("Catch block");
        }


    }
}
