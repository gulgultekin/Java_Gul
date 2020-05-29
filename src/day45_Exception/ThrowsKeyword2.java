package day45_Exception;

public class ThrowsKeyword2 {
    public static void main(String[] args) throws Exception {

        System.out.println("Java");

        Thread.sleep(3000);

        System.out.println("Cybertek");

        Thread.sleep(3000);

        System.out.println("Batch 18");

        Thread.sleep(4000);

        System.out.println("Complete");

   //burada throws exception yazmak try catch den daha advantegli.
        //method call yapilmadigi icin burada handled calisiyor
    }
}
