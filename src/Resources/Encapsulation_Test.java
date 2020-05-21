package Resources;

import day40_Encapsulation.Encapsulation;

public class Encapsulation_Test {
    public static void main(String[] args) {

        Encapsulation obj = new Encapsulation();
        System.out.println(obj.getSSN());

        obj.setSSN(12345678);
        System.out.println(obj.getSSN());// public ise ulasilabilir

        Encapsulation_Test obj2 = new Encapsulation_Test();

        //System.out.println(obj2.getSSN());  // bu class objesi oldugundan  ulasmiyor


   }
}
