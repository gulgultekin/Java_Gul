package day42_Inheritance.task02;

public class TV extends Device {
    /*
    create a class called TV:
				attributes: brand, model, price, country,type
				methods: watch, toString
	    brand, (Inherited)
		model, (Inherited)
		price, (Inherited)
		country.(Inherited)
		type (Inherited)
		size (inherited)

		watch,
		toString (Inherited)
     */
    public TV(String brand,String model, double price,String size){
        setDevice(brand,model,price,"TV",size);
    }

    public void watch(){
        System.out.println("People are watching their news on "+brand+" TV");
       // System.out.println("I am watching "+brand+" "+model+" "+type+" that cost me $"+price+" Made in "+country );

    }



}
