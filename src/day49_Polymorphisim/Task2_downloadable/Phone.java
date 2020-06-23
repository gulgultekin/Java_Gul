package day49_Polymorphisim.Task2_downloadable;

//3. create an abstract class named Phone
//            variables: brand, model, price, size
//            abstract methods: texting(), calling()

public abstract class Phone {

    String brand;
    String model;
    double price;
    String size;

    public abstract void texting();

    public abstract void calling();


}
