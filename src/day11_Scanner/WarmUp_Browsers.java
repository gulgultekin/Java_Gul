package day11_Scanner;

public class WarmUp_Browsers {
    public static void main(String[] args) {
        /*
         write a program that can display the selected browser
                        1. declear a String variable called browserName

                        2. Assume that the valid browsers are: chrome, firefox, opera, safari.
                        3. if the browser name does not match with the valid browsers' names,
                        out put should be: Invalid Browser Name
            Note: Do Not use scanner or if statement or ternary for this task

         */

      String browsername="chrome";
           switch (browsername){
                 //expression
               case "Firefox":// veya anlaminda boyle pespese yazilinca
               case "firefox":// boyle yazinca lowercase veya uppercase yazilsada aynisi print yapiliyor
                   System.out.println("Firefox is opening");
                   break;
               case "Chrome":
               case "chrome":
                   System.out.println("chrome is opening");
                   break;
               case "Opera":
               case "opera":
                   System.out.println("Opera is opening");
                   break;
               case "Safari":
               case "safari":
                   System.out.println("Safari is opening");
                   break;
               default :
                   System.out.println("invalid");
                   break;
           }
    }
}
