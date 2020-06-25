package OfficeHours.Practice_06_17_2020;

import java.util.Scanner;

public class Test_Try_Catch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            String s = "abc";
            System.out.println(s.charAt(30));
            System.out.println("try block");

            int[]a = new int[3];
            System.out.println(a[50]);

        }catch (StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException e){
            System.out.println("Out of bounds");

        }catch (Exception e){
            e.printStackTrace(); //Exceptionun yorumu --> String index out of range: 30

            System.out.println("catch block");
        }finally{
          input.close();
            System.out.println("finally block");
        }



    }
}
