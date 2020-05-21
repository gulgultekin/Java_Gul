package day42_Inheritance;

class test{

    public test(){
        System.out.println("super class' default constructor");
    }
}


public class Constructor extends test {

    public Constructor(){ // parent classin defaultu autoaticly called--> yani ikiside print yapar
                                                     // super class' default constructor
                                                    //  sub class' default constructor

        System.out.println("sub class' default constructor");
    }

    public static void main(String[] args) {

        Constructor obje = new Constructor();

        test obj1 = new test(); //super class' default constructor--> super class constructori old icin sadece onu print edr

        Constructor obj2 = new Constructor();//super class' default constructor -->sub class constructori old icin ikisini de print edr
                                             //sub class' default constructor

    }


}
