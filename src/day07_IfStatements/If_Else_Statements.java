package day07_IfStatements;

public class If_Else_Statements {
     // Only Two posibilities
    public static void main(String[] args) {

        int number = 10;
       /* if(number>0){
            System.out.println(number+ " The number is positive");
        }
       if (number<0){
            System.out.println(number + " is negative");
            }

        */
       // yukardakinin yerine if & else kullanilir. cunku sadece 2 posibilities var

        if(number>0){
            System.out.println(number+ " The number is positive number");
        }

        else{
            System.out.println(number + " is negative number");
        }



        int num = 101;
        if(num%2==0){
            System.out.println(num + " is even number"); // if statement true ise bu print yapilir
        }
        else{ //otherwise
            System.out.println(num + " is odd number");// yukaridaki if statement yanlissa bu else block print edilir
        }


        // Alcohol alma yasi hesaplamasi
        int age = 18;
        if(age>=21){
            System.out.println("Here is your vodka");
        }
        else{
            System.out.println("Go home kid!!!");
        }


        // Corona testing solution

        boolean testedPositiveForCorona = false;
        if(testedPositiveForCorona){
            System.out.println("Go To Hospital!!");
        } else{
            System.out.println("Stay at home and do more coding");
        }
    }
}
