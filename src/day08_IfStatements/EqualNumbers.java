package day08_IfStatements;

public class EqualNumbers {
    public static void main(String[] args) {
        /*
        1.  write a program that can check the equality of the three given numberrs
            declare 3 numbers n1, n2, n3
            if n1 and n2 are equal  => n1&n2 are equal

            if n2 and n3 are equal ==> n2&n3 are equal
            if n3 and n1 are qual ==>n3&n1 are equal
            if all equal ==> all equal
            if none of them are euqal ==> none of them are equal
            */
        double n1 = 18;
        double n2 = 17;
        double n3 = 19;



        if (n1 == n2 && n1!=n3) { //n1 =n2 olacagi icin n2!= n3 de diyebilirsin
            System.out.println(" n1 & n2 are equal");
        } else if (n2 == n3 && n2!=n1){
            System.out.println("n2  &  n3  are equal");
        } else if (n1 == n3 && n1!=n2) {
            System.out.println("n1  & n3  are equal");
        }
          else if (n1 == n2 && n1 == n3 ) {
            System.out.println("all equal");
        }
           else {
            System.out.println("none of them are equal");
        }

           //Bu sekilde de yazilabilir

        boolean n1Equaln2 = n1 == n2 && n1 != n3;     // if n1 equal to n2 and does equal n3, that makes n1 equal n2 only
        boolean n1Equaln3 = n1 == n3 && n1 != n2;  // only n1 and n3 are equal
        boolean n2Equaln3 = n2 == n3 && n2 != n1;  // only n2 == n3

        boolean allEqual = n1 == n2 && n1 ==n3 ;    // all of them are equal
        String result = " ";

        boolean noneOfThemEqual = n1 != n2 && n1 != n3  &&  n2 != n3;  // none of them are equal

        //   boolean noneEqual = n1Equaln2 == false && n1Equaln3 == false && n2Equaln3 == false;    // none of them are equal

        //   boolean noneEqual2 = !n1Equaln2  && !n1Equaln3  && !n2Equaln3 ;  // none of them are equal


        if(n1Equaln2){  // n1 == n2  && n1 != n3
            result= "n1 is equal to n2";
        }

        else if(n1Equaln3){  // n1 == n3 && n1 != n2
            result="n1 is equal to n3";
        }

        else if(n2Equaln3){ // n2 == n3 && n2 != n1
            result="n2 is equal to n3";
        }

        else if(allEqual){
            result="n1 is equal to n2 and n3";
        }

        else{
            result="None of them are equal";
        }

        System.out.println(result);









    }
        }




