package day40_Encapsulation;

public class Quiz_Question_12 {

    public static String name = "Osman";

    public Quiz_Question_12(){
        name = "Hilal";
    }

    {
        name = "Marionela";
    }


    static{
        name = "Madina";
    }

    public static void main(String[] args) {

        //System.out.println(name); // Object olmazsa sadece static block run yapar sonuc -->Madina

        Quiz_Question_12 obj = new Quiz_Question_12();
        System.out.println(name); //Hilal--> constructor en son run yapar
    }

}
