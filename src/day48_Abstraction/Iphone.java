package day48_Abstraction;

public class Iphone extends Phone {

    static{
        brand = "Iphone"; // static--zaten iphone class old icin iphone istiyoruz o yuzden bir tane yazmamiz yeterli
        //there is no local variable just Iphone
    }
    public Iphone(String model, double price,String size){

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

    public void faceTiming(long phoneNumber){
        System.out.println("Iphone is facetiming with "+phoneNumber);
    }
}
