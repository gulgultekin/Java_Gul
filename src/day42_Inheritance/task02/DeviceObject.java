package day42_Inheritance.task02;

public class DeviceObject {
    public static void main(String[] args) {

        Phone phone=new Phone("Apple","Iphone 11",1000,"XL");

        System.out.println(phone);
        phone.call(1233);
        phone.text(5544);

        System.out.println("\n*********************\n");

        TV tv= new TV("Samsung","E250",500,"40 inches");

        tv.country = "USA"; // tekrar initialize yaptik
        System.out.println(tv);
        tv.watch();


    }
}
