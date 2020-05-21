package day35_Static;

public class staticPractice2 {

    String brand;
    String model;

    //butun arabalarda common olan seyleri static ile yazabiliriz. cunku hepsi bu ozelligi tasiyor

    static boolean hasWheels =true;

    public  void printBrand(){

        System.out.println(brand);
    }

    public void printModel(){

        System.out.println(model);
    }

    public static void main(String[] args) {
        System.out.println(hasWheels); // static boolean hasWheels yazdigimiz icin static methodun icinde yaziyoruz.
        // boolean hasWheels olsaydi method da public void olmaliydi.yoksa static icine yazamazdik   hata verirdi
    }


}
