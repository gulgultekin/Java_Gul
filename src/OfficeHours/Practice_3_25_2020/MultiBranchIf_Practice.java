package OfficeHours.Practice_3_25_2020;

public class MultiBranchIf_Practice {
    public static void main(String[] args) {

        int number =0;
        if(number>0){
            System.out.println("it's positive number");
        }else if (number<0){
            System.out.println("it's negative number");
        }else{
            System.out.println("it's zero");
        }


        int num1=700;
        int num2= 300;

        if(num1>num2){
            System.out.println(num1+ " is greater than "+num2);
        }

       else if(num2>num1) {
            System.out.println(num2+ " is greater than "+num1);
        }
        else {
                System.out.println(num1+" is equal to "+num2);
            }
        System.out.println("***********************************");
         String browserName ="";

         if(browserName=="Firefox"){
             System.out.println("Firefox browser is opening");
         }
         else if(browserName=="Chrome"){
             System.out.println("Chrome browser is opening");
         }

         else if(browserName=="Internet Explorer"){
             System.out.println("Internet Explorer browser is opening");
         }
         else if(browserName=="Safari"){
             System.out.println("Safari browser is opening");
         }
         else if(browserName=="Opera"){
             System.out.println("Opera browser is opening");
         }
         else {
             System.out.println("Invalid browser name");
         }
    }

}
