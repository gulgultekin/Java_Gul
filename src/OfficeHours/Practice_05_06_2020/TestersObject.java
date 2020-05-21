package OfficeHours.Practice_05_06_2020;

public class TestersObject {

    public static void main(String[] args) {

        Tester tester1 = new Tester();
        tester1.setInfo("Muhtar","SDET",90000,123456);

        System.out.println(tester1);


        Tester tester2 = new Tester();
        tester2.setInfo("Onur","Junior SDET",100000,1234);
        System.out.println(tester2);

        tester1.smokeTesting();
        tester2.smokeTesting();
        tester2.creatingTicket();









    }
}
