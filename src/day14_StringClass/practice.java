package day14_StringClass;

public class practice {
    public static void main(String[] args) {

        String gmail ="cybertekschool@gmail.com";

        String userInputGmail = "CybertekSchool@gmail.com";

        boolean result= gmail.equalsIgnoreCase(userInputGmail); //true==> doesn't care case sensitivity

        if(result){
            System.out.println("Logged in");
        }


        System.out.println("**********************************");

        /*
        valid password MUST contain a special characters such as (!,_,$)
        valid password should not contain spaces
         */

        String passWord ="mass12345";
        if(passWord.contains(" ")){
            System.out.println("password cannot have space in it");
        }else{
            System.out.println("valid password");
        }


        System.out.println("***************************************");
        /*
        every website has "www." at the beginning of the web address
         */
        String webAddress= "Www.amazon.com";
         webAddress=webAddress.toLowerCase();
        if(webAddress.startsWith("www.")){ //burda contains kullanamayiz amazwww,on olan bir adrese valid diyemeyiz
                                       // www.contain yapiyor ama basta olmasi lazim
            System.out.println("valid web site");
        }else{
            System.out.println("Invalid");
        }

        System.out.println("888888888888888888888888888888888888888888888");
        /*
        every gmail address ends with @gmail.com
         */
        String email = "Cybertek@Yahoo.com";

        if(email.endsWith("@gmail.com")){
        System.out.println("Valid Gmail");

        }else{
            System.out.println("Invalid Gmail");
        }

        /*
        write a program that can validate if a web address is valid
        valid web address:
            MUST start with www.
            MUST ends with .com, or .edu, or .net or .Gov
         */
    }
}
