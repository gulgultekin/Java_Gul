package OfficeHours.Practice_4_1_2020;

public class Literal_new {
    public static void main(String[] args) {

        String s1="Java";//String literal
        String s2="Java";//String literal

        String s3=new String("Java");
        String s4=new String("Java");

        System.out.println(s1==s2);//true, same objects

        System.out.println(s1==s3);// false , different object at different memory

        System.out.println(s3==s4);// false, different object at different memory

    }
}
