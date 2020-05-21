package day40_Encapsulation;

public class CredentialsObject {

    public static void main(String[] args) {

        Credentials faceBook = new Credentials();

        faceBook.setUserName("Florida");
        faceBook.setPassWord("tampa");

        System.out.println(faceBook.getUserName());
        System.out.println(faceBook.getPassWord());

        Credentials google = new Credentials();

        google.setUserName("gul");
        google.setPassWord("123");

        System.out.println(google.getUserName());
        System.out.println(google.getPassWord());




    }
}
