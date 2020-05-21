package day35_Static;

import java.util.Scanner;

public class staticPractice {
    //when to use static variable instead of instance

    static Scanner scan = new Scanner(System.in);//ayri ayri yazmak yerine static olarak Scanneri disarda yaziyoruz

    public static void main(String[] args) { //static old icin sadece static scanner kabul ediyor
     //   Scanner scan = new Scanner(System.in);

        System.out.println("Enter num1 ");
        int num1 = scan.nextInt();

        System.out.println("Enter num2 ");
        int num2 = scan.nextInt();

        System.out.println("Sum is: "+(num1+num2));
        System.out.println("****************");
      //  method(); //asagidaki method static olmazsa burada direk cagiramiyoruz
          staticPractice obj = new staticPractice(); // obje olusturup cagirmamiz lazim
          obj.method();
    }

    public  void method(){
      //  Scanner scan = new Scanner(System.in);

        System.out.println("Enter num1 ");
        int num1 = scan.nextInt();

        System.out.println("Enter num2 ");
        int num2 = scan.nextInt();

        System.out.println("Multiplication is: "+(num1*num2));

    }





}
