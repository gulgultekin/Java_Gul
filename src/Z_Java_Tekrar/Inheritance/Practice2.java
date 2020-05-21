package Z_Java_Tekrar.Inheritance;

class Data{


    public void methodA(){
        int a=100;
        System.out.println("madina");
    }

}


public class Practice2 extends Data {

    public void methodB(){
        System.out.println("Aysa");
       // a=1;
       methodA();
    }

    public static void main(String[] args) {
        Practice2 obj = new Practice2();
        obj.methodA();
        obj.methodB();

    }

}
