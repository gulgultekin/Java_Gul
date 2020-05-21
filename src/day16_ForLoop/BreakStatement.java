package day16_ForLoop;

public class BreakStatement {
    public static void main(String[] args) {

        for(int i=1; i<=5; i++){

            System.out.println("Hello World");
            break;// bunu yazinca 1 kere print yapip loop tan cikar
        }

        System.out.println("******************************");

        for(int a=1; a<=5; a++){ //a: 1, 2, 3, 4, 5

            if (a==3){ //iki kere print yapip looptan cikar
                break;
            }
            System.out.println("Hello ");



        }
        System.out.println("******************************");

        for(int b=1; b<=5; b++){

            System.out.println("hello Cybertek");

            if(b==3){
                break;
            }
            //if (a==3){ //bu if statementi sout tan sonra yazinca 3 kere print yapip looptan cikar
            //            //cunku print yaptiktan sonra a==3 oldugu icin break  oluyor


        }

        System.out.println("******************************");

        for(char i='a'; i<='z'; i++){

            System.out.println(i);

            if(i=='d'){  // d yi yazdiktan sonra looptan cikiyor
                break;  //sout'i if ten sonra yazsaydik c den sonra looptan cikacakti
            }
        }


    }
}
