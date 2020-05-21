package Tasks;

public class Calisma03_If_Grade {
    public static void main(String[] args) {
        /*
        A=90-100
        B=80-89
        c=70-70
        D=60-69
        F= 59--

         */
        double score = 70;
        String grade = " ";
        boolean ValidGrade = score >= 0 && score <= 100;
        if (ValidGrade) {
            if (score >= 90 && score <= 100) {
                grade = "A";
            } else if (score >= 80 && score < 90) {
                grade = "B";
            } else if (score >= 70 && score < 79) {
                grade = "C";
            } else if (score >= 60 && score < 69) {
                grade = "D";
            } else {
                grade = "F";
            }
            System.out.println(score + " : You got a " + grade);
        }
        else{
                System.out.println("invalid entry");
            }


        }
}
