package Tasks;

public class Calisma10_StringMethod_Replace {
    public static void main(String[] args) {
        String str="Java is good, java is fun";
        str=str.replace("is f","iS F");
        System.out.println(str);

        String str1= "Java is fun ";
        str1=str1.replace('a','u');
        System.out.println(str1);

        str1=str1.substring(8,11);
        System.out.println(str1);
        String str3="    java    ";
        str3=str3.trim();
        System.out.println(str3);
        String a= "Gul";

        a=a.concat(" gult");
        System.out.println(a);
       int anum=a.length();
        System.out.println(anum);
        char ch=a.charAt(0);
        System.out.println(ch);
        a=a.toUpperCase();
        System.out.println(a);
        a=a.toLowerCase();
        System.out.println(a);
       a=a.replace('u','@');
        System.out.println(a);
        String a1="Gul Gultekin";
        a1=a1.replace('u','&');
        System.out.println(a1);
    }
}
