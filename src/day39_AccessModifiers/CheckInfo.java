package day39_AccessModifiers;

public class CheckInfo {

    public static void main(String[] args) {

        System.out.println("Name is: "+PersonalInfo.name);
        System.out.println("Gender is: "+PersonalInfo.gender);
       // System.out.println("Grade is: "+PersonalInfo.grade); // private old icin direct cagiramiyoruz -
                                                     // only accesible within the class
       // System.out.println("SSN is: "+PersonalInfo.SSN);
       // System.out.println("ID is: "+PersonalInfo.ID);
        System.out.println("Age is: "+PersonalInfo.age); // default access modifier

        PersonalInfo obj = new PersonalInfo();
        System.out.println(obj.name);
        System.out.println(obj.age); // default access modifier
        System.out.println(obj.gender);
       //  System.out.println(obj.SSN); // obje olarakta private bilgiler cagirilamaz




    }


}
