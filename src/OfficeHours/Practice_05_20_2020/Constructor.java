package OfficeHours.Practice_05_20_2020;

class Test{
    public Test(int a){
        System.out.println("A");
    }
}



public class Constructor extends Test {

    public Constructor(){ //A B
        //super(); // default old icin automaticly gelir zaten cagirmaya gerek yok
        super(10);//A B paramaterli old zaman cagirmamiz lazim
        System.out.println("B");
    }

    public static void main(String[] args) {
      Constructor obj = new Constructor();
    }

}
