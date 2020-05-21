package day07_IfStatements;

public class Vote {
    public static void main(String[] args) {
        byte  userAge = 28;
        byte voteAge =18;

        if(userAge>=voteAge){
            System.out.println("You are eligible to vote");
        }
        if (userAge< voteAge){
            System.out.println("You are not eligible to vote");


            // bu sekilde de yazilabilir
            int age = 18;
            boolean UScitizen = true;
            boolean likeDonald = true;

            boolean eligible = age<= 18 && UScitizen == true;
            if (eligible) {

                System.out.println("You are eligible to vote");
            }

            if(!eligible){ // (eligible == false) yada (eligible != true) degisik sekillerde yazilabilir
                System.out.println("You are not eligible to vote");
            }
            }
    }
}
