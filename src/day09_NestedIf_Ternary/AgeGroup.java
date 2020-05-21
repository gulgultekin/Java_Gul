package day09_NestedIf_Ternary;

public class AgeGroup {
    public static void main(String[] args) {
 /*
        write a program that can define the age groups of a person
             age groups are:
                    Teenager (<21),
                    Adult (21 - 55),
                    Senior Citizen (55+)
         */
       int age= 10;
       String group ="";

        if(age>=0 && age<=130){
               if(age<21){
                group="Teenager";
               }else if (age<55){
                group = "Adult";
               }else{
               group= "Seniors";
              }

        } else{
          group="invalid age";
        }
        System.out.println(group);


        System.out.println("\n********************\n");

        int age2 = 67;
        String group2 = "";

        if(age2 >= 0 && age2 <= 130){
             group2 = (age2 < 21)?"Teenager" : (age2 < 55)? "Adult" : "Seniors";
        } else{
            group2="invalid";
        }
        System.out.println(group2);


        }
        }

