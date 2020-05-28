package Replits;

public class Car {

        String make;
        String model;
        int numberOfDoors;
        int topSpeed;
        double price;

        public Car(String make,String model,int numberOfDoors,int topSpeed,double price){
            this.make=make;
            this.model=model;
            this.numberOfDoors =numberOfDoors;
            this.topSpeed=topSpeed;
            this.price =price;

        }

        public Car(String make,String model,int topSpeed,double price){
            this.make=make;
            this.model=model;
            this.topSpeed=topSpeed;
            this.price =price;
            numberOfDoors=4;
        }
        public Car(int numberOfDoors,int topSpeed,double price){

            this.numberOfDoors =numberOfDoors;
            this.topSpeed=topSpeed;
            this.price =price;
            make="unknown";
            model="unknown";

        }
        public Car(String make,String model,int numberOfDoors){
            this.make=make;
            this.model=model;
            this.numberOfDoors =numberOfDoors;
            topSpeed=90;
            price =0;

        }
    }

class Main1
{
    public static void main(String[] args)
    {

    }
}