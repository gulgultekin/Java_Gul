package day21_MultiDimensional_Arrays;

public class Lunch_Task_Emails {
    public static void main(String[] args) {
        /*
        Task_Max:
    given an array:
        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"}
        elemnts could be more in the array
    prin all the email addresses excluding the gmail addresses
        NOTE: MUST USE FOR EACH LOOP
         */

        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"};

        for (String eachEmail : emails) {

            if(eachEmail.endsWith("@gmail.com")){
                continue;
            }
            System.out.println(eachEmail);

            //baska cozum

            /*if (!eachEmail.endsWith("@gmail.com")) {

                System.out.println(eachEmail);

            }*/


        }
    }
}
