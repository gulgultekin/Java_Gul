package day49_Polymorphisim.Task2_downloadable;

//5. create a class named Nokia that can inherit from AndroidApps interface
//            actions that Nokia can do: texting(), calling(), freezing(), breakTheFloor()

public class Nokia extends Phone implements AndroidApps {
// String brand;
//    String model;
//    double price;
//    String size;
    public Nokia(String brand,String model,double price,String size){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.size = size;
    }

    public void texting(){}

    public void calling(){}

    public void freezing(){}

    public void breakTheFloor(){}

    @Override
    public void download() {

    }
}
