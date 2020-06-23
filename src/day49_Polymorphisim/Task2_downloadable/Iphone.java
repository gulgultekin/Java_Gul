package day49_Polymorphisim.Task2_downloadable;

// 4. create a class named iPhone that can inherit from AppleApps interface
//            actions that every iphone can do: texting(), calling(), faceTiming(), selfie()

public class Iphone extends Phone implements AppleApps {

    public Iphone(String brand,String model,double price,String size){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.size = size;
    }

    public void texting(){}

    public void calling(){}

    public void faceTiming(){}

    public void selfie(){}



    @Override
    public void download() {

    }
}
