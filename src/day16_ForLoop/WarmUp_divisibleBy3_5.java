package day16_ForLoop;

public class WarmUp_divisibleBy3_5 {
    public static void main(String[] args) {
        /*
        Warmup tasks:
	1. write a program that can print all the ODD numbers between 1 ~ 100 that can be divisible by 3 & 5
	2. write a program that can print all the EVEN numbers between 1 ~ 100 that can be divisible by 3 & 5
	3. write a program that can calculate the sum of all the even numbers between 1 ~ 100
	4. write a program that can calculate the sum of all the odd numbers between 1 ~ 100;
	5. Write a program that will print out all letters in English alphabet in ascending order
	6. Write a program that will print out all letters in English alphabet in descedning order
	7. write a program that can calculate the sum of all numbers between 1 to any given number
		ex:
			input: 100
			output: 5050
			input: 50
			output: 1275
			input : 200
			output : 20100
         */
        //1. write a program that can print all the ODD numbers between 1 ~ 100 that can be divisible by 3 & 5
        for (int i = 1; i <= 100; i += 2) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("all odd number can be divisible by 3 and 5 is: " + i);
            }
        }
        System.out.println("**********************************");

        //2. write a program that can print all the EVEN numbers between 1 ~ 100 that can be divisible by 3 & 5
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {

                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("all even number can be divisible by 3 and 5 is: " + i);
                }

            }
        }





    }
}
