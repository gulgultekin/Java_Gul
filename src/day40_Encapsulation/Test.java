package day40_Encapsulation;

public class Test {

    public static void main(String[] args) {

        Encapsulation obj = new Encapsulation();
        //System.out.println(obj.SSN); private old icin direk ulasilamaz

        System.out.println( obj.getSSN() ); //0 cunku dah initialize edilmedi

        obj.setSSN(12345);
        System.out.println(obj.getSSN()); // 12345

    }
}
