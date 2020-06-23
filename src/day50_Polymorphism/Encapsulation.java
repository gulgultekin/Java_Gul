package day50_Polymorphism;

public class Encapsulation {

    private String userName = "Cybertek";

   // private final String userName = "Cybertek";  final olsaydi sadece getter olur, setter olmaz

    public String getUserName(){ // read only
        return userName;
    }

    public void setUserName(String userName){  // write only
        this.userName = userName;
    }


}


class Test{

    public static void main(String[] args) {


        Encapsulation obj = new Encapsulation();
        //System.out.println(obj.userName); //getter lazim
        System.out.println(obj.getUserName());

        obj.setUserName("MIT");
        System.out.println(obj.getUserName());// instance method objeye ait old icin obje adiyla cagiriyoruz






    }
}