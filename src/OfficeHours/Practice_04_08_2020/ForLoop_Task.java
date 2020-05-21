package OfficeHours.Practice_04_08_2020;

public class ForLoop_Task {
    public static void main(String[] args) {

        /*
        print all the numbers between 0~100 that can be divisible by 3 or 5
         */
        for(int i= 0; i<=100; i++){
            if((i%3==0) ||(i%5==0)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("*****************************");

        String name="Gul Gultekin";
        String reverse="";

        for(int i= name.length()-1 ; i>=0 ; i--){

           //reverse += name.charAt(i);   //charAt ile
            //System.out.print(name.charAt(i));

            reverse+= name.substring(i,i+1);  //substring ile
        }

        System.out.println(reverse);

        if(name.equalsIgnoreCase(reverse)){
            System.out.println(name + " is palindrome name");
        }else{
            System.out.println(name + " is not palindrome name");
        }








    }
}
