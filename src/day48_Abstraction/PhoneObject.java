package day48_Abstraction;

public class PhoneObject {

    public static void main(String[] args) {

        Iphone iphone1 = new Iphone("X",1000,"10 inches");

        Iphone iphone2 = new Iphone("8",900,"8 inches");

        System.out.println(iphone1);
        System.out.println(iphone2);

        iphone1.calling(1232457487);
        iphone1.texting(32457487);
        iphone2.faceTiming(2457487);

        System.out.println("********SAMSUNG***************");


        Samsung samsung1 = new Samsung("Note10 Plus",1200,"Large");

        System.out.println(samsung1);

        samsung1.calling(1232457487);
        samsung1.texting(1232457487);


    }
}
