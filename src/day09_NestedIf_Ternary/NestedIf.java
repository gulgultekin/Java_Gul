package day09_NestedIf_Ternary;

public class NestedIf {
    public static void main(String[] args) {

        int age =19;
        boolean USCitizen = false;

        if(USCitizen){
            if(age>17){
                System.out.println("You are eligible to vote");
            }
            else{
                System.out.println("Grow up first than vote!");
            }

        }else{
            System.out.println("Only US Citizen are eligible to vote");
        }

        System.out.println("\n************************\n");

        int score =100;
        String grade= "";

        if(score>=0 && score<=100){
            if(score>=60){
                if(score>=90){
                    grade ="You pass with :A";
                }else if(score>=80){
                    grade ="You pass with :B";
                }else if(score>=70){
                    grade ="You pass with :C";
                }else{
                    grade ="You pass with :D";
                }
            }
            else{
                grade="You Failed";
            }
        }else{
            grade ="Invalid ";
        }

        System.out.println(grade);

        System.out.println("\n******************************\n");

        // if statetment icinde tenary kinda nested
        int score2 =85;
        String grade2= "";

        if(score2>=0 && score2<=100){

            grade2=(score2>=90) ? "A" : (score2>=80) ? "B" : (score2>=70) ? "C" : (score2 >=60) ? "D" : "You Failed";

        }else{
            grade2="invalid";
        }
        System.out.println(grade2);
    }
}
