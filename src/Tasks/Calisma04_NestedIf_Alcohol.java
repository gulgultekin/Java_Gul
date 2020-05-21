package Tasks;

public class Calisma04_NestedIf_Alcohol {
    public static void main(String[] args) {
        /*
        declare an int variable called Age
        declare a boolean variable "Good Person"
    if goodperson is false
        age>=18==>cigar
        age>=21==>Hookah
        age>=25==>alcohol

        age<18==>milk

    else
       //bad for your health

         */

        int age = 15;
        boolean GoodPerson = true;

        if (age >= 18) {

           if(GoodPerson){
               System.out.println("Alcohol is bad for your health");
           }
           else { // goodperson=false && age>=18
               System.out.println("You can buy cigar");

               if (age >= 21) {
                   System.out.println("You can buy hookah");
               }
               if (age >= 25) {
                   System.out.println("you can buy alcohol");
               }
           }
        }
        else { //age <18
            System.out.println("buy milk");
        }
    }
}
