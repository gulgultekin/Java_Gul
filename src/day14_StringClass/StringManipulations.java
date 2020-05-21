package day14_StringClass;

public class StringManipulations {
    public static void main(String[] args) {

        String str= "I like to learn Java. I like to watch the movie Jumanji";

       int a1 =str.indexOf("J");
        System.out.println(a1);

        int a2 = str.indexOf("Ju");
        System.out.println(a2);

        int a3 = str.indexOf(" I")+1; // second I' index number
        System.out.println(a3);

        String s="I like Java, and I like reading";
        int b1 =s.lastIndexOf("I"); //17
        System.out.println(b1);

        int b2 =s.lastIndexOf("l");
        System.out.println(b2);

        String z ="I like C#, C# is cool";
        int c1=z.lastIndexOf("C");//ikinci C
        System.out.println(c1);

        String x = "I like Java, Java is fun, Java programming is fun";
        int y =x.indexOf("Java is");// second J' index num
        System.out.println(y);

        int y1 = x.indexOf(", J")+2; //second J' index num
        System.out.println(y1);

        int y3 = x.lastIndexOf("J"); // last J' index number
        System.out.println(y3);

        int y4 = x.indexOf("Java p"); // last J' index number
        System.out.println(y4);

        char ch1= x.charAt(26); //last J
        System.out.println(ch1);

















    }
}
