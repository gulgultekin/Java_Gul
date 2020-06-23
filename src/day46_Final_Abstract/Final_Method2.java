package day46_Final_Abstract;


class Test{
//    private  void method1(){      //private method can not visible outside of the class and Can NOT Inheriable
//        System.out.println("A");
//    }
    public  void method1(){      //private method can not visible outside of the class and Can NOT Inheriable
        System.out.println("A");    // final method canNOT override
    }
//    public final void method1(){
//        System.out.println("A");    // final method canNOT override
//    }
}



public class Final_Method2 extends Test{
    @Override
    public void method1(){ //override--> access modifier same or more visible olmali public>protected>default
        System.out.println("B"); //different implementation olmali override olmasi icin
    }


}
