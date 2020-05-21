package Replits;

import java.util.Scanner;

public class Sandwich_Loop_095 {
    public static void main(String[] args) {

        /*    Scanner scan = new Scanner(System.in);
            String str = scan.next();
            String result="";

            if(str.startsWith("bread")&&str.endsWith("bread")){
                result=str.replace("bread", "");
            }
            else{
                result="nothing";
            }
            System.out.println(result);
      */


        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String between = "nothing";

        if (str.contains("bread"))
            if(str.lastIndexOf("bread") != str.indexOf("bread"))
                between = str.substring(str.indexOf("bread") + 5,  str.lastIndexOf("bread"));

        System.out.println(between);

    }








    }

