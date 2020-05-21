package day34_CustomClass;

public class DogObjects2 {
    public static void main(String[] args) {
        String food1 ="Chicken";
        String food2 ="Fish";

        String drink1 = "milk";
        String drink2 = "coffee";

        String toy1 = "PS4";
        String toy2 = "Piano";

        String subjects1 ="Java";


        Dog dog1 = new Dog();
        dog1.setDogInfo("Alabay","XL",5,"Brown","Ajdar");

        Dog dog2 = new Dog();
        dog2.setDogInfo("Chihua Hua","Small",1,"Brown","Tuzik");


        dog1.eating(food1);
        dog2.eating(food2);

        dog1.drinking(drink2);
        dog2.drinking(drink1);

        dog1.playing(toy1);
        dog2.playing(toy2);


        Dog dog3 = new Dog();
        dog3.setDogInfo("Poodle","XS",2,"White","Lucy");


        Dog dog4 = new Dog();
        dog4.setDogInfo("Kangal","Huge",5,"White","Comar");

        System.out.println("\n************ARRAY**********************");

        Dog[] dogPark ={dog1,dog2,dog3,dog4};

        for(int i=0; i< dogPark.length;i++){
            dogPark[i].eating(food1); // dogPark[i].eating("Chicken");

        }

        for(Dog each:dogPark){
           each.drinking("Water");
        }

        for(int i=0; i<dogPark.length; i++){
            dogPark[i].playing("Football");
        }

        for(Dog each:dogPark){
            each.studying("Java"); //each.studying(subjects1); boylede yazilabilir
        }


    }
}