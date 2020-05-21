package OfficeHours.Practice_05_06_2020;

public class instance_Variables {

    int a=100; //instance variable--objeckte ait

    public static void main(String[] args) {

        int a=100; //local variable

        instance_Variables obj1 = new instance_Variables();
        obj1.a = 300;
        System.out.println(obj1.a); //300

        instance_Variables obj2 =new instance_Variables();

        System.out.println(obj2.a); //100


    }


}
