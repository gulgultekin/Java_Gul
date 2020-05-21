package Tasks;

import java.util.Scanner;

public class Scanner_Ternary {
    public static void main(String[] args) {
  // ask 3 number. find max, min and medium

        Scanner scan =new Scanner(System.in);
        System.out.println("please enter 3 number");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        String max=(num1>num2 &&num1>num3)? ("num1 is max "+num1) : (num2>num1&&num2>num3)? ("num2 is max "+num2)
                : ("num3 is max "+num3);
        System.out.println(max);

        String min=(num1<num2 &&num1<num3)? ("num1 is min "+num1) : (num2<num3 && num2<num1)? ("num2 is min "+num2)
                :("num3 is min "+num3);
        System.out.println(min);

        String medium=(num1>num2 &&num1<num3 ||num1<num3 &&num1>num2)? ("num1 is medium " +num1)
                    : (num2<num1 &&num2>num3 ||num2>num1 &&num2<num3)? ("num2 is medium "+num2): ("num3 is medium "+num3);
        System.out.println(medium);

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first name");
        String firstName= input.nextLine();//.toUpperCase();

        System.out.println("Please enter your last name");
        String lastName = input.nextLine();//.toUpperCase();

         String fullName = firstName.concat(" "+lastName).toUpperCase();
       // String fullName= firstName+" "+ lastName;
        // fullName = fullName.toUpperCase();
        System.out.println(fullName);


    }
}
