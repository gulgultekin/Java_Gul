package day48_Abstraction;


interface I1{ // 1 abstract method

    void method1();
}



interface I2 extends I1{ // 2 abstract method

    void method2();
}



abstract class AC implements I2{ // 3 abstract method

     abstract void method3();
}



public abstract class Extends_Implements extends AC  { // 3 abstract method
                              //abstract oldugu icin override zorunlu degildi

    @Override
    public void method1() { // sadece bunu override yapsak bile 2 more abstract method var: method1, method2
                           //abstract class old icin  override yapmak zorunlu degil

    }



}

class testRun extends  Extends_Implements{
        // abstract classtan extend old icin ABTRACT METHODlari  override yapmasi lazim.
    // yukarda method1 override yapildigi icin diger iki method burada override yapilmali yoksa hata veriyor

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }

}
