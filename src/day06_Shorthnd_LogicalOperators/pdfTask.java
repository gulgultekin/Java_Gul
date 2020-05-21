package day06_Shorthnd_LogicalOperators;

public class pdfTask {
    public static void main(String[] args) {

        int ApplesCounts = 20;
        int OrangesCounts =30;
        int PearsCounts = 30;

        boolean comp = ApplesCounts< OrangesCounts || OrangesCounts>=PearsCounts;

        System.out.println(comp); //true


        String OutsideWeather;
        int Degree;
        OutsideWeather = "Shinny ";
        Degree = 70;
        boolean comp2 = (!(OutsideWeather == "Rainy "|| Degree ==70));

        System.out.println(comp2); //false


        int b = 2;
        boolean res = ++b ==2 || --b ==2 && --b ==2;
                  // 3 == 2 || 1 ==2 && 1 ==2
                  // false ||false &&  false
        System.out.println(res); //false


        boolean x = true, z = true;
        int y = 20;
        x =(y!=10)|| (z= false);
        // true  || false ==> true
        System.out.println(x); // true

        /*
        1.Create a double variable with the value 20
        2.Create a second variable of type double with the value 80
        3.Add both numbers up and multiply by 25
        4.Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
        5.Print remaining total (#4)  is equal to 20 or less : true/false
         */
        double d1 =20;
        double d2 = 80;
        double result1 =(d1++ + d2++) * 25%3/40;
                     // (20 + 80) // 100 *25 %3 /40
                                   // 2500 %3  /40
                                    //1/40== 0.025
        System.out.println(result1);

        boolean result2 = result1 %4<=20;
                        // 0.025 %4
        System.out.println(result2);


        //Declare a variable and initialize user age.
        // 2)Then the program will show if the user is eligible to vote.
        // A Person who is eligible to vote must be older than or equal to 18 years old.
        // Input: age :18
        // Output: You are eligible to vote


        byte  userAge = 28;
        byte voteAge =18;

        if(userAge>=voteAge){
            System.out.println("You are eligible to vote");
        }
        if (userAge< voteAge){
            System.out.println("You are not eligible to vote");
        }


        /*
        Write Java program that will accept three numbers and return the greatest number.
        •Input:number1: 4
        number2: 8
        number3: 1

        •Output:The greatest number is: 8
         */
        int num1 = 4;
        int num2 = 8;
        int num3 = 1;
        int greatestNumber =0;
        if(num1>num2 && num2>num3){
           // System.out.println("the greatest number is :" + num1);
            greatestNumber=num1;
        }
        if(num2>num1 && num1>num3){
            //System.out.println("the greatest number is :" + num2);
            greatestNumber= num2;
        }
        if(num3>num2 && num2>num1){
           // System.out.println("the greatest number is :" + num3);
            greatestNumber= num3;
        }
        System.out.println("The greatest number is :" + greatestNumber);
        System.out.println("The gratest number between " + num1 +","+ num2+","+ num3+ " is : "+ greatestNumber);

        System.out.println("\n *************\n");

        /*
        1.  Write a Java program that will accept two numbers
        and check if two numbers are equal or not.
         */
        int number1= 10;
        int number2= 16;
        if(number1==number2){
            System.out.println(number1 + " is equal to "+number2);
        }
        if(number1!=number2){
            System.out.println(number1 + " is not equal to "+number2);

        }





        /*
          Write a Java program to implement following logic using if statement
        1. if hour is less than 12 noon, greet with Good Morning
        2.  if hour is greater than or equal 12 noon but less than 3 pm, greet with Good Afternoon
        3.  if hour is greater than or equal to 3 pm, greet with Good Evening
         */

        int hour = 12;
        if(hour>=0 && hour<12){
            System.out.println("Good Morning");
        }
        if(hour>=12 && hour<15){
            System.out.println("Good Afternoon");
        }
        if(hour>=15 && hour<24){
            System.out.println("Good Evening");
        }

        System.out.println("\n********************************\n");


        // Declare a variable called num _
        // check if number is positive negative or equals to zero
        // for example  : num =1  print ; "positive"

        int num= 300-500; // automaticly calculate
        String str = "zero";
        /*
        number to be positive : number>0
        number to be negative : number<0
        number to be zero: number ==0
         */

        if(num>0){
            str = "Positive"; //bu TRUE old bunu yazacak o yuzden str ==positive esitliyoruz
            //System.out.println(num + " is "+ str); burayada yazilabilir
        }
        if(num<0){
            str = "Negative";
            //System.out.println(num + " is "+ str); burayada yazilabilir
        }
        System.out.println(num + " is "+ str);


        System.out.println("\n********************************\n");

        System.out.println();
        int hours =12;   // fix it ???????
        int minutes = 45;
        int seconds = 30;
        String amOrPm = "am";


        System.out.println(hours + ":"+ minutes+ ":"+ seconds + ":"+ amOrPm); // hours : minutes : seconds am
    }
}
