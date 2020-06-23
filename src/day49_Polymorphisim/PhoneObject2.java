package day49_Polymorphisim;

public class PhoneObject2 {

    public static void main(String[] args) {


        iphone phone1 = new iphone("Iphone X pro",1000.50,"10 inches");
        System.out.println(phone1);
        phone1.calling(911);
        phone1.faceTiming(999);
        phone1.texting(111);
        phone1.downloadable();

    }
}
