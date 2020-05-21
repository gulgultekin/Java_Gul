package OfficeHours.Practice_04_22_2020;

public class Void_Method {

    public static void main(String[]args){
     print();

        System.out.println("**************************");

        boolean uscitizen = false;
        int age = 18;
        Vote(age,uscitizen);


        System.out.println("***********************************");

        String result = Vote2(19,true);
        System.out.println(result);

        System.out.println("***********************************");


        EligibleToBUy(29);

        System.out.println("***********************************");
        String result2 = EligibleTobuyCigar(18);
        System.out.println(result2);





    }
    public static void print(){
        for(int i=1; i<=5; i++) {
            System.out.println("hello batch 18 -- "+i);
        }

    }

    // write a function that can identify if aperson is eligible to vote
    // must know--> age, USCitizen

    public static void Vote(int age, boolean usCitizen){
        boolean eligibleToVote= age>=18 && usCitizen==true;
        if(eligibleToVote){
            System.out.println("yes, you are eligible to vote");
        }else{
            System.out.println("No, you are not eligible to vote");
        }
    }


    public static String Vote2(int age, boolean UsCitizen){


        if(age>=18 && UsCitizen == true){
            return "yes, you are eligible to vote";
        }else{
            return "No, you are not eligible to vote";
        }


    }



    // write a method if a person eligible to buy cigaret
    //must know age
    public static void EligibleToBUy(int age){
        if(age>18){
            System.out.println("Eligible to buy");
        }else{
            System.out.println("Not eligible");
        }
    }


    public static String EligibleTobuyCigar(int age){
        if(age>18){
            return "Eligible to buy";
        }else{
            return "Not eligible";
        }

    }









}
