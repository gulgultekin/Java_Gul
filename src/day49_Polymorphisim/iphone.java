package day49_Polymorphisim;

public class iphone extends Phone implements AppleApps {

    static{
        brand = "Apple";
    }
    public iphone(String model,double price,String size){

        this.model = model;
        this.price = price;
        this.size = size;
    }

    public void selfie(){}


    @Override
    public void download() {

    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Iphone is texting apps from "+AppStoreName);
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Iphone is calling apps from "+AppStoreName);
    }

    @Override
    public void faceTiming(long phoneNumber){
        System.out.println("Iphone is faceTiming apps from "+AppStoreName);
    }


    @Override
    public void downloadable() {
        System.out.println("Iphone is downloading apps from "+AppStoreName);
    }
}
