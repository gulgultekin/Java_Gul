package day33_CustomClass;

public class Car {

    String Brand;
    String model;
    int year;
    String color;

    public void start()
    {
        System.out.println(Brand + " is started");
    }

    public void drive(){
        System.out.println("Driving "+ Brand +" "+model);
    }

    public void getCarInfo(){
        System.out.println(year+" "+Brand+" "+model+" "+color);

    }

    public void setCarInfo(String carBrand, String carModel, int carYear, String carColor){
        Brand = carBrand;
        model =carModel;
        year = carYear;
        color = carColor;
    }



    public String toString(){  // System.out.println(car1); yazdirmak icin bu methoda ihtiyac var yoksa hashcode veriyor
        String result = year+" "+Brand+" "+model+" "+color; // istedigin sirayla yazabilirsin

        return result;
    }









    public static void main(String[] args) {

        int a= 100; // local variable

    }
}
