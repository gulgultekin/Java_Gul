package day40_Encapsulation;

public class Person {

    public String name;

    private long SSN;
    private int ID;

    public Person(String name){
        this.name = name;

    }

    public long getSSN(){
        return SSN;
    }

    public void setSSN(long SSN){
        this.SSN = SSN;
    }

    public long getID(){
        return ID;
    }

    public void setID(int ID){
        this.ID =ID;
    }

    public void setSSNAndID(long SSN,int ID){ // boyle ikiside birlikte yazilabilir ama tek tek prefered way

        setSSN(SSN);
        setID(ID);// bununla asagidaki yazilis ayni sey demek
//        this.SSN = SSN;
//        this.ID =ID;

    }




}
