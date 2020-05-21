package day17_WhileLoops;

public class Finra {
    public static void main(String[] args) {
        /*
      	3. write a program which prints out the numbers from 1 to 30:
			1. for numbers which are divisible by 3, print "FIN" instead of the number.
			2. for numbers which are divisible by 5, print "RA" instead of the number
			3. for numbers which are a divisible by both 3 and 5, print "FINRA" instead of the number
		Ex:
			1 2 FIN 4 RA FIND .... FINDRA
       */



        for (int a = 1; a <= 30; a++) {

            if (a % 3 == 0 && a % 5 == 0) {// once bunu yazmamiz gerekiyor. yoksa digerinden biri bunu alir ve finra cikmaz
                System.out.println(a+" FINRA ");
            } else if (a % 5 == 0) {
                System.out.println(a+" RA ");
            } else if (a % 3 == 0 ) {
                System.out.print(a+" FIN ");
            }else{
                System.out.println(a);
            }
        }

        // diger cozum --- tek print statement ile

         String result3="";

        for (int a = 1; a <= 30; a++) {

            if (a % 3 == 0 && a % 5 == 0) {

                result3+="FINRA ";

            } else if (a % 3 == 0 ) {

                result3+="FIN ";

            }else if (a % 5 == 0) {

                result3+="RA ";

            }else{

                result3+=a+" ";
            }
          }
        System.out.println(result3);
      }





}
