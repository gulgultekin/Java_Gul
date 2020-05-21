package day10_Switch_Scanner;

public class localVariables {
    public static void main(String[] args) {
        int a= 0;//this is local variable
              // declared within the block
             // it can only be used in this block { }
       if(true) {

           System.out.println(a);
             int b=10;
       }
      //  System.out.println(b); hata verir


        switch(3){
            case 1:
                int c= 100;
            case 2:
               // System.out.println(c); // the local variable c belongs to case 1 block
        }




    }
}
