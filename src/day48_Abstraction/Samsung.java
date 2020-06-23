package day48_Abstraction;

public class Samsung extends Phone {

    public Samsung( String model, double price,String size){

        brand = "Samsung";
        this.model = model;
        this.price = price;
        this.size =size;
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println(brand+" "+model+" is calling "+phoneNumber);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println(brand+" "+model+" is texting "+phoneNumber);
    }


}
