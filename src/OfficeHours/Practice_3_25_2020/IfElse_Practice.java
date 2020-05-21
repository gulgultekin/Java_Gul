package OfficeHours.Practice_3_25_2020;

public class IfElse_Practice {
    public static void main(String[] args) {

        int num=101;
        if(num%2!=0){
            System.out.println(num + " is odd number");
        }else{
            System.out.println(num +" is even number");
        }


        boolean genderMale=true;
        if(genderMale){
            System.out.println("Gender is male");
        }else {
            System.out.println("Gender is female");
        }

        boolean usCitizen=true;
        int ageOfPerson =24;

        if(usCitizen==true &&ageOfPerson>18){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not eligible to vote");
        }

    }
}
