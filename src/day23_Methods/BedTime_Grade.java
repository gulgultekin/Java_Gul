package day23_Methods;

public class BedTime_Grade {

   /* 4. write a method called Grade, that can print out the grade based on the score of the student
            if score is 100 ~ 90 ==> A
            if score is 89 ~ 80 ==> B
            if score is 79 ~ 70 ==> C
            if score is 69 ~ 60 ==> D
            if score is 0 ~ 59 ==> F
            otherwise ==> Invalid Score
        Ex:
            Grade(100); ==> A
            Grade(120); ==> Invalid

     */


    public static void main(String[] args) {
        Grade(96);


    }

    private static void Grade(int score) {
        if(score >100 || score < 0){
            System.out.println("Invalid score");
        }

        else if(score >= 90 && score <= 100){
            System.out.println("Your grade is: A");
        }
        else if(score >= 80 && score <= 89){
            System.out.println("Your grade is: B");
        }
        else if(score >= 70 && score <= 79){
            System.out.println("Your grade is: C");
        }
        else if(score >= 60 && score <= 69){
            System.out.println("Your grade is: D");
        }
        else if(score >= 0 && score <= 59){
            System.out.println("Your grade is: F");
        }


    }


}
