package day02_Variables;

public class EscapeSequences {
    public static void main(String[] args) {

        System.out.println("\tHello");
        System.out.println("Hello");
        System.out.println("\t\t\tHello");
        // \t means a paragraf space

        System.out.println("Hello \nCybertek School");
        // \n bundan sonraki yaziyi new line yaziyor-- after that break the line

        System.out.println("\nMy \nname\nis\nGul");
        //en basa yazdigimiz \n bir empty line birakiyor bir onceki kod ile


        //my favorite show is"Game of Thrones"
        System.out.println("My favorite Tv Show is \"Game of Throne\"");

        // yazidaki bir kelimeyi" "double quote altina almak istersek \" Gul \" arasina yaziyoruz


        System.out.println("\\");
        System.out.println("/");

        System.out.println(" my favorite book is 'Java' ");
        System.out.println(" my favorite book is \'Java\' ");
        //bu son iki line ayni yaziliyor --single quote icin 'g' yada \'g\' ayni

    }
}
