package day09_NestedIf_Ternary;

public class warmUp_AgeGroups {
    public static void main(String[] args) {
        /*
        write a program that can define the age groups of a person
             age groups are:
                    baby (< 3 year)
                    Toddler (3 - 5),
                    Kid (6 - 9),
                    Pre-Teen (10 - 12),
                    Teenager (13 - 17),
                    Young Adult (18 - 20),
                    Adult (21 - 39),
                    Young Middle-Aged Adult (40 - 49),
                    Middle-Aged Adult (50 - 54),
                    Very Young Senior Citizen (55 - 64),
                    Young Senior Citizen (65 - 74),
                    Senior Citizen (75 - 84),
                    Old Senior Citizen (85+)
         */
       // int age= 18;

      /*  if(age<3 &&age>=0){
            System.out.println("baby");
        }
        else if(age>=3 &&age<=5){
            System.out.println("toddler");
        }
        else if(age>=6 &&age<=9){
            System.out.println("kid");
        }
        else if(age>=10 &&age<=12){
            System.out.println("Pre-Teen");
        }
        else if(age>=13 &&age<=17){
            System.out.println("Teenager");
        }
        else if(age>=18 &&age<=20){
            System.out.println("Young Adult");
        }
        else if(age>=21 &&age<=39){
            System.out.println("Adult");
        }
        else if(age>=40 &&age<=49){
            System.out.println("Young Middle-Aged Adult");
        }
        else if(age>=50 &&age<=54){
            System.out.println("Middle-Aged Adult");
        }
        else if(age>=55 &&age<=64){
            System.out.println("Very Young Senior Citizen");
        }
        else if(age>=65 &&age<=74){
            System.out.println("Young Senior Citizen");
        }
        else if(age>=75 &&age<=84){
            System.out.println("Senior Citizen");
        }
        else if(age>=85 &&age<130){
            System.out.println("Old Senior Citizen");
        }
        else {
            System.out.println("invalid age");
        }
        */

      // Bu sekilde de yapilabilir

        int age= 18;
        String ageGroup=" ";

        if(age<3 && age>=0){
           ageGroup="baby";
        }
        else if(age>=3 && age<=5){
            ageGroup="toddler";
        }
        else if(age>=6 && age<=9){
            ageGroup="kid";
        }
        else if(age>=10 && age<=12){
            ageGroup="Pre-Teen";
        }
        else if(age>=13 && age<=17){
            ageGroup="Teenager";
        }
        else if(age>=18 && age<=20){
            ageGroup="Young Adult";
        }
        else if(age>=21 && age<=39){
            ageGroup="Adult";
        }
        else if(age>=40 &&age<=49){
            ageGroup="Young Middle-Aged Adult";
        }
        else if(age>=50 && age<=54){
            ageGroup="Middle-Aged Adult";
        }
        else if(age>=55 && age<=64){
            ageGroup="Very Young Senior Citizen";
        }
        else if(age>=65 && age<=74){
            ageGroup="Young Senior Citizen";
        }
        else if(age>=75 && age<=84){
            ageGroup="Senior Citizen";
        }
        else if(age>=85 && age<130){
            ageGroup="Old Senior Citizen";
        }
        else {
            ageGroup="invalid age";
        }
        System.out.println("This person belongs to : " + ageGroup +" age group");


        // selling alcohol age limit

        boolean eligibleToBuy = ageGroup=="Adult" || ageGroup=="Young Middle-Aged Adult"
                || ageGroup== "Middle-Aged Adult";

        if(eligibleToBuy){
            System.out.println("You are eligible to buy alcohol");
        }
        else{
            System.out.println("You are not eligible to buy alcohol");



        }
    }

}
