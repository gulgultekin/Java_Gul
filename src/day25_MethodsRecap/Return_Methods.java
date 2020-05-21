package day25_MethodsRecap;

public class Return_Methods {

    public static void main(String[] args) {
        System.out.println( max(10,9)); //10

        System.out.println( max2(12,19));
    }




    // a, b
    public static int max(int a, int b){

        int max = 0;

        if(a>=b){
            max = a;
        }else{
            max = b;
        }
        return max;
    }



    public static int max2(int a, int b){ // shortest way
      if(a >= b) {
          return a;
      }
          return b; // ustteki dogru olmazsa  bu yazilabilir

    }




}
