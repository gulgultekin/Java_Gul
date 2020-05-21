package day43_MethodOverriding;

class Test{
    public void method(){
        System.out.println("Super");
    }

}


public class MethodOverriding extends Test {
    public static void main(String[] args) {

        Test obj1 = new Test();  // parent classin objesi olunca oradaki methodu cagiriyor
        obj1.method(); // super

        MethodOverriding obj2 = new MethodOverriding();
        obj2.method(); //sub   // sub classin objesi olunca buradaki methodu cagiriyor
    }

    // hangi classin objesi olduguna gore sonuc degisiyor

    @Override // annotation ->it shows if method is overriden method or not
    public void method(){

        System.out.println("Sub");
    }
}
