package day12_Recap;

import java.util.Scanner;

public class BedTimetask_areaOfCircle {
    public static void main(String[] args) {
        /*
        scanner warmup tasks:
    1. write a program that can calculate the area of circle
                needed information:
                                    1. radius of the cirle*/

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter radius of circle");
        double radius= input.nextDouble();
        double areaOfCircle= radius*radius*3.14;
        System.out.println("Area of circle is : "+areaOfCircle);



   /* 2. Ask user to enter two words. Then add them together and print.
                        Input:
                            one
                            eight
                        Output:
                            oneeight*/

       System.out.println("please enter 2 words");
        String word1= input.nextLine();
        String word2=input.nextLine();

        System.out.println(word1+" "+word2);






 /*  3. Write a Java Program that can calculate the grade of a student based on the score,
        implement the following logic:
                If marks < 60, then print “Fail”
                If marks >= 60, but less than 90, then print “Pass”
                If marks >= 90, then print “Passed with Distinction”
                MUST use scanner*/

       System.out.println("Please enter your grade: ");
        short grade= input.nextShort();

        String score=(grade>=90&grade<=100)? "Passed with Distinction" : (grade<90 && grade>=60)? "Pass"
                : (grade<60)? "Fail": "invalid grade";
        System.out.println("Your grade is: "+ grade+" and you "+score);



      /* 4. Revenue can be calculated as the selling price of the product times the quantity sold,
      i.e. revenue = price × quantity.
      Write a program that asks the user to enter product price and quantity and then calculate the revenue.
      If the revenue is more than 5000 a discount is 10% offered.
      Program should display the discount and net revenue.
         */

        System.out.println("Please enter product price: ");
        int price= input.nextInt();

        System.out.println("Please enter quantity: ");
        short quantity =input.nextShort();
        int revenue = price*quantity;
      int discount= (revenue>=5000)? (int) (revenue * 0.010) : 0;
        System.out.println("discount:"+discount);
        System.out.println("revenue: "+ (revenue - discount));





    }
}
