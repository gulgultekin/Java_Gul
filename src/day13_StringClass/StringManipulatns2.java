package day13_StringClass;

public class StringManipulatns2 {
    public static void main(String[] args) {

        String str="Cybertek Schooll is the best";
        String schoolName=str.substring(0,8);
        System.out.println(schoolName);

        String fullName="Kuzzat Altay";
         //              0123456789..

        String firstname=fullName.substring(0,6);
        String lastname= fullName.substring(7,12);//(7)
        System.out.println(firstname);
        System.out.println(lastname);

        // full name=firstname lastname
        //gmail: lastname_firstname@gmail.com
        String gul= "Gul Gultekin";

        String firstname1=gul.substring(0,3);
        String lastname1=gul.substring(4);

        System.out.println(firstname1);
        System.out.println(lastname1);

       // String gmail=lastname1+"_"+firstname1+"@gmail.com"; plus operatorle boyle
        String gmail=lastname1.concat("_").concat(firstname1).concat("@gmail.com");
        System.out.println(gmail);

        //bu sekilde de yazilabilir ama hata yapma sansi daha fazla
        String gmail1=gul.substring(4)+"_"+gul.substring(0,3)+"@gmail.com";
        System.out.println(gmail1);


        String s1= "I love Java Programming Language";
        String className=s1.substring(7);//Java Programming Language
        System.out.println(className);

        //old string to new string _  all of them
        String s2="I like C# Programming C# C#";
          s2= s2.replace("C#","Java");
        System.out.println(s2);//I like Java Programming Java Java


        String name="COVID 18";
          name=name.replace("8","9");
        System.out.println(name);//COVID 19


        String r1= "I like C#, C# is cool";
          r1=r1.replaceFirst("C#","Java");
        System.out.println(r1);//I like Java, C# is cool

        String r2="Tomorrow is Monday, Tomorrow is Tueasday";
        r2=r2.replaceFirst("Tomorrow","Today");
        System.out.println(r2);//Today is Monday, Tomorrow is Tueasday

    }
}
