package OfficeHours.Practice_05_20_2020;

class Data{

    int a =100;
    public void method(){
        System.out.println("Hello world");
    }
}

public class SuperKeyword extends Data {
    int a=200;

    public void method(){
        System.out.println("hello Cybertek");
    }

    public SuperKeyword(){
       super.method(); //hello world
      //method();  //hello Cybertek // this.method();ayni class icindeki iki turlude cagirilabilir
    }

    public static void main(String[] args) {
        SuperKeyword obj = new SuperKeyword();
    }
}
