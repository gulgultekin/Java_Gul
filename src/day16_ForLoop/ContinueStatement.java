package day16_ForLoop;

public class ContinueStatement {
    public static void main(String[] args) {

        for(int i=1; i<=5; i++){ //i: 1, 2, 3, 4, 5

            if(i==3){
                continue; // i==3 olunca exit this iteration demek. 3 u skip yapacak, yazdirmayacak
            }
            System.out.println(i);

        }

        //if i souttan sonra yazarsak bir sonrakinde skip yapacak

        for(int i=0; i<=20; i++){

            if(i%2!=0){ // skips all the odd numbers
              continue;
          }
           /* if(i%2==0){   // skips all the even numbers
                continue;
            }
         */
            System.out.print(i+" ");


        }







    }
}
