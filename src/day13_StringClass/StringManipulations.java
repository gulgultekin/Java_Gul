package day13_StringClass;

public class StringManipulations {
    public static void main(String[] args) {

        String str= "Cybertek";//methodu cagirmak icin once object olusturmamiz gerekir
               //    01234567
       char ch1= str.charAt(5);// 5.index number ama 6.character demek
        System.out.println(ch1); // t
        System.out.println(ch1=='t'); //true

        int totalLenght= str.length();
        System.out.println(totalLenght);

        System.out.println(totalLenght>250); //false

        String str2= "Today is great day, java is fun";
        int lenght2=str2.length();
        System.out.println("lenght:"+lenght2);//31

        int maxIndexNum=str2.length()-1;
        System.out.println("max index number "+maxIndexNum);// 30

        String s1= "Cybertek";
        s1=s1.concat(" School");//Cybertek School
        System.out.println(s1);

        String s2 = "Java";
        System.out.println(s2.concat(" is a programming language"));
        System.out.println(s2);// burada sadece"java"

        s2=s2.concat(" is a programming language");//java is a programming language
        System.out.println(s2);//java is a programming language

        String r1="Java is fun";
        r1= r1.concat(", and it's easy");
        System.out.println(r1);//java is fun, and it's easy

        String name1="CYBERTEK";
        name1=name1.toLowerCase();
        System.out.println(name1);//cybertek

        String name2="cybertek school";
        name2=name2.toUpperCase();
        System.out.println(name2);//CYBERTEK SCHOOL

        String A1="          Today is a great day          ";
        A1= A1.trim();
        System.out.println(A1);//"Today is a great day"






    }

}
