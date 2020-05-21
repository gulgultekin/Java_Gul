package OfficeHours.Practice_4_1_2020;

public class StringMethods2 {
    public static void main(String[] args) {
       //isEmpty()

        String str="   ";
        boolean r1 = str.isEmpty();
        boolean r2 = !str.isEmpty();
        System.out.println(r1);//false
        System.out.println(r2);//true

        System.out.println("**********************");

        //equals(str)
        String s1="cat";
        String s2=new String("cat");
        System.out.println(s1==s2);//false
        System.out.println(s1.equals(s2));//true

        //equalsIgnoreCase(str);
        String s3="CAT";
        System.out.println(s1.equalsIgnoreCase(s3));// true , ignores the case sensitivity

        System.out.println("***************************");

        //contains(str);

        String sentence="I like to learn Java";
        System.out.println(sentence.contains("Java"));//true

        System.out.println("***************************");

        //startsWith(str);
        String webAddress="www.amazon.com";
        System.out.println(webAddress.startsWith("www"));//true

        System.out.println(webAddress.startsWith("wwwww"));//false

        //endsWith(str);
        System.out.println(webAddress.endsWith(".com"));//true
    }
}
