package day42_Inheritance.task02;

public class Phone extends Device{
    /*
    create ba class called phone:
				attributes: brand, model, price, country
				methods: call, text,  toString
     */

    public Phone(String brand,String model, double price,String size){
        setDevice(brand,model,price,"Phone",size);

    }

    public void call(long number){
        System.out.println("Calling the number: "+number);
    }

    public void text(long number)
    {
        System.out.println("Texting the number: "+number);
    }

}
