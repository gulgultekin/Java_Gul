package OfficeHours.Practice_05_13_2020;

public class StaticBlock {

    static String str;


    static{
      str = "Cybertek";
        str = "Harvard";
        str = "MIT";
    }

    public static void main(String[] args) {
        str = "Cybertek School"; // static variable burda main icinde tanimlarsak diger classlardan cagirinca null verir
        //sadece en basta  static String str="Cybertek"; yazarsak yada static block icinde yazarsak baska classtan okunur
        System.out.println(str);
    }

}


class staticBlockTest{

    public static void main(String[] args) {

        System.out.println(StaticBlock.str);
    }
}